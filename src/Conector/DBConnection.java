package Conector;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    private static final String CLASE = "com.mysql.jdbc.Driver";
    private final String HOST = "127.0.0.1";
    private final String USUARIO = "root";
    private final String CLAVE = "Elperrito2947,++";
    private final String BASEDATOS = "db_la_torre";
    private final String URL;
    
    private Connection link;
    private PreparedStatement ps;
    
    public DBConnection(){
        this.URL = "jdbc:mysql://" + this.HOST + "/" + this.BASEDATOS;
    }
    
    public void conectar(){
        
        try {
//            Class.forName(CLASE).getDeclaredConstructor().newInstance();
            this.link = DriverManager.getConnection(this.URL, this.USUARIO,this.CLAVE);
            
        } catch (IllegalArgumentException | SecurityException | SQLException ex) {
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
