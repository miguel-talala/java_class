import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2026-02-22");
        LocalDateTime d02 = LocalDateTime.parse("2025-10-07T02:30:40");
        Instant d03 = Instant.parse("2025-10-07T12:30:40Z");
        //Calculo Local Date
        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeekLocalDate = d01.plusWeeks(1);
        //Calculo Local Date Time
        LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d02.plusWeeks(1);
        //Calculo Instant
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus( 7,ChronoUnit.DAYS);
        //Duration
        Duration duration1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());//Setting to LocalDateTime
        Duration duration2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration duration3 = Duration.between(pastWeekInstant, d03);
        Duration duration4 = Duration.between(d03, pastWeekInstant);
        //Prints
        System.out.println("Past Week Local Date =>"+pastWeekLocalDate);
        System.out.println("Next Week Local Date  =>" + nextWeekLocalDate);
        System.out.println("Past Week Local Date Time =>"+pastWeekLocalDateTime);
        System.out.println("Next Week Local Date Time =>" + nextWeekLocalDateTime);
        System.out.println("Past Week Instant => " + nextWeekInstant);
        System.out.println("Next Week Instant =>" + nextWeekInstant);
        System.out.println("Duration d01 and Past Week Date Time =>"+ duration1.toDays());
        System.out.println("Duration d02 and Past Week LocalDateTime =>"+ duration2.toDays());
        System.out.println("Duration d03 and Past Week Instant => " + duration3.toDays());
        System.out.println("Duration d02 and Past Week LocalDateTime Reversed  =>" + duration4.toDays());

    }
}
