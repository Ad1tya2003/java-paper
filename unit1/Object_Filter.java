import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Object_Filter {
    public static void main(String[] args) {
        List<Product> p = new ArrayList<>();
        p.add(new Product(100, "HP", 5526));
        p.add(new Product(101, "Dell", 4526));
        p.add(new Product(102, "MI", 2526));
        p.add(new Product(103, "MAC", 6526));
        p.add(new Product(104, "iPhone", 8526));
        p.add(new Product(105, "Redmi", 6526));
        // filter on object

        List<Product> x = p.stream().filter(t->t.price > 5000).collect(Collectors.toList());
        x.forEach(e -> System.out.println(e.id + "\t" + e.name + "\t" + e.price));
        p.stream()
                .filter(t -> t.price > 5000)
                .forEach(e -> System.out.println(e.id + "\t" + e.name + "\t" + e.price));
    }
}