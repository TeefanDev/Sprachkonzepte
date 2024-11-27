import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public class StaticSemanticsChecker extends OpeningHoursParserBaseListener {
    private final List<String> errors = new ArrayList<>();

    @Override
    public void exitDateRange(OpeningHoursParser.DateRangeContext ctx) {
        String startDate = ctx.DATE(0).getText();
        String endDate = ctx.DATE(1).getText();

        if (!isValidDate(startDate) || !isValidDate(endDate)) {
            errors.add("Ungültiges Datum im Bereich: " + startDate + " bis " + endDate);
        }
    }

    @Override
    public void exitOpeningRule(OpeningHoursParser.OpeningRuleContext ctx) {
        if (ctx.TIME().size() == 2) {
            String startTime = ctx.TIME(0).getText();
            String endTime = ctx.TIME(1).getText();

            if (!isValidTimeRange(startTime, endTime)) {
                errors.add("Ungültiger Zeitraum: " + startTime + " bis " + endTime);
            }
        }
    }

    private boolean isValidDate(String date) {
        // Dummy-Implementierung zur Prüfung eines gültigen Datums
        return true; // Datumvalidierung muss hier noch implementiert werden
    }

    private boolean isValidTimeRange(String startTime, String endTime) {
        return startTime.compareTo(endTime) <= 0;
    }

    public List<String> getErrors() {
        return errors;
    }
}
