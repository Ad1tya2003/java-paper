import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Distinct_Sorted {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(15);
        num.add(12);
        num.add(15);
        num.add(5);
        num.add(4);
        num.add(9);
        num.add(5);
        num.add(15);

        Stream<Integer> str = num.stream();
        System.out.println(num);
        ;

        str.distinct()
                .sorted()
                .map(e -> e * e)
                // .forEach(e-> System.out.print(e+"\t"));
                .forEach(System.out::println);

        // System.out.println(str);

    }
}