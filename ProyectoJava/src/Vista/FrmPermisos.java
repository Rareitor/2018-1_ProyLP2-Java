/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Payee;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class FrmPermisos extends javax.swing.JDialog {

    /**
     * Creates new form FrmPermisos
     */
    public FrmPermisos(java.awt.Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        initComponents();
    }
    public FrmPermisos(Dialog parent, String title, boolean modal) {
        super(parent, title, modal);
        initComponents();
    }

    public void setUser(Payee user){
        lblUsuario.setText(lblUsuario.getText()+ user.getNombre() + " " + user.getApellidoPaterno()+ " " + user.getApellidoMaterno());
        lblCargo.setText(lblCargo.getText() + user.getCargo() + " son:");
        String str = "";
        switch(user.getCargo()){
            case "ADMINISTRADOR":
                str += "Gestionar Ordenes, Productos y Usuarios.\n"+
                        "Fijar el periodo (rango de días) para el cálculo de comisiones.\n"+
                        "Ver recomendaciones."+
                        "Gestionar elementos eliminados/deshabilitados.\n"+
                        "Realizar la copia de respaldo de la base de datos (Backup).\n"+
                        "Añadir noticias.\n"+
                        "Administrar sus datos personales.";
                break;
            case "GERENTE":
                str += "Gestionar Ordenes.\n"+
                        "Calcular comisiones.\n"+
                        "Ver comisiones, productos, canales, personal a su cargo, infracciones y noticias."+
                        "Ver recomendaciones."+
                        "Gestionar elementos eliminados/deshabilitados.\n"+
                        "Añadir noticias.\n"+
                        "Ver mapa de ventas"+
                        "Administrar sus datos personales.";
                break;
            case "JEFE":
                str += "Gestionar Ordenes.\n"+
                        "Ver comisiones, productos, canales, personal a su cargo, y noticias."+
                        "Ver recomendaciones."+
                        "Administrar sus datos personales.";
                break;
            case "COMISIONISTA":
                str += "Gestionar Ordenes.\n"+
                        "Ver comisiones, productos, canales y noticias."+
                        "Ver recomendaciones."+
                        "Administrar sus datos personales.";
                break;
            default: 
                JOptionPane.showMessageDialog(this, "Usuario desconocido.");
                break;
        }
        this.txtAPermisos.setText(str);
        this.txtAPermisos.setSize(txtAPermisos.getColumns()*10, this.txtAPermisos.getLineCount()*13);
        this.pack();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAPermisos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblUsuario.setText("Saludos ");

        lblCargo.setText("Sus permisos como ");

        txtAPermisos.setEditable(false);
        txtAPermisos.setColumns(20);
        txtAPermisos.setLineWrap(true);
        txtAPermisos.setRows(5);
        jScrollPane1.setViewportView(txtAPermisos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblCargo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPermisos dialog = new FrmPermisos(new javax.swing.JFrame(),"", true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtAPermisos;
    // End of variables declaration//GEN-END:variables
}
