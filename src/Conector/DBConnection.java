package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    // DEFINIR LAS PROPIEDADES DE LA CONEXIÓN
    private static final String URL = "jdbc:mysql://localhost:3306/db_la_torre?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Elperrito2947,++";
    
    // ESTABLECER LA CONEXIÓN
    public static Connection getConnection() {
    
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión de BD: " + e.getMessage());
        }
        
        return conn;
        
    }
}
