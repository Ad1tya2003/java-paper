import java.util.Arrays;
import java.util.List;

public class Peek_and_Count {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10, 25, 25, 35, 10, 29, 58, 2);
        num.stream().peek(System.out::println).count();
    }
}