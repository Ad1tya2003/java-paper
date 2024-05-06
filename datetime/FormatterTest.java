import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

class FormatterTest {
    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd:MM:yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("dd-MMM-yyyy");

        String s1 = f1.format(d);
        System.out.println(s1);

        System.out.println(f2.format(d));
        System.out.println(f3.format(d));

        SimpleDateFormat f4 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(f4.format(d));

        SimpleDateFormat f5 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        System.out.println(f5.format(d));

        SimpleDateFormat f6 = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(f6.format(d));

        SimpleDateFormat f7 = new SimpleDateFormat("dd MMMM yyyy zzzz");
        System.out.println(f7.format(d));

        SimpleDateFormat f8 = new SimpleDateFormat("dd MMMM yyyy z");
        System.out.println(f8.format(d));

        SimpleDateFormat f9 = new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss z");
        System.out.println(f9.format(d));

        SimpleDateFormat f10 = new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss zzzz");
        System.out.println(f10.format(d));

    }

}