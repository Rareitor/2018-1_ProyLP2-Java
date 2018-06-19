package Vista.panels;

import Controlador.ProductoBL;
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PnlGrafTopProductos extends javax.swing.JPanel {
    private final ProductoBL prodBL;
    private boolean graph = false;
    private final ArrayList<String> nombres;
    private final ArrayList<Double> montos;

    /**
     * Creates new form PnlGrafTopProductos
     */
    public PnlGrafTopProductos() {
        initComponents();
        prodBL = new ProductoBL();
        nombres = new ArrayList<>();
        montos = new ArrayList<>();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtchIni = new com.toedter.calendar.JDateChooser();
        lblFechaIni = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        dtchFin = new com.toedter.calendar.JDateChooser();
        btnObtenerGraf = new javax.swing.JButton();
        pnlLabels = new javax.swing.JPanel();
        pnlGraf = new javax.swing.JPanel();

        lblFechaIni.setText("Fecha Inicio:");

        lblFechaFin.setText("Fecha Fin:");

        btnObtenerGraf.setText("Graficar Datos");
        btnObtenerGraf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnObtenerGrafMouseClicked(evt);
            }
        });

        pnlLabels.setBackground(new java.awt.Color(204, 204, 204));
        pnlLabels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlLabelsLayout = new javax.swing.GroupLayout(pnlLabels);
        pnlLabels.setLayout(pnlLabelsLayout);
        pnlLabelsLayout.setHorizontalGroup(
            pnlLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLabelsLayout.setVerticalGroup(
            pnlLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        pnlGraf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlGrafLayout = new javax.swing.GroupLayout(pnlGraf);
        pnlGraf.setLayout(pnlGrafLayout);
        pnlGrafLayout.setHorizontalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        pnlGrafLayout.setVerticalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnObtenerGraf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtchIni, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(dtchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtchIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtchFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnObtenerGraf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerGrafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObtenerGrafMouseClicked
        nombres.clear();
        montos.clear();
        //this.paint(this.getGraphics());
        if(!prodBL.productosDestacados(nombres, montos, dtchIni.getDate(), dtchFin.getDate())){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese fechas válidas", "Error en la gráfica", JOptionPane.ERROR_MESSAGE);
            graph=false;
            this.pnlGraf.repaint();
            this.pnlLabels.repaint();
        } else {
            Graphics ggrf = this.pnlGraf.getGraphics();
            Graphics gplbl = pnlLabels.getGraphics();
            int mxSz = 180;
            
            if (nombres.size() < 3 ){
                for(int i=0;i<3;i++){
                    nombres.add("");
                    montos.add(0.0);
                }
            }
            
            
            ggrf.drawString("Montos comisionados", 35, 25);
            if (montos.get(0) != 0)   
                gplbl.drawString("1. "+nombres.get(0), 5, 40);
            if (montos.get(1) != 0)   
                gplbl.drawString("2. "+nombres.get(1), 5, 70);
            if (montos.get(2) != 0)   
                gplbl.drawString("3. "+nombres.get(2), 5, 100);
            
            if (montos.get(0) != 0)   
                ggrf.drawString("[1]",  65, 260);
            if (montos.get(1) != 0)   
                ggrf.drawString("[2]", 165, 260);
            if (montos.get(2) != 0)   
                ggrf.drawString("[3]", 265, 260);
            ggrf.drawLine(30 , 240, 310, 240);

            Double tot = montos.get(0) + montos.get(1) + montos.get(2);
            int v1 = (int) (mxSz*montos.get(0)/tot);
            int v2 = (int) (mxSz*montos.get(1)/tot);
            int v3 = (int) (mxSz*montos.get(2)/tot);
            DecimalFormat df = new DecimalFormat("#.##"); 
            ggrf.setColor(Color.red);
            ggrf.fillRect( 50, 240-v1, 40, v1);
            
            if (montos.get(0) != 0)
                ggrf.drawString(df.format(montos.get(0)), 50, 50);
            ggrf.setColor(Color.blue);
            ggrf.fillRect(150, 240-v2, 40, v2);
            if (montos.get(1) != 0)
                ggrf.drawString(df.format(montos.get(1)), 150, 50);
            ggrf.setColor(Color.green);
            ggrf.fillRect(250, 240-v3, 40, v3);
            if (montos.get(2) != 0)    
                ggrf.drawString(df.format(montos.get(2)), 250, 50);

            ggrf.dispose();
            gplbl.dispose();
        }
    }//GEN-LAST:event_btnObtenerGrafMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerGraf;
    private com.toedter.calendar.JDateChooser dtchFin;
    private com.toedter.calendar.JDateChooser dtchIni;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaIni;
    private javax.swing.JPanel pnlGraf;
    private javax.swing.JPanel pnlLabels;
    // End of variables declaration//GEN-END:variables
}
