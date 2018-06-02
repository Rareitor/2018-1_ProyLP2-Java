/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.panels;

import Controlador.PayeeBL;
import Modelo.PayeeGraf;
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

    /**
     * Creates new form PnlGrafTopComisionistas
     */
    public PnlGrafTopComisionistas(String id) {
        initComponents();
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
    
    private void ldData(){
        DefaultListModel<String> mdl = (DefaultListModel<String>) lstNombres.getModel();
        int i=0;
        for(PayeeGraf elem:lst){
            i++;
            mdl.addElement("["+i+"]: "+elem.getNombre());
        }
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlGraficoLayout = new javax.swing.GroupLayout(pnlGrafico);
        pnlGrafico.setLayout(pnlGraficoLayout);
        pnlGraficoLayout.setHorizontalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    private javax.swing.JPanel pnlGrafico;
    private javax.swing.JPanel pnlNombres;
    // End of variables declaration//GEN-END:variables
}