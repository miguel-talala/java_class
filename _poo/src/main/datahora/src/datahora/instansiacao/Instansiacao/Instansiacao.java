package datahora.instansiacao.Instansiacao;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instansiacao {

    public static void main(String[] args) {
        //Instanciação
        DateTimeFormatter fd01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Setting date pattern day/month/year
        DateTimeFormatter fd02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now();//data de hoje
        LocalDateTime d02 = LocalDateTime.now();//data de hoje com horario
        Instant d03 = Instant.now();//data de agora no fuso de Londres(GMT/UTC)
        LocalDate d04 = LocalDate.parse("2026-11-16");//Data local com dia especificado
        LocalDateTime d05 = LocalDateTime.parse("2026-11-16T01:25:54");//data local com dia e hora especificado
        Instant d06 = Instant.parse("2026-11-16T01:25:54Z");//data e hora especificado no fuso de Londres(GMT/UTC)
        Instant d07 = Instant.parse("2026-11-16T01:25:54-03:00");//data e hora especifico com o fuso de -03:00 em relação ao GMT.
        LocalDate d08 = LocalDate.parse("10/02/2026", fd01);//formated date
        LocalDateTime d09 = LocalDateTime.parse("10/02/2026 01:30", fd02);//formated date with hours
        LocalDate d10 = LocalDate.of(2026, 2, 10);
        LocalDateTime d11 = LocalDateTime.of(2026, 2, 10, 8, 19);
        IO.println(d01.toString());
        IO.println(d02.toString());
        IO.println(d03.toString());
        IO.println(d04.toString());
        IO.println(d05.toString());
        IO.println(d06.toString());
        IO.println(d07.toString());
        IO.println(d08.toString());
        IO.println(d09.toString());
        IO.println(d10.toString());
        IO.println(d11.toString());
    }

}
