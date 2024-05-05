import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendFile {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("C:\\Users\\lenovo\\Desktop\\source\\txt1.txt");
            String s = "Nothing ever goes as planned in this accursed world";
            Files.write(p, System
                    .getProperty("lineseperator", s)
                    .getBytes(),
                    StandardOpenOption.APPEND);
            System.out.println("File Appended..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}