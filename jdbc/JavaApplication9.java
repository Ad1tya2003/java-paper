import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class JavaApplication9 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String pwd = "#Aditya7861235";
            Connection c = DriverManager.getConnection(url, user, pwd);
            String q = "create table student( rollno int(5),"
                    + "name varchar(20), fee int (6))";

            Statement stmt = c.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
