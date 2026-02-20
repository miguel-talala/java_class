import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Formatters
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //intansiacao com data-hora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2027-11-15");
        LocalDateTime d05 = LocalDateTime.parse("2027-11-15T16:35:51");
        Instant d06 = Instant.parse("2027-11-15T16:35:51Z");
        Instant d07 = Instant.parse("2027-11-15T16:35:51-03:00");
        LocalDate d08 = LocalDate.parse("16/11/2025", format);
        LocalDateTime d09 = LocalDateTime.parse("15/11/2006 01:30", formatTime);

        LocalDate d10 = LocalDate.of(2026, 7, 30);
        LocalDateTime d11 = LocalDateTime.of(2026, 7, 30, 14,00 );
        //Prints
        System.out.println("d01 = " + d01);
        System.out.println("d02 = "  + d02);
        System.out.println("d03 = "  + d03);
        System.out.println("d04 = "  + d04);
        System.out.println("d05 = "  + d05);
        System.out.println("d06 = "  + d06);
        System.out.println("d07 = "  + d07);
        System.out.println("d08 = "  + d08);
        System.out.println("d09 = "  + d09);
        System.out.println("d010 = "  + d10);
        System.out.println("d011 = "  + d11);
    }
}