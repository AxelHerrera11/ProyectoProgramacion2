package Modelo;

import Vistas.PanelReportesVentas;
import java.sql.Date;

public class ModeloReportesVentas {

    PanelReportesVentas vistaReportesVentas;

    private String nombreVendedor;
    private int tipoPago;
    private String nombreCliente;
    private Date fechaVenta;

    public ModeloReportesVentas() {
    }

    public ModeloReportesVentas(PanelReportesVentas vistaReportesVentas) {
        this.vistaReportesVentas = vistaReportesVentas;
    }

    public PanelReportesVentas getVistaReportesVentas() {
        return vistaReportesVentas;
    }

    public void setVistaReportesVentas(PanelReportesVentas vistaReportesVentas) {
        this.vistaReportesVentas = vistaReportesVentas;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    

}
