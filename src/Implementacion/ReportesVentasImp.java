package Implementacion;

import Interfaces.IReportesVenta;
import Modelo.ModeloReportesVentas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhosu
 */
public class ReportesVentasImp implements IReportesVenta {

    @Override
    public ModeloReportesVentas mostrarVentas(ModeloReportesVentas modelo) {

//        ModeloReportesVentas modelo = new ModeloReportesVentas();
    
    return modelo;
    }

    @Override
    public DefaultTableModel modeloReportesVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
