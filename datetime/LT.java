import java.time.LocalTime;

public class LT {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        lt = LocalTime.of(10, 14);
        System.out.println(lt);
        lt = LocalTime.of(10, 14, 25);
        System.out.println(lt);
        lt = LocalTime.of(10, 14, 24, 147);
        System.out.println(lt);
        lt = LocalTime.parse("9:15:24:123");
        System.out.println(lt);

    }
}