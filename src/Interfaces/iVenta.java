package Interfaces;

import Modelo.ModeloVentas;
import javax.swing.DefaultComboBoxModel;

public interface iVenta {
    public ModeloVentas mostrarProducto(int noCodBar);
    public DefaultComboBoxModel mostrarTipoPago();
    public ModeloVentas mostrarCliente(String nitCliente);
    public boolean guardarVenta(ModeloVentas modelo);
}
