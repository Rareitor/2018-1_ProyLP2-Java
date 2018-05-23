package Vista;

import Controlador.ProductoBL;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmVisualizarProducto extends javax.swing.JInternalFrame {

    private ProductoBL logicaNegocio;
    private List<Producto> listaOriginal;
    
    public FrmVisualizarProducto() {
        initComponents();
        logicaNegocio = new ProductoBL();
        hiloagregarLista hiloProductos = new hiloagregarLista();
        //Inicia concurrencia
        hiloProductos.start();
        agregarComboBox();
        try{
            hiloProductos.join();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Termina concurrencia
    }
    
    private void agregarComboBox(){
        List<String> tipos = logicaNegocio.listarTiposProductos();
        for(int i=0;i<tipos.size();i++){
            cmbTipo.addItem(tipos.get(i));
        }
    }
    
    private class hiloagregarLista extends Thread{
        @Override
        public void run(){
            listaOriginal = logicaNegocio.listarProductos();
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object[] fila = new Object [3];
            for (int i=0;i<listaOriginal.size();i++){
                fila[0] = listaOriginal.get(i).getIdProducto();
                fila[1] = listaOriginal.get(i).getNombre();
                fila[2] = listaOriginal.get(i).getTipo();
                modelo.addRow(fila);
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

        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setToolTipText("Visualizar Productos");

        lblTipo.setText("Tipo de producto:");

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Tiipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(29, 29, 29)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Borramos toda la data
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) modelo.removeRow(i);

        Object[] fila = new Object [3];
        for (int i=0;i<listaOriginal.size();i++){
            if (listaOriginal.get(i).getTipo().equals(cmbTipo.getSelectedItem().toString())){
                fila[0] = listaOriginal.get(i).getIdProducto();
                fila[1] = listaOriginal.get(i).getNombre();
                fila[2] = listaOriginal.get(i).getTipo();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
