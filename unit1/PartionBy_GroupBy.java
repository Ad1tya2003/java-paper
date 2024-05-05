import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Mobile {
    String model, os;
    int ram;

    Mobile(String m, String os, int r) {
        model = m;
        this.os = os;
        ram = r;
    }
}

public class PartionBy_GroupBy {
    public static void main(String[] args) {
        ArrayList<Mobile> m = new ArrayList<>();
        m.add(new Mobile("Redmi", "Andriod", 8));
        m.add(new Mobile("Nokia", "Windows", 4));
        m.add(new Mobile("ReelMe", "Andriod", 6));
        m.add(new Mobile("One Plus", "Andriod", 8));
        m.add(new Mobile("iPhone 14", "ios", 8));
        m.add(new Mobile("iPhone 11", "ios", 6));

        Map<Boolean, List<Mobile>> mp = m.stream()
                .sorted((m1, m2) -> m2.ram < m1.ram ? 1 : -1)
                .collect(Collectors
                        .partitioningBy(e -> e.os.equals("ios")));

        System.out.println("Partition by");
        List<Mobile> ls1 = mp.get(true);
        for (Mobile i : ls1) {
            System.out.println(i.model + "" + i.os + " " + i.ram);
        }

        Map<String, List<Mobile>> mp1 = m.stream()
                .sorted((m1, m2) -> m1.ram > m2.ram ? 1 : -1)
                .collect(Collectors.groupingBy(e -> e.os));

        System.out.println("Group by");
        List<Mobile> ls = mp1.get("ios");
        for (Mobile i : ls) {
            System.out.println(i.model + "" + i.os + " " + i.ram);
        }

    }
}