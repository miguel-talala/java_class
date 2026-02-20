import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-10-02");
        LocalDateTime d02 = LocalDateTime.parse("2025-10-07T02:30:40");
        Instant d03 = Instant.parse("2025-10-07T12:30:40Z");

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatModel = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatModelTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatInstant =   DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        System.out.println("d01 = " + formatModel.format(d01));
        System.out.println("d01 = " + d01.format(formatModel));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        //Date Time
        System.out.println("d02 = " + d02.format(formatModelTime));
        //Instant
        System.out.println("d03 = " + formatInstant.format(d03));
    }
}
