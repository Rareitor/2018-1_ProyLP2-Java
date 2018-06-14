package Reportes;

import java.sql.*;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class GenerarReporte {

    public GenerarReporte() {
        System.out.println("Generando jasper report...");
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
//            
//            String jrxml_path = "./src/Reportes/reporteOrdenes.jrxml";
//            String jasper_path = "./src/Reportes/reporteOrdenes.jasper";
//            String pdf_path = "./src/Reportes/reporteOrdenes.pdf";
//     
//            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile (GenerarReporte.class.getResource(jasper_path).getFile());
//            HashMap hm = new HashMap();
//            hm.put("parametroTitulo", "j");
//            JasperPrint impresion = JasperFillManager.fillReport(jr, null, con);
//            JasperViewer viewer = new JasperViewer(impresion);
//            viewer.setVisible(true);
//  
////            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile (jrxml_path);
////            HashMap hm = new HashMap();
////            hm.put("parametroTitulo", "j");
////            JasperPrint impresion = JasperFillManager.fillReport(jr, null, con);
////            JasperViewer viewer = new JasperViewer(impresion);
////            viewer.setVisible(true);
//               
////            JasperCompileManager.compileReportToFile(jrxml_path, jasper_path);
////            HashMap hm = new HashMap();
////            hm.put("parametroTitulo", "j");
////            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasper_path, hm, con);
////            JasperExportManager.exportReportToPdfFile(jprint, pdf_path);
//
//
//            System.out.println("Reporte generado!");
//            con.close();
        }
        catch (Exception e){
            System.out.println("Excepcion :( ");
            e.getMessage();
        }
    }
    
    public void reporteOrden(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            JasperReport jasperReport = JasperCompileManager.compileReport("./src/Reportes/reporteOrdenes.jrxml");
            JRDataSource jrDataSource = new JREmptyDataSource();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,null,con);
            JasperViewer viewer = new JasperViewer(jasperPrint);
            viewer.setVisible(true);
            con.close();
        } catch (Exception e){
            System.out.println("Excepciom 2 :(");
            System.out.println(e.getMessage());
        }
        
    }
    
    public void reportePagoComisionistas(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            JasperReport jasperReport = JasperCompileManager.compileReport("./src/Reportes/reporteComisionistas.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,null,con);
            JasperViewer viewer = new JasperViewer(jasperPrint);
            viewer.setVisible(true);
            con.close();
        } catch (Exception e){
            System.out.println("Excepciom 3 :(");
            System.out.println(e.getMessage());
        }
    }
    
}
