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
public class RegistroImp implements IRegistro {

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean guardarUsuario(ModeloRegistroUsuario modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getCONSULTA_INSERTAR_USUARIO());

        try {
            ps.setString(1, modelo.getNombreUsuario());
            ps.setString(2, modelo.getContraseniaUsuario());
            ps.setInt(3, modelo.getCategoriaUsuario());
            resultado = ps.execute();
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

            while (rs.next()) {
                modelo.addElement(rs.getString("nombre_tipo_usuario"));
            }

            return modelo;
        } catch (SQLException e) {
            conector.mensaje("Error al cargar los tipos de usuarios", "Error en la conexion", 0);
            return modelo;
        }

    }

//    @Override
//    public boolean elimiarUsuario(ModeloRegistroUsuario modelo) {
//
//        boolean resultado = true;
//        conector.conectar();
//        ps = conector.preparar(sql.getCONSULTA_ELIMINAR_USUARIO());
//
//        try {
//            ps.setString(1, modelo.getNombreUsuario());
//            resultado = ps.execute();
//        } catch (Exception e) {
//            conector.mensaje(e.getMessage(), "Error al eliminar el usuario", 0);
//        }
//       
//        return resultado;
//    }
//    @Override
//    public ModeloRegistroUsuario validarUsuario(ModeloRegistroUsuario modelo) {
//
//        boolean resultado = true;
//        conector.conectar();
//        ps = conector.preparar(sql.getCONSULTA_MOSTRAR_USUARIOS());
//
//        try {
//            ps.setString(1, modelo.getNombreUsuario());
//            ps.setString(2, modelo.getContraseniaUsuario());
//            resultado = ps.execute();
//        } catch (Exception e) {
//            conector.mensaje(e.getMessage(), "Error al eliminar el usuario", 0);
//        }
//        return modelo;
//    }

    @Override
    public boolean elimiarUsuario(String nombreU) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getCONSULTA_ELIMINAR_USUARIO());

        try {
            ps.setString(1, nombreU);
            return ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error al eliminar el usuario", 0);
            return resultado;

        }

    }

//    @Override
//    public boolean validarUsuario(String nombreUser, String Passw) {
//        boolean resultado = true;
//        conector.conectar();
//        ps = conector.preparar(sql.getCONSULTA_MOSTRAR_USUARIOS());
//
//        try {
//            ps.setString(1, nombreUser);
//            ps.setString(2, Passw);
//            return ps.execute();
//        } catch (SQLException e) {
//            conector.mensaje(e.getMessage(), "Error validar", 0);
//            return resultado;
//        }
//    }

    @Override
    public ModeloRegistroUsuario validarUsuario(String nombreU, String contraU) {
        ModeloRegistroUsuario modelo = new ModeloRegistroUsuario();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_MOSTRAR_USUARIOS());
            
            ps.setString(1, nombreU);
          
            rs = ps.executeQuery();
            
            while(rs.next()){
               modelo.setUsuarioEncontrado(rs.getString("nombre_usuario"));
               modelo.setContraseniaEncontrada(rs.getString("contrasenia_usuario"));
            }
            conector.desconectar();
            
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la consulta", 0);
        }
        return modelo;
    
    }

}
