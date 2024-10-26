package Interfaces;

import Modelo.ModeloReportesVentas;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhosu
 */
public interface IReportesVenta {
    
    public Modelo.ModeloReportesVentas mostrarVentas(ModeloReportesVentas modelo);
    public DefaultTableModel modeloReportesVentas(String fecha);
    
    public ModeloReportesVentas exportarPDF(String nombreVendedor, String tipoPago, String nombreCliente, String fechaVenta);
    public void exportarPDFREPORTE();
    public ModeloReportesVentas exportarExcelResportes();
    public void exportarReporteDeVentas(Date fecha);
    
}
