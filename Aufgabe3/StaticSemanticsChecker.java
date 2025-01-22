import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StaticSemanticsChecker extends OpeningHoursParserBaseListener {
    private final List<String> errors = new ArrayList<>();
    private static final String DATE_FORMAT = "dd.MM";

    @Override
    public void exitDateRange(OpeningHoursParser.DateRangeContext ctx) {
        String startTime = ctx.TIME(0).getText();
        String endTime = ctx.TIME(1).getText();
        String startDate = ctx.DATE(0).getText();
        String endDate = ctx.DATE(1).getText();

        if (!isValidDate(startDate) || !isValidDate(endDate)) {
            errors.add("Ungueltiges Datum im Bereich: " + startDate + " bis " + endDate);
        }
        if (!isValidTimeRange(startTime, endTime)) {
            errors.add("Ungueltiger Zeitraum: " + startTime + " bis " + endTime + " Uhr");
        }
    }

    private boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean isValidTimeRange(String startTime, String endTime) {
        return startTime.compareTo(endTime) <= 0;
    }

    public List<String> getErrors() {
        return errors;
    }
}
