package CollageManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String host = "jdbc:sqlite:universityDB.db";
   
    private static final String user = "admin297";
    private static final String pass = "spagnola";

    public static Connection Connect() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(host);

        } catch (SQLException ex) {
            System.out.println("error in connection " + ex.getMessage());
        }

        return con;
    }

}
