package Conector;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    // DEFINIR LAS PROPIEDADES DE LA CONEXIÓN
    private static final String CLASE = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/db_citas?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Elperrito2947,++";
    private final String BASEDATOS = "db_la_torre";
    private final String HOST = "localhost:3306";
    private final String URL;
    
    private Connection link;
    private PreparedStatement ps;
    
    public DBConnection(){
        this.URL = "jdbc:mysql://" + this.HOST + "/" + this.BASEDATOS;
    }
    
    // ESTABLECER LA CONEXIÓN
//    public static Connection getConnection() {
//    
//        Connection conn = null;
//        
//        try {
//            conn = DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (SQLException e) {
//            System.out.println("Error en la conexión de BD: " + e.getMessage());
//        }
//        
//        return conn;
//        
//    }
    
    public void conectar(){
        
        try {
            Class.forName(CLASE).getDeclaredConstructor().newInstance();
            this.link = DriverManager.getConnection(this.URL, this.USER,this.PASSWORD);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }
    
    public void desconectar(){
        try {
            this.link.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public PreparedStatement preparar(String sql){
        try {
            ps = link.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ps;
    }
    
    public void mensaje(String mensaje, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }
    
}
