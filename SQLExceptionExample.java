import java.sql.*;
import java.util.Scanner;

public class SQLExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter database URL: ");
        String dbUrl = scanner.nextLine();
        System.out.print("Enter SQL query to execute: ");
        String sqlQuery = scanner.nextLine();

        try {
            Connection connection = DriverManager.getConnection(dbUrl, "root", "");
            Statement stmt = connection.createStatement();
            stmt.execute(sqlQuery);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
