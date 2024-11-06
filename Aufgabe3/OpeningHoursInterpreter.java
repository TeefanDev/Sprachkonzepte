import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class OpeningHoursInterpreter {
    
    // Klasse zur Repräsentation der Öffnungszeit eines Betriebs
    static class OpeningHours {
        DayOfWeek startDay;
        DayOfWeek endDay;
        LocalTime startTime;
        LocalTime endTime;

        public OpeningHours(DayOfWeek startDay, DayOfWeek endDay, LocalTime startTime, LocalTime endTime) {
            this.startDay = startDay;
            this.endDay = endDay;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        // Methode, um zu prüfen, ob ein bestimmter Zeitpunkt in den Öffnungszeiten liegt
        public boolean isOpen(LocalDate date, LocalTime time) {
            DayOfWeek day = date.getDayOfWeek();
            
            boolean isWithinDays = (day.compareTo(startDay) >= 0 && day.compareTo(endDay) <= 0);
            boolean isWithinTime = (time.compareTo(startTime) >= 0 && time.compareTo(endTime) <= 0);

            return isWithinDays && isWithinTime;
        }
    }

    public static void main(String[] args) {
        // Beispiel-Öffnungszeiten: Montag bis Freitag, 9:00 bis 17:00 Uhr
        OpeningHours hours = new OpeningHours(DayOfWeek.MONDAY, DayOfWeek.FRIDAY, 
                                              LocalTime.of(9, 0), LocalTime.of(17, 0));

        // Teste die dynamische Semantik mit einem Beispielzeitpunkt
        LocalDate dateToCheck = LocalDate.of(2024, 10, 17); // Ein Donnerstag
        LocalTime timeToCheck = LocalTime.of(10, 30);       // 10:30 Uhr

        if (hours.isOpen(dateToCheck, timeToCheck)) {
            System.out.println("Das Geschäft ist zu diesem Zeitpunkt geöffnet.");
        } else {
            System.out.println("Das Geschäft ist zu diesem Zeitpunkt geschlossen.");
        }
    }
}
