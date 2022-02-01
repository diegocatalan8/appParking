
package Conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class ConnectDB {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "guitarras99D";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Satisfactoria.");
        } catch (Exception e) {
            System.out.println("Conexion Fallida.");
            System.out.println(e.getMessage());
        }

        return conn;
    }    
}
