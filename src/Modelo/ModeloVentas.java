package Modelo;

import Vistas.PanelVentas;

public class ModeloVentas {
    PanelVentas vistaVentas;

    public ModeloVentas() {
    }

    public ModeloVentas(PanelVentas vistaVentas) {
        this.vistaVentas = vistaVentas;
    }

    public PanelVentas getVistaVentas() {
        return vistaVentas;
    }

    public void setVistaVentas(PanelVentas vistaVentas) {
        this.vistaVentas = vistaVentas;
    }
    
    
}
