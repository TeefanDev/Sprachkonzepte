import java.util.List;

// Wurzelknoten des Programms
class OpeningHoursProgram {
    List<Location> locations;

    public OpeningHoursProgram(List<Location> locations) {
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

// Repräsentiert einen Zeitraum
class DateRange {
    String startDate;
    String endDate;
    List<OpeningRule> openingRules;

    public DateRange(String startDate, String endDate, List<OpeningRule> openingRules) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.openingRules = openingRules;
    }
}

// Definiert eine Öffnungsregel (Öffnungszeit oder Ruhetag)
abstract class OpeningRule { }

class OpenHoursRule extends OpeningRule {
    String startDay;
    String endDay;
    String startTime;
    String endTime;

    public OpenHoursRule(String startDay, String endDay, String startTime, String endTime) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

class RestDayRule extends OpeningRule {
    String day;

    public RestDayRule(String day) {
        this.day = day;
    }
}
