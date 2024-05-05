import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empid;
    String name;
    int salary;

    Employee(int empid, String name, int sal) {
        this.empid = empid;
        this.name = name;
        salary = sal;
    }
}

public class Filter_Map {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(101, "Rahul", 25000));

        List<Employee> ee = Arrays.asList(
                new Employee(101, "Rahul", 25000),
                new Employee(102, "Ramu", 18000),
                new Employee(103, "Raddy", 15000),
                new Employee(104, "Ayush", 21000),
                new Employee(105, "Akhil", 35000));

        List<Object> collect1 = ee.stream()
                .filter(t -> t.salary > 20000)
                .map(t -> t.salary + (t.salary * 10) / 100)
                .collect(Collectors.toList());
        System.out.println(collect1);

    }
}