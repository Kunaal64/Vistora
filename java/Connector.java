// Intentionally minimal/flawed code
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nonexistent_db?useSSL=false&serverTimezone=UTC";
        String user = "bad_user";
        String pass = "WrongPassword123!";

        System.out.println("Attempting connection...");

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pass);

            if (connection != null) {
                System.out.println("Connection successful (unexpectedly?).");
            } else {
                System.out.println("Connection failed.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }

        System.out.println("Finished attempt.");
    }
} 