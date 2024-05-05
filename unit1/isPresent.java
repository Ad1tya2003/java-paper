import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class isPresent {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 14, 25, 18, 5, 6);
        Optional<Integer> reduce = integers.stream().filter(e -> e % 2 == 1).reduce((x, y) -> x - y);
        if (reduce.isPresent())
            System.out.println(reduce.get());
        else
            System.out.println("Not present");

    }
}