package Vista;
import AccesoDatos.PayeeDA;
import Controlador.PayeeBL;
import Modelo.Payee;
import java.awt.Dimension;
import java.io.File;
import javax.swing.*;

/*  Admin:          20090380 pucp
    Gerente:        20176288 roder628
    Jefe:           20175863 rodri12
    Comisionista:   20175581 victor558      */

public class FrmLogin extends javax.swing.JFrame {
    private PayeeBL logicanegocio;
    
    public FrmLogin() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        logicanegocio = new PayeeBL();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtContrasena.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblRecuperaContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitulo1.setText("GESCOM TDP");

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo2.setText("Bienvenido al Sistema");

        btnLogin.setBackground(new java.awt.Color(0, 255, 255));
        btnLogin.setText("Iniciar sesión");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        lblRecuperaContraseña.setForeground(new java.awt.Color(102, 102, 255));
        lblRecuperaContraseña.setText("¿Haz olvidado la contraseña?");
        lblRecuperaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperaContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblContraseña))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContrasena)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(lblTitulo1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnLogin)))
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRecuperaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnLogin)
                .addGap(35, 35, 35)
                .addComponent(lblRecuperaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblRecuperaContraseña.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese usuario.", "USUARIO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtContrasena.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese contraseña.", "CONTRASEÑA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Payee user = logicanegocio.verificarLogin(txtUsuario.getText(), new String(txtContrasena.getPassword()));
        
        try{
            if(user == null)
            {
                JOptionPane.showMessageDialog(this, "Contraseña o usuario erróneos, vuelva a ingresar los datos", "Error de login", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if (!user.getCargo().equals("ADMINISTRADOR") && !user.getCargo().equals("GERENTE")
                        && !user.getCargo().equals("JEFE") && !user.getCargo().equals("COMISIONISTA")){
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un usuario válido.",  "Ingresar usuario",JOptionPane.WARNING_MESSAGE);
                    return;
                }
//                JDialog frmMainOpt = new FrmMainOptionsAdmin(this, true, user);
//                frmMainOpt.pack();
//                this.setVisible(false);
//                frmMainOpt.setVisible(true);
//                limpiarCampos();
//                this.setVisible(true);
                FrmMainOptionsAdmin frmMainOpt = new FrmMainOptionsAdmin(this, true, user);
                frmMainOpt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.hide();
                frmMainOpt.setVisible(true);
                limpiarCampos();
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un usuario válido.",  "Ingresar usuario",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lblRecuperaContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperaContraseñaMouseClicked
        // TODO add your handling code here:
        FrmRecuperarContrasena frm = new FrmRecuperarContrasena(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_lblRecuperaContraseñaMouseClicked

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            btnLoginMouseClicked(null);
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    
    private void limpiarCampos(){
        txtUsuario.setText("");
        txtContrasena.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblRecuperaContraseña;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
