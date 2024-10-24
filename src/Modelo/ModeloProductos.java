package Modelo;

import Vistas.PanelProductos;

public class ModeloProductos {
    PanelProductos vistaProductos;
    private int idProducto;
    private String nombreProducto;
    private double precioNormal;
    private double precioPromocion;
    private int cantidad;
    private int categoriaProducto;
    private byte [] codigoBarras;
    private byte [] imagenProducto;
    private int numeroCodigoBarras;

    public ModeloProductos() {
    }

    public ModeloProductos(PanelProductos vistaProductos) {
        this.vistaProductos = vistaProductos;
    }

    public PanelProductos getVistaProductos() {
        return vistaProductos;
    }

    public void setVistaProductos(PanelProductos vistaProductos) {
        this.vistaProductos = vistaProductos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public double getPrecioPromocion() {
        return precioPromocion;
    }

    public void setPrecioPromocion(double precioPromocion) {
        this.precioPromocion = precioPromocion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(int categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public byte[] getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(byte[] codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public byte[] getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(byte[] imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getNumeroCodigoBarras() {
        return numeroCodigoBarras;
    }

    public void setNumeroCodigoBarras(int numeroCodigoBarras) {
        this.numeroCodigoBarras = numeroCodigoBarras;
    }
    
    
}
