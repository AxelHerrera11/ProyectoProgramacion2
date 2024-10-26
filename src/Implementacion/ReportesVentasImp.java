package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.IReportesVenta;
import Modelo.ModeloReportesVentas;
import com.itextpdf.text.BaseColor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfPTable;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author jhosu
 */
public class ReportesVentasImp implements IReportesVenta {

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public ModeloReportesVentas mostrarVentas(ModeloReportesVentas modelo) {

//        ModeloReportesVentas modelo = new ModeloReportesVentas();
        return modelo;
    }

//    @Override
//    public DefaultTableModel modeloReportesVentas() {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.setColumnIdentifiers(new Object[]{"Vendedor", "Tipo de Pago", "Cliente", "Fecha de la Venta"});
//        conector.conectar();
//        LocalDate fechaActual = LocalDate.now();
//        Date fecha = Date.valueOf(fechaActual);
//        
//        try {
//            ps = conector.preparar(sql.getCONSULTA_REPORTE_VENTAS());
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                modelo.addRow(new Object[]{
//                    rs.getString("nombre_vendedor"),
//                    rs.getString("nombre_tipo_pago"),
//                    rs.getString("nombre_cliente"),
//                    rs.getString("fecha_venta")});
//            }
//            conector.desconectar();
//
//        } catch (SQLException e) {
//            conector.mensaje(e.getMessage(), "ERROR", 0);
//            conector.desconectar();
//        }
//        return modelo;
//
//    }
    @Override
    public ModeloReportesVentas exportarPDF(String nombreVendedor, String tipoPago, String nombreCliente, String fechaVenta) {
        ModeloReportesVentas modelo = new ModeloReportesVentas();
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes Ventas"));

//            Paragraph nombreV = new Paragraph();
//            Paragraph tipopago = new Paragraph();
//            Paragraph nombreC = new Paragraph();
//            Paragraph fecha = new Paragraph();
//
//            nombreV.setAlignment(Paragraph.ALIGN_LEFT);
//            nombreV.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
//            nombreV.add(nombreVendedor + "\n\n");
//
//            tipopago.setAlignment(Paragraph.ALIGN_LEFT);
//            tipopago.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
//            tipopago.add(tipoPago + "\n\n");
//
//            nombreC.setAlignment(Paragraph.ALIGN_LEFT);
//            nombreC.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
//            nombreC.add(nombreCliente + "\n\n");
//
//            fecha.setAlignment(Paragraph.ALIGN_LEFT);
//            fecha.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
//            fecha.add(fechaVenta + "\n\n");
//
//            documento.open();
//            documento.add(nombreV);
//            documento.add(tipopago);
//            documento.add(nombreC);
//            documento.add(fecha);
            documento.close();
            System.out.println("PDF CREADO");

        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error al crear el PDF " + e.getMessage());
        }
        return modelo;
    }

    @Override
    public ModeloReportesVentas exportarPDFREPORTE() {
        ModeloReportesVentas modelo = new ModeloReportesVentas();
        Document documento = new Document();
        conector.conectar();

        try {
            ps = conector.preparar(sql.getCONSULTA_REPORTE_VENTAS());
            rs = ps.executeQuery();

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes Ventas.pdf"));
            documento.open();
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("VENDEDOR");
            tabla.addCell("TIPO DE PAGO");
            tabla.addCell("CLIENTE");
            tabla.addCell("FECHA DE VENTA");

            
            
            if(rs.next()){
                 do {
                tabla.addCell(rs.getString("nombre_vendedor"));
                tabla.addCell(rs.getString("nombre_tipo_pago"));
                tabla.addCell(rs.getString("nombre_cliente"));
                tabla.addCell(rs.getString("fecha_venta"));

            } while (rs.next());
                
            }
           

            documento.add(tabla);
            JOptionPane.showMessageDialog(null, "Reporte Creado", "REPORTE PDF", JOptionPane.INFORMATION_MESSAGE);
            documento.close();

        } catch (Exception e) {
        }

        return modelo;
    }

    @Override
    public ModeloReportesVentas exportarExcelResportes() {
        ModeloReportesVentas modelo = new ModeloReportesVentas();

        conector.conectar();

        return null;

    }

    @Override
    public DefaultTableModel modeloReportesVentas(String fecha) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Vendedor","Tipo Pago","Cliente","Fecha"});
        conector.conectar();

        try {
            ps = conector.preparar(sql.getCONSULTA_REPORTE_VENTAS());
            ps.setString(1, fecha);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nombre_vendedor"));
                System.out.println(rs.getString("nombre_tipo_pago"));
                System.out.println(rs.getString("nombre_cliente"));
                System.out.println(rs.getDate("fecha_venta"));
                modelo.addRow(new Object[]{
                    rs.getString("nombre_vendedor"),
                    rs.getString("nombre_tipo_pago"),
                    rs.getString("nombre_cliente"),
                    rs.getDate("fecha_venta")
                });

            }

            conector.desconectar();
        } catch (NumberFormatException | SQLException e) {
            conector.mensaje(e.getMessage(), "Error", 0);
            conector.desconectar();

        }

        return modelo;
    }

}
