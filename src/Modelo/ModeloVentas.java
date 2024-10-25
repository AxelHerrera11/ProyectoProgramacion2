package Modelo;

import Vistas.PanelVentas;
import java.sql.Date;
import java.sql.Time;

public class ModeloVentas {
    PanelVentas vistaVentas;
    private int noCodidgoBarras;
    private int cantidadProducto;
    private String nombreProducto;
    private double precioNormal;
    private double percioPromocion;
    private byte[] imagenProducto;
    private String nitCliente;
    private String nombreCliente;
    
    private int idVendedor;
    private int tipoPago;
    private Date fecha;
    private Time hora;
    private Double totalVenta;
    private Double iva;
    private int idCliente;

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

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
