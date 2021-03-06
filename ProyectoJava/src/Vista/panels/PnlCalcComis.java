package Vista.panels;

import Controlador.CalculoBL;
import java.util.*;
import javax.swing.JOptionPane;

public class PnlCalcComis extends javax.swing.JPanel {
    private final CalculoBL calcBL;
    private final Date curDate;
    
    /**
     * Creates new form PnlCalcComis
     */
    public PnlCalcComis() {
        initComponents();
        calcBL = new CalculoBL();
        curDate = get0TimeDate(new Date());
    }
    
    public Date get0TimeDate(Date dtIn){
        Calendar cal = Calendar.getInstance();
        if(dtIn == null){
            cal.setTime(new Date());
        }else{
            cal.setTime(dtIn);
        }
        
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFechaTope = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnCalcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        lblFechaTope.setText("Fecha:");

        btnCalcular.setText("Calcular Comisiones");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaTope)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaTope))
                .addGap(50, 50, 50)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        Date dt = get0TimeDate(dateChooser.getDate());
        if(curDate.compareTo(dt) <= 0){
            JOptionPane.showMessageDialog(this, "La fecha debe ser anterior a la actual","FECHA",JOptionPane.WARNING_MESSAGE);
            dateChooser.setDate(null);
        }else{
            if(calcBL.calculoDeComision(dt)){
                JOptionPane.showMessageDialog(this, "El calculo se realizó con éxito","CALCULO",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Ocurrió un error en la ejecución de la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel lblFechaTope;
    // End of variables declaration//GEN-END:variables
}
