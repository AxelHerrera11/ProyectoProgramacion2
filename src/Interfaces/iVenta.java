package Interfaces;

import Modelo.ModeloVentas;
import javax.swing.DefaultComboBoxModel;

public interface iVenta {
    public ModeloVentas mostrarProducto(int noCodBar);
    public DefaultComboBoxModel mostrarTipoPago();
    public ModeloVentas mostrarCliente(String nitCliente);
    public boolean guardarVenta(ModeloVentas modelo);
    public int buscarCantidad (int idProducto);
    public boolean actualizarCantidad(ModeloVentas modelo);
    public int utimaVenta();
    public boolean guardarDetalleVenta(ModeloVentas modelo);
}
