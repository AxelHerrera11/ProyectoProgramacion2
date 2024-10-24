package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IProducto;
import Modelo.ModeloProductos;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.MSI;

public class ProductoImp implements IProducto{
    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;
    
    String ruta = "";
    BufferedImage pImageCB = null;
    
    public byte[] getImagen(){
        File imagen = new File(ruta);
        byte[] icono;
        try {
            icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
        } catch (Exception e) {
            return null;
        }
        return icono;
    }
    
    public String obtenerRuta(){
        return ruta;
    }
    
    public BufferedImage obtenerImageCB(){
        return pImageCB;
    }
    
    public byte[] obtenerCodigoBarras() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(pImageCB, "png", baos);
        baos.flush();
        byte[] imageBytes = baos.toByteArray();
        baos.close();
        return imageBytes;
    }
    
    public ImageIcon generarCodigoBarras(String numeroCodigoBarras){
        ImageIcon pIconCB = null;
        
        JBarcodeBean pBarcodeBean = new JBarcodeBean();
        pBarcodeBean.setCodeType(new MSI());
        pBarcodeBean.setCode(numeroCodigoBarras);
        
        pImageCB = pBarcodeBean.draw(new BufferedImage(250, 70, BufferedImage.TYPE_INT_RGB));
        
        pIconCB = new ImageIcon(new ImageIcon(pImageCB).getImage().getScaledInstance(250, 70, 0));
        return pIconCB;
    }
    
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
            ps.setInt(8, modelo.getNumeroCodigoBarras());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

    @Override
    public ImageIcon seleccionarImagen() {
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

    @Override
    public DefaultComboBoxModel mostrarCategoriaProducto() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getMOSTRAR_CATEGORIA_PRODUCTO());
            rs = ps.executeQuery();
            while(rs.next()){
                modelo.addElement(rs.getString("nombre_categoria_producto"));
            }
            return modelo;
        } catch (SQLException e) {
            conector.mensaje("Error al cargar las categorias", "Error de conecxion", 0);
            return modelo;
        }
        
    }

    @Override
    public int consultarNoCodigoBarras() {
        int noCodBar = 0;
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_NUMERO_CODIGO_BARRAS());
            rs = ps.executeQuery();
            while(rs.next()){
                noCodBar = rs.getInt("MAX(numero_codigo_barras)");
            }
            return noCodBar;
        } catch (SQLException e) {
            conector.mensaje("Error al consultar el numero de codigo de barras", "Error de conecxion", 0);
            return noCodBar;
        }
    }

    @Override
    public ModeloProductos mostrarProducto(int idProducto) {
        ModeloProductos modelo = new ModeloProductos();
        conector.conectar();
        try {
            ps = conector.preparar(sql.getCONSULTA_PRODUCTO());
        } catch (Exception e) {
        }
        return modelo;
    }
    
}
