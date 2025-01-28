package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

class Events {
    public final String name;
    public final LocalDateTime dateTime;
    public final Duration duration;
    public Events(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("\"%s\", %s, %s",
                name,
                dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")),
                duration.toHours() + " hour(s)");
    }
}
public class TaskScheduling {
    public static void main(String []args){
        List<Events> e = List.of(
                new Events("Meeting", LocalDateTime.of(2025, 1, 28, 10, 0), Duration.ofHours(1)),
                new Events("Workshop", LocalDateTime.of(2025, 1, 28, 13, 0), Duration.ofHours(2)),
                new Events("Presentation", LocalDateTime.of(2025, 1, 29, 9, 30), Duration.ofHours(1))
        );

        System.out.println("Events list:");
        e.forEach(System.out::println);
        LocalDate d= LocalDate.of(2025,1,28);

        System.out.println("\nEvents on " + d + ":");
        e.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(d))
                .forEach(event -> System.out.println("\"" + event.getName() + "\""));

        System.out.println("\nDuration between consecutive events:");
        for (int i=0;i<e.size()-1;i++) {
            Events c = e.get(i);
            Events n= e.get(i + 1);

            long minutesBetween = Duration.between(c.getDateTime(), n.getDateTime()).toMinutes();
            System.out.printf("Time between \"%s\" and \"%s\": %d hours and %d minutes%n",
                    c.getName(), n.getName(), minutesBetween / 60, minutesBetween % 60);
        }
    }
}
