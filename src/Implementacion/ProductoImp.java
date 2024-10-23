package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IProducto;
import Modelo.ModeloProductos;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProductoImp implements IProducto{
    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public boolean guardarProducto(ModeloProductos modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getAGREGAR_PRODUCTO());
        try {
            ps.setString(1, modelo.getNombreProducto());
            ps.setInt(2, modelo.getCantidad());
            ps.setDouble(3, modelo.getPrecioNormal());
            ps.setDouble(4, modelo.getPrecioPromocion());
            ps.setBytes(5, modelo.getCodigoBarras());
            ps.setBytes(6, modelo.getImagenProducto());
            ps.setInt(7, modelo.getCategoriaProducto());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

    @Override
    public ImageIcon seleccionarImagen(String ruta) {
        ModeloProductos modelo = new ModeloProductos();
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG", "PNG", "jpg", "png");
        fileChooser.setFileFilter(extensionFilter);
        ImageIcon pIconoProducto = null;
        if(fileChooser.showOpenDialog(modelo.getVistaProductos()) == JFileChooser.APPROVE_OPTION){
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image pImagenProducto = new ImageIcon(ruta).getImage();
            pIconoProducto = new ImageIcon(pImagenProducto.getScaledInstance(250, 250, 0));          
        }
        return pIconoProducto;
    }
    
}
