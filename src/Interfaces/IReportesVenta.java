package Interfaces;

import Modelo.ModeloReportesVentas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhosu
 */
public interface IReportesVenta {
    
    public Modelo.ModeloReportesVentas mostrarVentas(ModeloReportesVentas modelo);
    public DefaultTableModel modeloReportesVentas();
    
    
    
}
