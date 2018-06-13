/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.panels;

import Controlador.PayeeBL;
import Modelo.PayeeGraf;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class PnlGrafTopComisionistas extends javax.swing.JPanel {
    private final PayeeBL control;
    private ArrayList<PayeeGraf> lst;
    private final int szGraph;
    private Double tot;

    /**
     * Creates new form PnlGrafTopComisionistas
     */
    public PnlGrafTopComisionistas(String id) {
        initComponents();
//        if(id == null)
//            id  = "JEF-013";
        szGraph = 500;
        control = new PayeeBL();
        lst = control.getPayees(id);
        if(lst.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ocurrió un error en la carga de datos", "ERROR", HEIGHT);
            pnlNombres.setEnabled(false);
            pnlGrafico.setEnabled(false);
        }else{
            ldData();
        }
    }
    
    public void ldData(){
        DefaultListModel<String> mdl = new DefaultListModel<String>();
        int i=0;
        tot=0.0;
        for(PayeeGraf elem:lst){
            i++;
            mdl.addElement("["+i+"]: "+elem.getNombre());
            tot+=elem.getTotSum();
        }
        lstNombres.setModel(mdl);
//        pntGraf();
    }
    
    private void pntGraf(){
        Graphics pnlG = pnlGrafico.getGraphics();
        //int[] lins = new int[lst.size()];
        int lim = 20;
        ArrayList<Color> lstClr = new ArrayList<>();
        lstClr.add(Color.blue);
        lstClr.add(Color.yellow);
        lstClr.add(Color.red);
        
//        for(int i = 0; i < lst.size(); i++){
//            pnlG.setColor(lstClr.get(i));
//            pnlG.fillRect(lim, 30, szGraph-lim+20, 240);
//            lim += (int) (szGraph*lst.get(i).getTotSum()/tot);
//        }
        
        pnlG.setColor(Color.blue);
        pnlG.fillRect(lim, 30, szGraph-lim+20, 240);
        lim += (int) (szGraph*lst.get(0).getTotSum()/tot);
        
        pnlG.setColor(Color.yellow);
        pnlG.fillRect(lim, 30, szGraph-lim+20, 240);
        lim += (int) (szGraph*lst.get(1).getTotSum()/tot);
        
        pnlG.setColor(Color.red);
        pnlG.fillRect(lim, 30, szGraph-lim+20, 240);
//        lim += (int) (szGraph*lst.get(2).getTotSum()/tot);
        pnlG.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNombres = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        pnlGrafico = new javax.swing.JPanel();
        lblInstruct = new javax.swing.JLabel();

        pnlNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres:"));

        jScrollPane1.setViewportView(lstNombres);

        javax.swing.GroupLayout pnlNombresLayout = new javax.swing.GroupLayout(pnlNombres);
        pnlNombres.setLayout(pnlNombresLayout);
        pnlNombresLayout.setHorizontalGroup(
            pnlNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNombresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNombresLayout.setVerticalGroup(
            pnlNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNombresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGraficoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlGraficoLayout = new javax.swing.GroupLayout(pnlGrafico);
        pnlGrafico.setLayout(pnlGraficoLayout);
        pnlGraficoLayout.setHorizontalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblInstruct.setText("Click en el panel de la derecha.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInstruct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruct)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlGraficoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGraficoMouseClicked
        // TODO add your handling code here:
        pntGraf();
    }//GEN-LAST:event_pnlGraficoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInstruct;
    private javax.swing.JList<String> lstNombres;
    private javax.swing.JPanel pnlGrafico;
    private javax.swing.JPanel pnlNombres;
    // End of variables declaration//GEN-END:variables
}
