package Vista;

import java.sql.*;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
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
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            
            String jrxml_path = "C:\\Users\\Sebastián\\Documents\\GitHub\\2018-1_ProyLP2-Java\\ProyectoJava\\src\\Reportes\\reporteOrdenes.jrxml";
            String jasper_path = "C:\\Users\\Sebastián\\Documents\\GitHub\\2018-1_ProyLP2-Java\\ProyectoJava\\src\\Reportes\\reporteOrdenes.jasper";
            String pdf_path = "C:\\Users\\Sebastián\\Documents\\GitHub\\2018-1_ProyLP2-Java\\ProyectoJava\\src\\Reportes\\reporteOrdenes.pdf";
     
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile (GenerarReporte.class.getResource(jasper_path).getFile());
            HashMap hm = new HashMap();
            hm.put("parametroTitulo", "j");
            JasperPrint impresion = JasperFillManager.fillReport(jr, null, con);
            JasperViewer viewer = new JasperViewer(impresion);
            viewer.setVisible(true);
  
//            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile (jrxml_path);
//            HashMap hm = new HashMap();
//            hm.put("parametroTitulo", "j");
//            JasperPrint impresion = JasperFillManager.fillReport(jr, null, con);
//            JasperViewer viewer = new JasperViewer(impresion);
//            viewer.setVisible(true);
               
//            JasperCompileManager.compileReportToFile(jrxml_path, jasper_path);
//            HashMap hm = new HashMap();
//            hm.put("parametroTitulo", "j");
//            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasper_path, hm, con);
//            JasperExportManager.exportReportToPdfFile(jprint, pdf_path);


            System.out.println("Reporte generado!");
        }
        catch (Exception e){
            System.out.println("Excepcion :( ");
            e.getMessage();
        }
    }
    
}
