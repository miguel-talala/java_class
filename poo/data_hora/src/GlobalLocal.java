import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalLocal {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.parse("2026-02-22");
        LocalDateTime d02 = LocalDateTime.parse("2026-02-22T02:34:43");
        Instant d03 = Instant.parse("2026-02-22T02:34:43Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));


        //Prints
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


        System.out.println("d01 day = " + d01.getDayOfMonth());
        System.out.println("d01 month = " + d01.getMonthValue());
        System.out.println("d01 year = " + d01.getYear());
        System.out.println("d02 hour = " + d02.getHour());
        System.out.println("d02 minute = " + d02.getMinute());
    }
}

