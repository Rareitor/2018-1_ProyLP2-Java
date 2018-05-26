package Vista;

import Controlador.PayeeBL;
import Modelo.Payee;
import javax.swing.JOptionPane;

public class FrmCambiarContrasena extends javax.swing.JDialog {

    private final PayeeBL pyBL;
    private String username;
    /**
     * Creates new form FrmCambiarContrasena
     */
    public FrmCambiarContrasena(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pyBL = new PayeeBL();
        txtActual.setText("");
        txtNuevo.setText("");
        txtConfirm.setText("");
    }

    public void setUsername(String usr){
        this.username = usr;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblActual = new javax.swing.JLabel();
        lblNueva = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        chkVer = new javax.swing.JCheckBox();
        txtActual = new javax.swing.JPasswordField();
        txtNuevo = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblActual.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblActual.setText("Contraseña Actual:");

        lblNueva.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNueva.setText("Contraseña Nueva:");

        lblConfirmar.setText("Confirmar Contraseña:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        chkVer.setText("Ver");
        chkVer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkVerItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar)
                    .addComponent(lblNueva)
                    .addComponent(lblConfirmar)
                    .addComponent(lblActual))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirm)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(txtActual, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNuevo))
                .addGap(32, 32, 32)
                .addComponent(chkVer)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActual)
                    .addComponent(chkVer)
                    .addComponent(txtActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNueva)
                    .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmar)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void chkVerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkVerItemStateChanged
        // TODO add your handling code here:
        if(chkVer.isSelected()){
            txtActual.setEchoChar((char)0);
            txtNuevo.setEchoChar((char)0);
            txtConfirm.setEchoChar((char)0);
        }else{
            txtActual.setEchoChar('*');
            txtNuevo.setEchoChar('*');
            txtConfirm.setEchoChar('*');
        }
    }//GEN-LAST:event_chkVerItemStateChanged

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
        //String actual = new String(txtActual.getPassword());
        String nuevo = new String(txtNuevo.getPassword());
        String confirm = new String(txtConfirm.getPassword());
        
        if(!(nuevo.equals("")) && nuevo.equals(confirm) && pyBL.verificarContrasena(username,new String(txtActual.getPassword())))
        {
            if (pyBL.cambiarContrasena(username,nuevo)){
                JOptionPane.showMessageDialog(this, "Contraseña actualizada", "Actualizada",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"Ocurrió un error al hacer la actualización.","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }else if (confirm.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Ingrese la confirmación contraseña", "Error",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(this, "Por favor, verique que las contraseñas sean correctas.", "Las contraseñas no coinciden",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCambiarContrasena dialog = new FrmCambiarContrasena(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chkVer;
    private javax.swing.JLabel lblActual;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblNueva;
    private javax.swing.JPasswordField txtActual;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtNuevo;
    // End of variables declaration//GEN-END:variables
}
