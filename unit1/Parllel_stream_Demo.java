import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Emp {
    String empname;
    int sal;

    Emp(String empname, int sal) {
        this.empname = empname;
        this.sal = sal;
    }

    public String getEmpName() {
        return this.empname;
    }

    public int getSal() {
        return sal;
    }

}

public class Parllel_stream_Demo {
    public static void main(String[] args) {
        // System.out.println("Sequencial Stream");
        // IntStream is=IntStream.rangeClosed(1,10);
        // is.forEach(System.out::println);
        //
        // System.out.println("Parallel Method Stream");
        // IntStream is1=IntStream.rangeClosed(1,10);
        // is1.parallel().forEach(System.out::println);

        List<Emp> e = Arrays.asList(
                new Emp("Rohan", 25000),
                new Emp("Mohan", 15000),
                new Emp("Sohan", 35000),
                new Emp("Kamal", 20000),
                new Emp("Sunil", 5000),
                new Emp("Kumar", 18000));

        System.out.println("Sequencial Stream");
        e.stream().filter(e1 -> e1.getSal() >= 15000)
                .limit(3)
                .forEach(t -> System.out.println("Name :" + t.empname + " Salary :" + t.getSal()));

        System.out.println("Parallel method Stream");
        e.stream().parallel().filter(e1 -> e1.getSal() >= 15000)
                .limit(3)
                .forEach(t -> System.out.println("Name :" + t.empname + " Salary :" + t.getSal()));

        System.out.println("Parallel method Stream");
        e.parallelStream().filter(e1 -> e1.getSal() >= 15000)
                .limit(3)
                .forEach(t -> System.out.println("Name :" + t.empname + " Salary :" + t.getSal()));
    }

}