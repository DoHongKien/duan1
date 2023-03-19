package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dohongkien
 */
public class DBConnection {

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ShopPCHT1", "sa", "2003");
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new DBConnection().getConnection());
    }
}
