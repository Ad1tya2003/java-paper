import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter frm = DateTimeFormatter
                .ofPattern("dd MMM yyyy HH:mm:ss");
        ZonedDateTime zdt = dt.atZone(ZoneId.of("Australia/Sydney"));
        System.out.println("Australia zoned date time " + frm.format(zdt));

        ZoneId zid = ZonedDateTime.now().getZone();
        System.out.println("Zone id :" + zid);

        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("Time now " + frm.format(zdt2));

    }
}