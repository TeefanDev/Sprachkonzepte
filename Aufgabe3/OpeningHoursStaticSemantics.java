import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class OpeningHoursStaticSemantics extends OpeningHoursBaseListener {
    
    // Beispiel-Variablen zur temporären Speicherung
    private DayOfWeek startDay;
    private DayOfWeek endDay;
    private LocalTime startTime;
    private LocalTime endTime;
    
    // Überprüft, ob die Startzeit vor der Endzeit liegt
    @Override
    public void enterOpeningPeriod(OpeningHoursParser.OpeningPeriodContext ctx) {
        startDay = parseDay(ctx.startDay().getText());
        endDay = parseDay(ctx.endDay().getText());
        startTime = parseTime(ctx.startTime().getText());
        endTime = parseTime(ctx.endTime().getText());

        if (startTime.isAfter(endTime)) {
            System.err.println("Fehler: Startzeit muss vor der Endzeit liegen: " 
                                + startTime + " - " + endTime);
        }

        if (startDay.compareTo(endDay) > 0) {
            System.err.println("Fehler: Starttag muss vor dem Endtag liegen: " 
                                + startDay + " - " + endDay);
        }
    }
    
    // Hilfsmethoden zur Konvertierung von Text in DayOfWeek und LocalTime
    private DayOfWeek parseDay(String dayText) {
        switch(dayText.toLowerCase()) {
            case "montag": return DayOfWeek.MONDAY;
            case "dienstag": return DayOfWeek.TUESDAY;
            case "mittwoch": return DayOfWeek.WEDNESDAY;
            case "donnerstag": return DayOfWeek.THURSDAY;
            case "freitag": return DayOfWeek.FRIDAY;
            case "samstag": return DayOfWeek.SATURDAY;
            case "sonntag": return DayOfWeek.SUNDAY;
            default: throw new IllegalArgumentException("Ungültiger Tag: " + dayText);
        }
    }

    private LocalTime parseTime(String timeText) {
        return LocalTime.parse(timeText); // Erwartet Format "HH:mm"
    }

    public static void main(String[] args) throws Exception {
        // Beispieltext einlesen und Parsen starten
        OpeningHoursLexer lexer = new OpeningHoursLexer(new ANTLRFileStream("example.txt"));
        OpeningHoursParser parser = new OpeningHoursParser(new CommonTokenStream(lexer));
        
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new OpeningHoursStaticSemantics(), parser.openingHours());
    }
}
