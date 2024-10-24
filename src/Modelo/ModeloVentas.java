package Modelo;

import Vistas.PanelVentas;

public class ModeloVentas {
    PanelVentas vistaVentas;
    private int noCodidgoBarras;
    private int cantidadProducto;
    private String nombreProducto;
    private double precioNormal;
    private double percioPromocion;
    private byte[] imagenProducto;

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

    public int getNoCodidgoBarras() {
        return noCodidgoBarras;
    }

    public void setNoCodidgoBarras(int noCodidgoBarras) {
        this.noCodidgoBarras = noCodidgoBarras;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public double getPercioPromocion() {
        return percioPromocion;
    }

    public void setPercioPromocion(double percioPromocion) {
        this.percioPromocion = percioPromocion;
    }

    public byte[] getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(byte[] imagenProducto) {
        this.imagenProducto = imagenProducto;
    }
    
    
}
