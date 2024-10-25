/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IRegistro;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jhosu
 */
public class RegistroImp implements IRegistro{
    
    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    Resultset rs;
    
    
    

    @Override
    public boolean guardarUsuario() {
        
        return false;
    }

    @Override
    public DefaultComboBoxModel mostrarTiposUsuarios() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_MOSTRAR_TIPO_USUARIO());
        } catch (Exception e) {
        }
        
        return null;
    }
    
}
