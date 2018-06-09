package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class GenerarReporte {

    public GenerarReporte() {
        System.out.println("Generando jasper report...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8 ", "4LDJZU");
            
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile (FrmMainOptionsAdmin.class.getResource
            ("/Reportes/reporteOrdenes.jasper").getFile());
            HashMap hm = new HashMap();
            hm.put("parametroTitulo", "j");
            JasperPrint impresion =JasperFillManager.fillReport(jr, null, con);

            JasperViewer viewer = new JasperViewer(impresion);
            viewer.setVisible(true);
        }
        catch (Exception e){
            e.getMessage();
        }   
    }
    
}
