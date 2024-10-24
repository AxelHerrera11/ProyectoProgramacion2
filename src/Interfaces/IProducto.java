package Interfaces;

import Modelo.ModeloProductos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public interface IProducto {
    public boolean guardarProducto(ModeloProductos modelo);
    public ImageIcon seleccionarImagen();
    public DefaultComboBoxModel mostrarCategoriaProducto();
    public int consultarNoCodigoBarras();
}
