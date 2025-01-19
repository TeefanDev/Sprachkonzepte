import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read input file
        String inputFilePath = "../Aufgabe2/OeffnungszeitenText.txt";
        String input = Files.readString(Path.of(inputFilePath));

        // Lexical and syntactic analysis
        System.out.println("Aufgabe 3a");
        CharStream charStream = CharStreams.fromString(input);
        OpeningHoursLexer lexer = new OpeningHoursLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OpeningHoursParser parser = new OpeningHoursParser(tokens);

        ParseTree tree = parser.openingHoursFile();

        // Static Semantics Check
        StaticSemanticsChecker semanticsChecker = new StaticSemanticsChecker();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(semanticsChecker, tree);

        if (semanticsChecker.getErrors().isEmpty()) {
            System.out.println("Static semantics valid.");
        } else {
            System.out.println("Static semantics errors:");
            semanticsChecker.getErrors().forEach(System.out::println);
        }
        
        System.out.println("--------------------");
        System.out.println("Aufgabe 3b");

        List<Location> locations = new ArrayList<>();
        
        List<OpeningRule> rules = new ArrayList<>();
        rules.add(new OpenHoursRule("Montag", "Freitag", "09:00", "17:00"));
        rules.add(new RestDayRule("Sonntag"));

        List<DateRange> dateRanges = new ArrayList<>();
        dateRanges.add(new DateRange("11.01.", "30.2.", rules));

        locations.add(new Location("Baeckerei Taeglich Brot", dateRanges));
        locations.add(new Location("Supermarkt", dateRanges));

        OpeningHoursInterpreter interpreter = new OpeningHoursInterpreter(locations);

        String day = "Montag";
        String day2 = "Sonntag";
        boolean isOpen = interpreter.isOpen("Baeckerei Taeglich Brot", day, getTimeNow());
        System.out.println("Ist 'Baeckerei Taeglich Brot' am " + day + " um " + getTimeNow() + " geoeffnet? " + isOpen);
        boolean isOpen2 = interpreter.isOpen("Baeckerei Taeglich Brot", day2, getTimeNow());
        System.out.println("Ist 'Baeckerei Taeglich Brot' am " + day2 + " um " + getTimeNow() + " geoeffnet? " + isOpen2);
        System.out.println("Offene Locations " + day + " " + getTimeNow() + ": " + interpreter.getOpenLocations(day, getTimeNow()));
    }

    private static String getTimeNow() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return dtf.format(java.time.LocalTime.now());
    }
}
