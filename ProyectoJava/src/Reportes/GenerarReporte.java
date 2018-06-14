package Reportes;

import java.sql.*;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class GenerarReporte {

    public GenerarReporte() {
    }
    
    public void reporteOrden(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            JasperReport jasperReport = JasperCompileManager.compileReport("./src/Reportes/reporteOrdenes.jrxml");
            JRDataSource jrDataSource = new JREmptyDataSource();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,null,con);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
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
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);
            con.close();
        } catch (Exception e){
            System.out.println("Excepciom 3 :(");
            System.out.println(e.getMessage());
        }
    }
    
}
