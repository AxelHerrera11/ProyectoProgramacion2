package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.ICliente;
import Modelo.ModeloClientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ClienteImp implements ICliente {

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertarCliente(ModeloClientes modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_CLIENTE());
        try {
            ps.setString(1, modelo.getNombreCliente());
            ps.setString(2, modelo.getTelefono_Cliente());
            ps.setString(2, modelo.getNit_cliente());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

    @Override
    public boolean actualizarCliente(ModeloClientes modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getCONSULTA_ACTUALIZAR_CLIENTE());
        try {
            ps.setString(1, modelo.getNit_cliente());
            ps.setString(2, modelo.getNombreCliente());
            ps.setString(3,modelo.getTelefono_Cliente());
            
            return ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error al actualizar", 0);
            return resultado;
        }
        
    }

    @Override
    public boolean eliminarCliente(String nit) {
    
    return false;
    }

    @Override
    public DefaultTableModel modeloClientes() {
        
        
        return null;
    }

    @Override
    public DefaultTableModel modeloCliente(int codigo_cliente) {
        
        
        return null;
    }

    @Override
    public ModeloClientes mostrarCliente(int codigo_cliente) {
        
        
        return null;
    }
    
}
