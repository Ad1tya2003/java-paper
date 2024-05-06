import java.time.LocalTime;
import java.time.ZoneId;

public class LT2 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        // System.out.print(lt.getHour());
        // System.out.print(":"+lt.getMinute());
        // System.out.print(":"+lt.getSecond());
        // System.out.print(":"+lt.getNano());

        System.out.println(lt.plusHours(1));
        System.out.println(lt.plusMinutes(30));
        System.out.println(lt.minusHours(1));
        System.out.println(lt.minusSeconds(24));
        System.out.println(lt.minusMinutes(30));

        ZoneId z = ZoneId.of("Australia/Sydney");
        LocalTime ltt = LocalTime.now(z);
        System.out.println("Australia/Sydney : " + ltt);
    }
}