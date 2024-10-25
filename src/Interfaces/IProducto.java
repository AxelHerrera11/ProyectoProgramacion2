package Interfaces;

import Modelo.ModeloProductos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public interface IProducto {
    public boolean guardarProducto(ModeloProductos modelo);
    public ImageIcon seleccionarImagen();
    public DefaultComboBoxModel mostrarCategoriaProducto();
    public int consultarNoCodigoBarras();
    public ModeloProductos mostrarProducto(int idProducto);
    public boolean actualizarProducto(ModeloProductos modelo);
    public boolean eliminarProducto(int idProducto);
    public boolean eliminarImagen(int idProducto);
    public boolean actualizarImagenProducto(ModeloProductos modelo);
    public boolean insertarGestionInventario(ModeloProductos modelo);
    public int consultaUltimoProducto();
}
