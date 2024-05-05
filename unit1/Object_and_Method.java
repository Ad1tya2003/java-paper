import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Object_and_Method {
    public static void main(String[] args) {

        // 1. group of object
        Stream<Object> empty1 = Stream.empty();
        empty1.forEach(e -> {
            System.out.println(e);
        });

        // 2 array, object and collection
        String name[] = { "raj", "kumar", "reddy", "ramu", "komal" };
        Stream<String> stream2 = Stream.of(name);
        stream2.forEach(e -> {
            System.out.println(e);
        });

        IntStream strm2 = Arrays.stream(new int[] { 10, 20, 15, 17, 35 });
        strm2.forEach(e -> {
            System.out.println(e);
        });

        Stream<String> strm3 = Arrays.stream(new String[] { "CSE", "ECE", "EEE", "CIVIL" });
        strm3.forEach(e -> {
            System.out.println(e);
        });

        // collect of object list set

        List<Integer> list2 = new ArrayList<>();
        list2.add(25);

        List<String> names = Arrays.asList("rajs", "kumars", "reddy", "ramu", "komalas");
        List<String> m1 = names.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
        System.out.println(m1);

        names.stream().forEach(e -> {
            System.out.println(e);
        });

        names.stream().forEach(System.out::println);

        List<Integer> integers1 = Arrays.asList(2, 4, 8, 9, 3, 2, 1);
        List<Integer> collect2 = integers1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect2);

        // sort
        integers1.stream().sorted().forEach(System.out::println);

        // min

        Integer integer3 = integers1.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min :" + integer3);

    }
}