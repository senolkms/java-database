// import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String name="root";
    private String password="6116";
    private String dbUrl="jdbc:mysql://localhost:3306/sakila";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,name,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error kodu: "+exception.getErrorCode());
    }
}


