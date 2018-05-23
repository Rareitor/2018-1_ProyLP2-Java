package Vista;

import Controlador.PayeeBL;
import Modelo.Payee;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class FrmVisualizarUsuario extends javax.swing.JInternalFrame {

    private List<Payee> listaOrig;
    private PayeeBL logicaNegocio;
    private String puesto;
    
    public FrmVisualizarUsuario(String cargoLista, String idPayee, String puesto) {
        initComponents();
        cmbCampo.addItem("ID");
        cmbCampo.addItem("Nombre");
        cmbCampo.addItem("Distrito");
        cmbCampo.addItem("Cargo");
        
        this.puesto = puesto;
        logicaNegocio = new PayeeBL();
        
        
        listaOrig = new ArrayList<>();
        switch(this.puesto){
            case "ADMINISTRADOR":
                switch(cargoLista){
                    case "Gerente":
                        listaOrig = logicaNegocio.listarGerentes();
                        break;
                    case "Jefe":
                        listaOrig = logicaNegocio.listarJefes("ALL");
                        break;
                    case "Comisionista":
                        listaOrig = logicaNegocio.listarComisionistas("ALL");
                }
                break;
            case "GERENTE":
                switch(cargoLista){
                    case "Jefe":
                        listaOrig = logicaNegocio.listarJefes("ALL");
                        break;
                    case "Comisionista":
                        listaOrig = logicaNegocio.listarComisionistas("ALL");
                }
                break;
            case "JEFE":
                switch(cargoLista){
                    case "Comisionista":
                        listaOrig = logicaNegocio.listarComisionistas(idPayee);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se econtraron resultados", "Lista vacía", JOptionPane.WARNING_MESSAGE);
                break;
        }
        tblDatosTrabajador.setAutoResizeMode(tblDatosTrabajador.AUTO_RESIZE_ALL_COLUMNS);
        
        //setColsTbl((DefaultTableModel) this.tblDatosTrabajador.getModel(), new String[]{"idPayee","DNI","Nombre","Apellido Paterno","Apellido Materno","Correo","Usuario","Distrito","Cargo"});   
//        tblDatosTrabajador.getParent().addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(final ComponentEvent e) {
//                if (tblDatosTrabajador.getPreferredSize().width < tblDatosTrabajador.getParent().getWidth()) {
//                    tblDatosTrabajador.setAutoResizeMode(tblDatosTrabajador.AUTO_RESIZE_ALL_COLUMNS);
//                } else {
//                    tblDatosTrabajador.setAutoResizeMode(tblDatosTrabajador.AUTO_RESIZE_OFF);
//                }
//            }
//        });
        
        
        DefaultTableModel modelo = (DefaultTableModel) this.tblDatosTrabajador.getModel();
        Object[] fila = new Object [10];
        for (int i=0;i<listaOrig.size();i++){
            
            fila[0] = listaOrig.get(i).getIdTrabajador();
            fila[1] = listaOrig.get(i).getDni();
            fila[2] = listaOrig.get(i).getNombre();
            fila[3] = listaOrig.get(i).getApellidoPaterno();
            fila[4] = listaOrig.get(i).getApellidoMaterno();
            fila[5] = listaOrig.get(i).getEmail();
            fila[6] = listaOrig.get(i).getUserName();
            fila[7] = listaOrig.get(i).getDistrito();
            fila[8] = listaOrig.get(i).getCargo();
            modelo.addRow(fila);
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCampo = new javax.swing.JLabel();
        cmbCampo = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosTrabajador = new javax.swing.JTable();
        txtDato = new javax.swing.JTextField();
        lblDato = new javax.swing.JLabel();

        setTitle("Visualizar Usuario");

        lblCampo.setText("Buscar por campo:");

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        tblDatosTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "E-mail", "Username", "Distrito", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tblDatosTrabajador);
        if (tblDatosTrabajador.getColumnModel().getColumnCount() > 0) {
            tblDatosTrabajador.getColumnModel().getColumn(0).setMaxWidth(80);
            tblDatosTrabajador.getColumnModel().getColumn(5).setMinWidth(120);
        }

        txtDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDatoKeyReleased(evt);
            }
        });

        lblDato.setText("Dato:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCampo)
                                .addGap(38, 38, 38)
                                .addComponent(cmbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDato)
                                .addGap(29, 29, 29)
                                .addComponent(txtDato)))
                        .addGap(18, 584, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCampo)
                            .addComponent(cmbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDato)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        try{
            this.setClosed(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtDatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoKeyReleased
        filtrar();
    }//GEN-LAST:event_txtDatoKeyReleased
    
    private void filtrar(){
        String filtro = cmbCampo.getSelectedItem().toString();
        String field = txtDato.getText();
        
        //Borramos las filas
        DefaultTableModel modelo = (DefaultTableModel) tblDatosTrabajador.getModel();
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) modelo.removeRow(i);
        
        Object[] fila = new Object [10];
        Boolean cumple = false;
        for (int i=0;i<listaOrig.size();i++){
            switch(filtro){
                case "ID":
                    cumple = listaOrig.get(i).getIdTrabajador().startsWith(field);
                    System.out.println(listaOrig.get(i).getIdTrabajador());
                    System.out.println(cumple);
                    break;
                case "Nombre":
                    cumple = listaOrig.get(i).getNombre().startsWith(field)
                           || listaOrig.get(i).getApellidoPaterno().startsWith(field)
                           || listaOrig.get(i).getApellidoMaterno().startsWith(field);
                    break;
                case "Distrito":
                    cumple = listaOrig.get(i).getDistrito().startsWith(field);
                    break;
                case "Cargo":
                    cumple = listaOrig.get(i).getCargo().startsWith(field);
                    break;
                default:
                    break;   
            }
            
            if(!cumple) continue;
            fila[0] = listaOrig.get(i).getIdTrabajador();
            fila[1] = listaOrig.get(i).getDni();
            fila[2] = listaOrig.get(i).getNombre();
            fila[3] = listaOrig.get(i).getApellidoPaterno();
            fila[4] = listaOrig.get(i).getApellidoMaterno();
            fila[5] = listaOrig.get(i).getEmail();
            fila[6] = listaOrig.get(i).getUserName();
            fila[7] = listaOrig.get(i).getDistrito();
            fila[8] = listaOrig.get(i).getCargo();
            modelo.addRow(fila);
        }
        tblDatosTrabajador.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbCampo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCampo;
    private javax.swing.JLabel lblDato;
    private javax.swing.JTable tblDatosTrabajador;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
