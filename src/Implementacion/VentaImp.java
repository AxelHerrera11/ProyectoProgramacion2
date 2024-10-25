package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.iVenta;
import Modelo.ModeloVentas;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class VentaImp implements iVenta{

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public ModeloVentas mostrarProducto(int noCodBar) {
        ModeloVentas modelo = new ModeloVentas();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_PRODUCTO_NO_CB());
            ps.setInt(1, noCodBar);
            rs = ps.executeQuery();
            while(rs.next()){
                modelo.setIdProducto(rs.getInt("id_producto"));
                modelo.setNombreProducto(rs.getString("nombre_producto"));
                modelo.setCantidadProducto(Integer.parseInt(rs.getString("cantidad")));
                modelo.setPrecioNormal(Double.parseDouble(rs.getString("precio_normal")));
                modelo.setPercioPromocion(Double.parseDouble(rs.getString("precio_promocional")));
                modelo.setImagenProducto(rs.getBytes("imagen_producto"));
            }
            conector.desconectar();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error", 0);
            conector.desconectar();
        }
        return modelo;
    }
    
    public ImageIcon generarImagen(byte[] codigoBytes, int ancho, int alto) throws IOException{
        ImageIcon pIcon = null;
        ByteArrayInputStream bite = new ByteArrayInputStream(codigoBytes);
        BufferedImage bufferedImage = ImageIO.read(bite);
        pIcon = new ImageIcon(new ImageIcon(bufferedImage).getImage().getScaledInstance(ancho, alto, 0));
        return pIcon;
    }
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    public DefaultTableModel modeloTablaClientes() {
        
        modeloTabla.setColumnIdentifiers(new Object[]{"ID","Producto","Precio","Cantidad","Sub Total"});
        return modeloTabla;
    }
    
    public DefaultTableModel agregarEnTabla(String idProducto, String nombre, String precio, String cantidad, String subTotal){
        modeloTabla.setColumnIdentifiers(new Object[]{"ID","Producto","Precio","Cantidad","Sub Total"});
        modeloTabla.addRow(new Object[]{idProducto, nombre, precio, cantidad, subTotal});
        return modeloTabla;
    }
    
    public DefaultTableModel eliminarEnTabla(int fila){
        modeloTabla.removeRow(fila);
        return modeloTabla;
    }
    
    @Override
    public DefaultComboBoxModel mostrarTipoPago() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_TIPO_PAGO());
            rs = ps.executeQuery();
            while(rs.next()){
                modelo.addElement(rs.getString("nombre_tipo_pago"));
            }
            return modelo;
        } catch (SQLException e) {
            conector.mensaje("Error al cargar los tipso de pago", "Error de conecxion", 0);
            return modelo;
        }
    }

    @Override
    public ModeloVentas mostrarCliente(String nitCliente) {
        ModeloVentas modelo = new ModeloVentas();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_CLIENTE_NIT());
            ps.setString(1, nitCliente);
            rs = ps.executeQuery();
            while(rs.next()){
                modelo.setNombreCliente(rs.getString("nombre_cliente"));
                modelo.setIdCliente(rs.getInt("id_cliente"));
            }
            conector.desconectar();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error", 0);
            conector.desconectar();
        }
        return modelo;
    }

    @Override
    public boolean guardarVenta(ModeloVentas modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_VENTA());
        try {
            ps.setInt(1, modelo.getIdVendedor());
            ps.setInt(2, modelo.getTipoPago());
            ps.setDate(3, modelo.getFecha());
            ps.setTime(4, modelo.getHora());
            ps.setDouble(5, modelo.getTotalVenta());
            ps.setDouble(6, modelo.getIva());
            ps.setInt(7, modelo.getIdCliente());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

    @Override
    public int buscarCantidad(int idProducto) {
        int cantidad = 0;
        try {
            ps = conector.preparar(sql.getCONSULTA_CANTIDAD_PRODUCTO());
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            while(rs.next()){
                cantidad = rs.getInt("cantidad");
            }
            return cantidad;
        } catch (SQLException e) {
            conector.mensaje("Error al consultar la cantidad", "Error de conecxion", 0);
            return cantidad;
        }
    }

    @Override
    public boolean actualizarCantidad(ModeloVentas modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getACTUALIZAR_CAN_AL_RE_VENTA());
        try {
            ps.setInt(2, modelo.getIdProducto());
            ps.setInt(1, modelo.getCantidadProducto());
            
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error al actualizar la cantidad", 0);
        }
        return resultado;
    }

    @Override
    public boolean guardarDetalleVenta(ModeloVentas modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_DETALLE_VENTA());
        try {
            ps.setInt(1, modelo.getIdProducto());
            ps.setDouble(2, modelo.getPrecioVenta());
            ps.setInt(3, modelo.getCantidadVenta());
            ps.setDouble(4, modelo.getSubTotal());
            ps.setInt(5, modelo.getIdVenta());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

    @Override
    public int utimaVenta() {
        int idVenta = 0;
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_ULTIMA_VENTA());
            rs = ps.executeQuery();
            while(rs.next()){
                idVenta = rs.getInt("MAX(id_venta)");
            }
            return idVenta;
        } catch (SQLException e) {
            conector.mensaje("Error al consultar la ulitma venta", "Error de conexion", 0);
            return idVenta;
        }
    }
    
}
