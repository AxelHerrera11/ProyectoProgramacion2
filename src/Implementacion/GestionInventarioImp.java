package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IGestionInventario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class GestionInventarioImp implements IGestionInventario {

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public DefaultTableModel consultaGestionInventario() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "Gestion", "Cantidad", "Fecha", "Hora", "Usuario", "Producto"});
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTAR_GESTION_INVENTARIO());
            rs = ps.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_gestion_inventario"),
                    rs.getString("nombre_tipo_gestion"),
                    rs.getString("cantidad_gestion"),
                    rs.getString("fecha_gestion"),
                    rs.getString("hora_gestion"),
                    rs.getString("usuario_gestion"),
                    rs.getString("producto_gestion")
                });
            }
            conector.desconectar();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "ERROR", 0);
            conector.desconectar();
        }
        return modelo;
    }

    @Override
    public DefaultTableModel consultaVentas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID", "Usuario", "Tipo de Pago", "Cliente", "Total Venta", "IVA", "Fecha", "Hora"});
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_VENTAS());
            rs = ps.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_venta"),
                    rs.getString("nombre_usuario"),
                    rs.getString("nombre_tipo_pago"),
                    rs.getString("nombre_cliente"),
                    rs.getString("total_venta"),
                    rs.getString("iva"),
                    rs.getString("fecha_venta"),
                    rs.getString("hora_venta")
                });
            }
        } catch (Exception e) {
        }

        return modelo;
    }

}
