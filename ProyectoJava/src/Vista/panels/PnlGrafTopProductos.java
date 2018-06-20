package Vista.panels;

import Controlador.ProductoBL;
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PnlGrafTopProductos extends javax.swing.JPanel {
    private final ProductoBL prodBL;
    private final ArrayList<String> nombres;
    private final ArrayList<Double> montos;
    
    public PnlGrafTopProductos() {
        initComponents();
        prodBL = new ProductoBL();
        nombres = new ArrayList<>();
        montos = new ArrayList<>();
        prodBL.productosDestacados(nombres, montos, dtchIni.getDate(), dtchFin.getDate());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtchIni = new com.toedter.calendar.JDateChooser();
        lblFechaIni = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        dtchFin = new com.toedter.calendar.JDateChooser();
        btnObtenerGraf = new javax.swing.JButton();

        lblFechaIni.setText("Fecha Inicio:");

        lblFechaFin.setText("Fecha Fin:");

        btnObtenerGraf.setText("Graficar Datos");
        btnObtenerGraf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnObtenerGrafMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnObtenerGraf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtchIni, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(dtchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtchIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnObtenerGraf)
                .addContainerGap(319, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        int mxSz = 180;
        
        if (nombres.size() < 3 ){
            for(int i=0;i<3;i++){
                nombres.add("");
                montos.add(0.0);
            }
        }
        
        //Leyenda
        if (montos.get(0) != 0)   
            g.drawString("1. " + nombres.get(0), 10, 180 + 40);
        if (montos.get(1) != 0)   
            g.drawString("2. " + nombres.get(1), 10, 180 + 70);
        if (montos.get(2) != 0)   
            g.drawString("3. " + nombres.get(2), 10, 180 + 100);
        
        //Encabezados
        if (montos.get(0) != 0)   
            g.drawString("[1]", 280 + 65, 50 + 260);
        if (montos.get(1) != 0)   
            g.drawString("[2]", 280 + 165, 50 + 260);
        if (montos.get(2) != 0)   
            g.drawString("[3]", 280 + 265, 50 + 260);

        Double tot = montos.get(0) + montos.get(1) + montos.get(2);
        int v1 = (int) (mxSz*montos.get(0)/tot);
        int v2 = (int) (mxSz*montos.get(1)/tot);
        int v3 = (int) (mxSz*montos.get(2)/tot);
        DecimalFormat df = new DecimalFormat("#.##"); 
        
        //Rectángulos
        g.setColor(Color.red);
        g.fillRect(280 + 50, 50 + 240-v1, 40, v1);
        g.setColor(Color.blue);
        g.fillRect(280 + 150, 50 + 240-v2, 40, v2);
        g.setColor(Color.green);
        g.fillRect(280 + 250, 50 + 240-v3, 40, v3);
        
        //Montos
        g.setColor(Color.red);
        if (montos.get(0) != 0)
            g.drawString(df.format(montos.get(0)), 280 + 50, 30 + 240-v1);
        g.setColor(Color.blue);
        if (montos.get(1) != 0)
            g.drawString(df.format(montos.get(1)), 280 + 150, 30 + 240-v2);
        g.setColor(Color.green);
        if (montos.get(2) != 0)    
            g.drawString(df.format(montos.get(2)), 280 + 250, 30 + 240-v3);
    }
    
    private void btnObtenerGrafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObtenerGrafMouseClicked
        nombres.clear();
        montos.clear();
        
        if(!prodBL.productosDestacados(nombres, montos, dtchIni.getDate(), dtchFin.getDate()))
            JOptionPane.showMessageDialog(this, "Por favor, ingrese fechas válidas", "Error en la gráfica", JOptionPane.ERROR_MESSAGE);
        else 
            repaint();
    }//GEN-LAST:event_btnObtenerGrafMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerGraf;
    private com.toedter.calendar.JDateChooser dtchFin;
    private com.toedter.calendar.JDateChooser dtchIni;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaIni;
    // End of variables declaration//GEN-END:variables
}
