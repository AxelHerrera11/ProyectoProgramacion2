package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IInicioSesion;
import Modelo.ModeloInicioSesion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InicioSesionImp implements IInicioSesion{

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public ModeloInicioSesion consultarUsuario(String usuario, String contrasenia) {
        ModeloInicioSesion modelo = new ModeloInicioSesion();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_USUARIO());
            
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                modelo.setUsuarioEncontrado(rs.getString("nombre_usuario"));
                modelo.setContraseniaEncontrada(rs.getString("contrasenia_usuario"));
                modelo.setTipoUsuario(Integer.parseInt(rs.getString("tipo_usuario")));
                System.out.println(Integer.parseInt(rs.getString("tipo_usuario")));
            }
            conector.desconectar();
                
            
        } catch (Exception e) {
            conector.mensaje(e.getMessage(), "Error en la consulta", 0);
        }
        return modelo;
    }
    
}
