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
import javax.swing.ImageIcon;

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
    
}
