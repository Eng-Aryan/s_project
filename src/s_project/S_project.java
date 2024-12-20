
package s_project;
// main class
import java.util.*;
import java.sql.*;

public class S_project {
    public static void main(String[] args) {
        
    
        String url = "jdbc:mysql://localhost:3306/SchoolManagementSystem2";
        String username = "root";
        String password = "Aryan123";

        try {
            // Load MySQL JDBC Driver (optional for Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, username, password);
            
            
            
            System.out.println("Connected to the database!");
            System.out.println("--------------------------");
            
            
            
            
            
            

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found. Add the JDBC driver to your classpath.");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    

        
        
        Scanner scanner = new Scanner(System.in);
    operation o = new operation();
    o.display();
    }
}
