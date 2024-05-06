import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class datetime {
public static void main(String[] args) {
LocalDate ld=LocalDate.now();
System.out.println(ld);
ld=LocalDate.of(2023, Month.APRIL,9);
System.out.println(ld);
ld=LocalDate.of(2023, 04,9);
System.out.println(ld);
// ld=LocalDate.parse("2022-04-10");
System.out.println(ld);

System.out.println(ld.getYear());
System.out.println(ld.getDayOfWeek());
System.out.println(ld.getMonth());
System.out.println(ld.getMonthValue());

System.out.println(ld.isLeapYear());
ld=LocalDate.parse("2022-04-10");
System.out.println(ld.isLeapYear());
}
}