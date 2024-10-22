package Modelo;

import Vistas.VistaVendedor;

public class ModeloVendedor {
    VistaVendedor vistaVendedor;

    public ModeloVendedor() {
    }

    public ModeloVendedor(VistaVendedor vistaVendedor) {
        this.vistaVendedor = vistaVendedor;
    }

    public VistaVendedor getVistaVendedor() {
        return vistaVendedor;
    }

    public void setVistaVendedor(VistaVendedor vistaVendedor) {
        this.vistaVendedor = vistaVendedor;
    }
    
    
}
