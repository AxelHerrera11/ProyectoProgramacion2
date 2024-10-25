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
            ps.setString(3, modelo.getNit_cliente());
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
            ps.setInt(3, modelo.getCodigo_cliente());
            ps.setString(1, modelo.getNombreCliente());
            ps.setString(2,modelo.getTelefono_Cliente());
            
            return ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error al actualizar", 0);
            return resultado;
        }
        
    }

    @Override
    public boolean eliminarCliente(String nit) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getCONSULTA_ELMINAR_CLIENTE());
        
        try {
            ps.setString(1, nit);
            return ps.execute();
        } catch (Exception e) {
            conector.mensaje("No se pudo eliminar el cliente", "Error al eliminar", 0);
            return resultado;
        }
    }

    @Override
    public DefaultTableModel modeloClientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID Cliente","Nombre Cliente","Teléfono Cliente","NIT Cliente"});
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_CLIENTES());
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                rs.getString("id_cliente"),
                rs.getString("nombre_cliente"),
                rs.getString("telefono_cliente"),
                rs.getString("nit_cliente")});
            }
              conector.desconectar();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "ERROR", 0);
        }   conector.desconectar();
        
        return modelo;
    }

    @Override
    public DefaultTableModel modeloCliente(int codigo_cliente) {
        
        
        return null;
    }

    @Override
    public ModeloClientes mostrarCliente(int codigo_cliente) {
        ModeloClientes modelo = new ModeloClientes();
        conector.conectar();
        
        try {
            ps = conector.preparar(sql.getCONSULTA_CLIENTES_CODIGO());
            ps.setInt(1, codigo_cliente);
            rs = ps.executeQuery();
            
            while(rs.next()){
                modelo.setCodigo_cliente(Integer.parseInt(rs.getString(1)));
                modelo.setNombreCliente(rs.getString(2));
                modelo.setTelefono_Cliente(rs.getString(3));
                modelo.setNit_cliente(rs.getString(4));   
            }
            conector.desconectar();
            
        } catch (NumberFormatException | SQLException e) {
            conector.mensaje(e.getMessage(), "ERROR", 0);
            conector.desconectar();
        }
        
        return modelo;
    }
      
}
