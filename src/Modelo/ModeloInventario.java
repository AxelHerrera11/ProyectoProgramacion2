package Modelo;

import Vistas.PanelInventario;

public class ModeloInventario {
    PanelInventario vistaInventario;
    private int idGestion;
    private String nombreGestion;
    private int cantidadGestion;
    private String fechaGestion;
    private String usuarioGestion;
    private String productoGestion;

    public ModeloInventario() {
    }

    public ModeloInventario(PanelInventario vistaInventario) {
        this.vistaInventario = vistaInventario;
    }

    public PanelInventario getVistaInventario() {
        return vistaInventario;
    }

    public void setVistaInventario(PanelInventario vistaInventario) {
        this.vistaInventario = vistaInventario;
    }

    public int getIdGestion() {
        return idGestion;
    }

    public void setIdGestion(int idGestion) {
        this.idGestion = idGestion;
    }

    public String getNombreGestion() {
        return nombreGestion;
    }

    public void setNombreGestion(String nombreGestion) {
        this.nombreGestion = nombreGestion;
    }

    public int getCantidadGestion() {
        return cantidadGestion;
    }

    public void setCantidadGestion(int cantidadGestion) {
        this.cantidadGestion = cantidadGestion;
    }

    public String getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(String fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public String getUsuarioGestion() {
        return usuarioGestion;
    }

    public void setUsuarioGestion(String usuarioGestion) {
        this.usuarioGestion = usuarioGestion;
    }

    public String getProductoGestion() {
        return productoGestion;
    }

    public void setProductoGestion(String productoGestion) {
        this.productoGestion = productoGestion;
    }
    
}
