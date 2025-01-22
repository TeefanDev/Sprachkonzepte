import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OpeningHoursInterpreter {
    private final List<Location> locations;
    private static final String TIME_FORMAT = "HH:mm";
    private static final String DATE_FORMAT = "dd.mm";

    private static final List<String> DAYS_OF_WEEK = Arrays.asList(
        "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"
    );

    public OpeningHoursInterpreter(List<Location> locations) {
        System.out.println("Creating OpeningHoursInterpreter with " + locations.size() + " locations");
        this.locations = locations;
    }

    public List<String> getOpenLocations(String day, String date, String time) {
        List<String> openLocations = new ArrayList<>();
        for (Location location : locations) {
            System.out.println("Checking " + location.name);
            if (isLocationOpen(location, day, date, time)) {
                openLocations.add(location.name);
            }
        }
        return openLocations;
    }

    public boolean isOpen(String locationName, String day, String date, String time) {
        for (Location location : locations) {
            if (location.name.equalsIgnoreCase(locationName) && isLocationOpen(location, day, date, time)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLocationOpen(Location location, String day, String date, String time) {
        for (DateRange dateRange : location.dateRanges) {
            if (isWithinDateRange(dateRange, date) && isValidTimeRange(dateRange.startTime, dateRange.endTime, time) && isValidDay(dateRange, day)) {
                System.out.println(location.name + " is open on " + date + " at " + time);
                return true;
            }
        }
        System.out.println(location.name + " is closed on " + date + " at " + time);
        return false;
    }

    private boolean isWithinDateRange(DateRange dateRange, String checkDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            Date start = sdf.parse(dateRange.startDate);
            Date end = sdf.parse(dateRange.endDate);
            Date check = sdf.parse(checkDate);
            return !check.before(start) && !check.after(end);
        } catch (ParseException e) {
            return false;
        }
    }

    public boolean isValidDay(DateRange dateRange, String day) {
        if (!DAYS_OF_WEEK.contains(day)) {
            System.err.println("Invalid day: " + day);
            return false;
        }

        int startDayIndex = DAYS_OF_WEEK.indexOf(dateRange.startDay);
        int endDayIndex = DAYS_OF_WEEK.indexOf(dateRange.endDay);
        int dayIndex = DAYS_OF_WEEK.indexOf(day);

        if (startDayIndex <= endDayIndex) {
            return dayIndex >= startDayIndex && dayIndex <= endDayIndex;
        } else {
            return dayIndex >= startDayIndex || dayIndex <= endDayIndex;
        }
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
