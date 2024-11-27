import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.*;
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

        // Dynamic Semantics Example
        OpeningHoursInterpreter interpreter = new OpeningHoursInterpreter();
        // Add sample rules or load from parsed tree
        interpreter.addRule("Restaurant", "Montag", "09:00", "17:00");

        boolean isOpen = interpreter.isOpen("Restaurant", "Montag", "10:00");
        System.out.println("Is Restaurant open at 10:00 on Montag? " + isOpen);
    }
}
