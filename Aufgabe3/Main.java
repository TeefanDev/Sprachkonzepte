import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.*;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read input file
        String inputFilePath = "../Aufgabe2/OeffnungszeitenText.txt";
        String input = Files.readString(Path.of(inputFilePath));

        // Lexical and syntactic analysis
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
        // Dynamic Semantics Example
        OpeningHoursInterpreter interpreter = new OpeningHoursInterpreter();
        interpreter.addRule("Restaurant", "Montag", "09:00", "17:00");

        boolean isOpen = interpreter.isOpen("Restaurant", "Montag", getTimeNow());
        System.out.println("Is Restaurant open at " + getTimeNow() + " on Montag? " + isOpen);
    }

    private static String getTimeNow() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return dtf.format(java.time.LocalTime.now());
    }
}
