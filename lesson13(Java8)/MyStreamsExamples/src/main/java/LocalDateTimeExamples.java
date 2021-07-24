import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.*;

public class LocalDateTimeExamples {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("LocalTime============");
        pw.flush();
        LocalDate now = LocalDate.now();
        pw.println(now);
        pw.flush();
        LocalDate tomorrow = now.plusDays(1);
        pw.println(tomorrow);
        pw.flush();

        LocalDate manualDate = LocalDate.parse("2015-02-20");
        pw.println("Manual" + manualDate);
        pw.flush();
        LocalDate max = LocalDate.MAX;
        pw.println("Max: " + max + " day of the week: " + max.getDayOfWeek());
        pw.flush();
        LocalDate min = LocalDate.MIN;
        pw.println("Min: " + min + " day of the week: " + min.getDayOfWeek());
        pw.flush();

        pw.println("LocalTime============");
        pw.flush();

        pw.println(LocalTime.now());
        pw.flush();

        pw.println("Max: " + LocalTime.MAX);
        pw.flush();
        pw.println("Min: " + LocalTime.MIN);
        pw.flush();

        pw.println("Manual: " + LocalTime.of(16, 59));
        pw.flush();

        LocalTime time1 = LocalTime.NOON;
        pw.flush();
        LocalTime time2 = LocalTime.MIDNIGHT;
        pw.flush();
        pw.println("Is time1 before time 2: " + time1.isBefore(time2));
        pw.flush();

        System.out.println("LocalDateTime===============");

        System.out.println("Max: " + LocalDateTime.MAX);
        System.out.println("Min: " + LocalDateTime.MIN);

        System.out.println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30));

        LocalDateTime date = LocalDateTime.parse("2015-02-20T06:30:00");
        System.out.println(date);

        System.out.println(date.plusDays(1));
        ZoneId zoneId = ZoneId.of("Europe/Paris");
    }
}
