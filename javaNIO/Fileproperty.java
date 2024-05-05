import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fileproperty {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\lenovo\\Desktop\\source\\txt1.txt");

        System.out.println(p);
        System.out.println(p.getFileName());
        System.out.println(p.getName(0));
        System.out.println(p.subpath(1, 2));
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println("Exists or not: " + Files.exists(p));
        System.out.println("Exists or not :" + Files.exists(p, LinkOption.NOFOLLOW_LINKS));
        System.out.println("Exists or not: " + Files.notExists(p));
        System.out.println("Exists or not :" + Files.notExists(p, LinkOption.NOFOLLOW_LINKS));

    }
}