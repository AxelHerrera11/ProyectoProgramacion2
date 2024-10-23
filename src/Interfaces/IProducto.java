package Interfaces;

import Modelo.ModeloProductos;
import javax.swing.ImageIcon;

public interface IProducto {
    public boolean guardarProducto(ModeloProductos modelo);
    public ImageIcon seleccionarImagen(String ruta);
}
