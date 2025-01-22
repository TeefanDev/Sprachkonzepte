import java.util.List;

// Wurzelknoten des Programms
public class OpeningHoursProgram {
    public final List<Location> locations;

    public OpeningHoursProgram(List<Location> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Locations list cannot be null");
        }
        this.locations = locations;
    }
}


// Repräsentiert eine Einrichtung
class Location {
    String name;
    List<DateRange> dateRanges;

    public Location(String name, List<DateRange> dateRanges) {
        this.name = name;
        this.dateRanges = dateRanges;
    }
}

// Repräsentiert einen Zeitraum mit Öffnungszeiten
class DateRange {
    String startDate;
    String endDate;
    String startDay;
    String endDay;
    String startTime;
    String endTime;

    public DateRange(String startDate, String endDate, String startDay, String endDay, String startTime, String endTime) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
