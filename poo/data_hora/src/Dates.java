import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Dates {
    public static void main() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date y1 = Date.from(sdf1.parse("15/11/2006").toInstant());//Date
        Date y2 = Date.from(sdf2.parse("25/07/2025 13:45:43").toInstant());//DateTime
        Date y3 = Date.from(Instant.parse("2025-07-25T13:45:43Z"));//Iso 8601
        Date x1 = new Date();//Horario atual
        Date x2 = new Date(System.currentTimeMillis());//Horario atual com chamada pelos milisegundos
        Date x3 = new Date(0L);//Horario do dia 1 de janeiro de 1970 no horario de greenwich
        Date x4 = new Date(1000L * 60 * 60 * 5);//Passando os milisegundos

        System.out.println("-----------------");
        System.out.println("Default  + format");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("-----------------");
        System.out.println("Local + format");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("-----------------");
        System.out.println("GMT + format");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
    }
}
