import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class CopyFileFromOneLoctOther {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("C:\\Users\\lenovo\\Desktop\\source\\txt1.txt");

            Path ppp = Paths.get("C:\\Users\\lenovo\\Desktop\\dest\\newtest1.txt");
            Path pp = Files.createFile(ppp);

            List<String> s = Files.readAllLines(p);
            Files.write(pp, s);
            System.out.println("File copied from one location to other Location");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}