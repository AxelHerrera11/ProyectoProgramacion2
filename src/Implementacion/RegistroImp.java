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
        
        return false;
    }

    @Override
    public DefaultComboBoxModel mostrarTiposUsuarios() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_MOSTRAR_TIPO_USUARIO());
            rs = ps.executeQuery();
            
          
          return modelo;
        } catch (SQLException e) {
            conector.mensaje("Error al cargar los tipos de usuarios", "Error en la conexion", 0);
        }
        
        return modelo;
    }
}
