import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ASTBuilder extends OpeningHoursParserBaseVisitor<Object> {
    private final List<Location> locations = new ArrayList<>();
    public ASTBuilder() {
        System.out.println("ASTBuilder created!");
    }
    
    @Override
    public OpeningHoursProgram visitOpeningHoursFile(OpeningHoursParser.OpeningHoursFileContext ctx) {
        System.out.println("visitOpeningHoursFile() was called!");
        
        if (ctx == null) {
            System.err.println("Error: OpeningHoursFileContext is null.");
            return null;
        }
    
        for (OpeningHoursParser.OpeningHoursContext locationCtx : ctx.openingHours()) {
            Location location = (Location) visitOpeningHours(locationCtx);
            if (location != null) {
                locations.add(location);
            } else {
                System.err.println("visitOpeningHours returned null for: " + locationCtx.getText());
            }
        }
    
        if (locations.isEmpty()) {
            System.err.println(" Error: No valid locations found.");
            return null;
        }
    
        OpeningHoursProgram program = new OpeningHoursProgram(locations);
        System.out.println("Created OpeningHoursProgram with " + locations.size() + " locations.");
        return program;
    }
    
    @Override
    public Object visitOpeningHours(OpeningHoursParser.OpeningHoursContext ctx) {
        if (ctx == null) {
            System.err.println("visitOpeningHours: Context is null.");
            return null;
        }
        
        if (ctx.location() == null || ctx.location().IDENTIFIER().isEmpty()) {
            System.err.println("visitOpeningHours: No valid location found.");
            return null;
        }
    
        String name = String.join(" ", ctx.location().IDENTIFIER().stream().map(ParseTree::getText).toList());
        System.out.println("Visiting OpeningHours: " + name);
    
        List<DateRange> dateRanges = new ArrayList<>();
        for (OpeningHoursParser.DateRangeContext dateCtx : ctx.dateRange()) {
            DateRange dateRange = (DateRange) visitDateRange(dateCtx);
            if (dateRange != null) {
                dateRanges.add(dateRange);
            } else {
                System.err.println("visitDateRange returned null for: " + dateCtx.getText());
            }
        }
    
        if (dateRanges.isEmpty()) {
            System.err.println("visitOpeningHours: No valid date ranges for " + name);
            return null;
        }
    
        Location location = new Location(name, dateRanges);
        System.out.println("Created Location: " + location.name + " with " + dateRanges.size() + " date ranges");
        return location;
    }
    

    @Override
    public Object visitDateRange(OpeningHoursParser.DateRangeContext ctx) {
        System.out.println("Visiting DateRange: " + ctx.getText());
    
        if (ctx.DATE().size() < 2 || ctx.DAY().size() < 2 || ctx.TIME().size() < 2) {
            System.err.println("Error: Incomplete DateRange: " + ctx.getText());
            return null;
        }
    
        String startDate = ctx.DATE(0).getText();
        String endDate = ctx.DATE(1).getText();
        String startDay = ctx.DAY(0).getText();
        String endDay = ctx.DAY(1).getText();
        String startTime = ctx.TIME(0).getText();
        String endTime = ctx.TIME(1).getText();
    
        DateRange dateRange = new DateRange(startDate, endDate, startDay, endDay, startTime, endTime);
        System.out.println("Created DateRange: " + startDate + " to " + endDate + ", " + startTime + " to " + endTime);
    
        return dateRange;
    }
    
}


public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "../Aufgabe2/OeffnungszeitenText.txt";
        String input = Files.readString(Path.of(inputFilePath));

        // Lexikalische und syntaktische Analyse
        System.out.println("Aufgabe 3a");
        CharStream charStream = CharStreams.fromString(input);
        OpeningHoursLexer lexer = new OpeningHoursLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OpeningHoursParser parser = new OpeningHoursParser(tokens);

        // Fehlerprüfung beim Parsen
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        ParseTree tree = parser.openingHoursFile();
        System.out.println(tree.toStringTree(parser));

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntaxfehler erkannt. Abbruch.");
            return;
        }

        ASTBuilder astBuilder = new ASTBuilder();
        System.out.println("Parser tree structure:");
        System.out.println(tree.toStringTree(parser));
        
        OpeningHoursProgram ast = (OpeningHoursProgram) astBuilder.visitOpeningHoursFile((OpeningHoursParser.OpeningHoursFileContext) tree);

        System.out.println("ASTBuilder finished.");

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

        // Interpreter für die dynamische Semantik
        System.out.println("--------------------");
        System.out.println("Aufgabe 3b");

        if (ast == null) {
            System.err.println("Fehler beim Erstellen des AST. Abbruch.");
            // return;
        }

        OpeningHoursInterpreter interpreter = new OpeningHoursInterpreter(ast.locations);
        System.out.println("Interpreter erstellt.");

        String day = "Dienstag";
        String time = "10:00";
        String date = "20.01";
        List<String> openLocations = interpreter.getOpenLocations(day, date, time);
        System.out.println("Offene Locations am " + date + ", " + day + " um " + time + ": " + openLocations);
    }
}

