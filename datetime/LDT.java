import java.time.LocalDateTime;
import java.time.Month;

public class LDT {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        int y = ldt.getYear();
        int m = ldt.getMonthValue();
        String mm = String.valueOf(ldt.getMonth());
        Month MM = ldt.getMonth();
        int d = ldt.getDayOfMonth();
        System.out.println(y + ":" + m + ":" + d);
        System.out.println(y + ":" + mm + ":" + d);
        System.out.println(y + ":" + MM + ":" + d);
    }
}