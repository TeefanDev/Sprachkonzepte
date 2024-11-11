import java.util.ArrayList;
import java.util.List;

public class OpeningHoursVisitor extends OpeningHoursParserBaseVisitor<Object> {

    @Override
    public OpeningHoursProgram visitOpeningHours(OpeningHoursParser.OpeningHoursContext ctx) {
        List<Location> locations = new ArrayList<>();
        for (OpeningHoursParser.LocationContext locCtx : ctx.location()) {
            locations.add((Location) visitLocation(locCtx));
        }
        return new OpeningHoursProgram(locations);
    }

    @Override
    public Location visitLocation(OpeningHoursParser.LocationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        List<DateRange> dateRanges = new ArrayList<>();
        for (OpeningHoursParser.DateRangeContext dateRangeCtx : ctx.dateRange()) {
            dateRanges.add((DateRange) visitDateRange(dateRangeCtx));
        }
        return new Location(name, dateRanges);
    }

    @Override
    public DateRange visitDateRange(OpeningHoursParser.DateRangeContext ctx) {
        String startDate = ctx.DATE(0).getText();
        String endDate = ctx.DATE(1).getText();
        List<OpeningRule> openingRules = new ArrayList<>();
        for (OpeningHoursParser.OpeningRuleContext ruleCtx : ctx.openingRule()) {
            openingRules.add((OpeningRule) visitOpeningRule(ruleCtx));
        }
        return new DateRange(startDate, endDate, openingRules);
    }

    @Override
    public OpeningRule visitOpeningRule(OpeningHoursParser.OpeningRuleContext ctx) {
        if (ctx.KW_RUHETAG() != null) {
            String day = ctx.DAY().getText();
            return new RestDayRule(day);
        } else {
            String startDay = ctx.DAY(0).getText();
            String endDay = ctx.DAY(1) != null ? ctx.DAY(1).getText() : startDay;
            String startTime = ctx.TIME(0).getText();
            String endTime = ctx.TIME(1).getText();
            return new OpenHoursRule(startDay, endDay, startTime, endTime);
        }
    }
}
