package Vista;

import Controlador.PayeeBL;
import Modelo.Payee;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmAdministrarCuenta extends javax.swing.JInternalFrame {

    private final Payee curUser;
    private final PayeeBL pyBL;
    private String[] datos;
    /**
     * Creates new form FrmAdministrarCuenta
     * @param username
     */
    public FrmAdministrarCuenta(Payee user) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pyBL = new PayeeBL();
        curUser = user;
        ldDatosUsuario();
    }

    private void ldDatosUsuario(){
        if(curUser != null){
            txtNombre.setText(curUser.getNombre());
            txtApellidoPaterno.setText(curUser.getApellidoPaterno());
            txtApellidoMaterno.setText(curUser.getApellidoMaterno());
            txtDNI.setText(curUser.getDni());
            txtCorreo.setText(curUser.getEmail());
        }else{
            try {
                JOptionPane.showMessageDialog(this, "Error en carga de datos originales de usuario", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.setClosed(true);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(FrmAdministrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNombre.setText("Nombre:");

        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblApellidoPaterno.setText("Apellido Paterno:");

        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTelefono.setText("Telefono:");

        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblApellidoMaterno.setText("Apellido Materno:");

        lblDNI.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDNI.setText("DNI:");

        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDireccion.setText("Dirección:");

        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCorreo.setText("Correo:");

        txtTelefono.setEnabled(false);

        txtDNI.setEnabled(false);

        txtDireccion.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(txtApellidoPaterno)
                                .addComponent(txtApellidoMaterno)
                                .addComponent(txtDNI)
                                .addComponent(txtTelefono)
                                .addComponent(txtCorreo))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidoMaterno)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        try{
            this.setClosed(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
        if (txtNombre.getText().trim().equals("") || (txtApellidoPaterno.getText().trim().equals("")) || (txtApellidoMaterno.getText().trim().equals("")) || txtCorreo.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos");
        }
        else
        {
            Payee altUser = new Payee();
            altUser.setUserName(curUser.getUserName());
            String tmp = txtNombre.getText().trim();
            if(!curUser.getNombre().equals(tmp)) altUser.setNombre(tmp);
            
            tmp = txtApellidoPaterno.getText().trim();
            if(!curUser.getApellidoPaterno().equals(tmp)) altUser.setApellidoPaterno(tmp);
            
            tmp = txtApellidoMaterno.getText().trim();
            if(!curUser.getApellidoMaterno().equals(tmp)) altUser.setApellidoMaterno(tmp);
            
            tmp = txtCorreo.getText().trim();
            if(!curUser.getEmail().equals(tmp)) altUser.setEmail(tmp);
            
            if(pyBL.modificarDatosPropios(altUser)){
                if(!curUser.getNombre().equals(tmp)) altUser.setNombre(tmp);
            
            tmp = txtApellidoPaterno.getText().trim();
            if(!curUser.getApellidoPaterno().equals(tmp)) altUser.setApellidoPaterno(tmp);
            
            tmp = txtApellidoMaterno.getText().trim();
            if(!curUser.getApellidoMaterno().equals(tmp)) altUser.setApellidoMaterno(tmp);
            
            tmp = txtCorreo.getText().trim();
            if(!curUser.getEmail().equals(tmp)) altUser.setEmail(tmp);
                JOptionPane.showMessageDialog(this, "Datos Actualizados");
            }else{
                JOptionPane.showMessageDialog(this, "Error en la actualización");
            }
            
            try{
                this.setClosed(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
