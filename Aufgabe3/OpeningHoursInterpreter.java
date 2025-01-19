import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OpeningHoursInterpreter {
    private final List<Location> locations;
    private static final String TIME_FORMAT = "HH:mm";

    public OpeningHoursInterpreter(List<Location> locations) {
        this.locations = locations;
    }

    public List<String> getOpenLocations(String day, String time) {
        List<String> openLocations = new ArrayList<>();
        for (Location location : locations) {
            if (isLocationOpen(location, day, time)) {
                openLocations.add(location.name);
            }
        }
        return openLocations;
    }

    public boolean isOpen(String locationName, String day, String time) {
        for (Location location : locations) {
            if (location.name.equalsIgnoreCase(locationName) && isLocationOpen(location, day, time)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLocationOpen(Location location, String day, String time) {
        for (DateRange dateRange : location.dateRanges) {
            for (OpeningRule rule : dateRange.openingRules) {
                if (rule instanceof OpenHoursRule openRule) {
                    if (openRule.startDay.equals(day) || openRule.endDay.equals(day)) {
                        if (isValidTimeRange(openRule.startTime, openRule.endTime, time)) {
                            return true;
                        }
                    }
                } else if (rule instanceof RestDayRule restRule) {
                    if (restRule.day.equals(day)) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private boolean isValidTimeRange(String startTime, String endTime, String checkTime) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(TIME_FORMAT);
            Date start = sdf.parse(startTime);
            Date end = sdf.parse(endTime);
            Date check = sdf.parse(checkTime);
            return !check.before(start) && !check.after(end);
        } catch (ParseException e) {
            return false;
        }
    }
}
