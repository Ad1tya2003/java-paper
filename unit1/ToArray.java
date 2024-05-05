import java.util.ArrayList;
import java.util.stream.Stream;

class Mobile {
    String name;
    int price;
    int ram;

    Mobile(String n, int p, int r) {
        name = n;
        price = p;
        ram = r;
    }
}

public class ToArray {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung 31", 25000, 8);
        ArrayList<Mobile> mm = new ArrayList<>();
        mm.add(m1);
        mm.add(new Mobile("Ream me", 18000, 6));
        mm.add(new Mobile("iPhone", 88000, 6));
        mm.add(new Mobile("Mi", 8000, 8));
        mm.add(new Mobile("One Plus", 48000, 8));

        Stream<Mobile> strm1 = mm.stream()
                .distinct()
                .sorted((b, a) -> a.price <= b.price ? 1 : -1);
        Object[] a = strm1.toArray();
        for (Object mb : a) {
            Mobile t = (Mobile) mb;
            System.out.println(t.name + "\t" + t.price + "\t" + t.ram);
        }
    }

}