import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class OpeningHoursInterpreter {
    private final Map<String, List<OpeningRule>> schedule = new HashMap<>();

    public void addRule(String location, String day, String startTime, String endTime) {
        schedule.computeIfAbsent(location, k -> new ArrayList<>())
                .add(new OpeningRule(day, startTime, endTime));
    }

    public boolean isOpen(String location, String day, String time) {
        if (!schedule.containsKey(location)) {
            return false;
        }

        for (OpeningRule rule : schedule.get(location)) {
            if (rule.day.equals(day) &&
                rule.startTime.compareTo(time) <= 0 &&
                rule.endTime.compareTo(time) >= 0) {
                return true;
            }
        }

        return false;
    }

    private static class OpeningRule {
        String day;
        String startTime;
        String endTime;

        OpeningRule(String day, String startTime, String endTime) {
            this.day = day;
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
