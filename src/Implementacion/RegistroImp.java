/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IRegistro;
import Modelo.ModeloRegistroUsuario;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jhosu
 */
public class RegistroImp implements IRegistro{
    
    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;
    
    
    

    @Override
    public boolean guardarUsuario(ModeloRegistroUsuario modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_CLIENTE());
        
        try {
            ps.setString(1,modelo.getNombreUsuario());
            ps.setString(2,modelo.getContraseniaUsuario());
            ps.setInt(3,modelo.getCategoriaUsuario());
        } catch (Exception e) {
            conector.mensaje(e.getMessage(), "Error en la insercion del usuario", 0);
        }
        return resultado;
    }

    @Override
    public DefaultComboBoxModel mostrarTiposUsuarios() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_MOSTRAR_TIPO_USUARIO());
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.addElement(rs.getString("nombre_tipo_usuario"));   
            }
          
          return modelo;
        } catch (SQLException e) {
            conector.mensaje("Error al cargar los tipos de usuarios", "Error en la conexion", 0);
            return modelo;
        }
   
    }
    
}