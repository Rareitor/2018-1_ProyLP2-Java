package Vista;
import java.io.BufferedReader;
import java.io.FileReader;

public class FrmVerRecomendaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmVerRecomendaciones
     */
    public FrmVerRecomendaciones() {
        initComponents();
        try{
            cargarArchivo();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void cargarArchivo() throws Exception
    {
        FileReader archRecom = new FileReader("./archivos/archRecomendaciones.dat");
        BufferedReader rd = new BufferedReader(archRecom);

        String data = "";
        while (true)
        {
            String linea = rd.readLine();
            if (linea == null) break;
            linea += "\n";
            data += linea;
        }

        txtARecomend.setText(data);
        rd.close();
        archRecom.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRecomend = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtARecomend = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();

        lblRecomend.setText("Se le recomienda:");

        txtARecomend.setColumns(20);
        txtARecomend.setRows(5);
        jScrollPane2.setViewportView(txtARecomend);

        btnAceptar.setText("Cancelar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRecomend)
                            .addComponent(btnAceptar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRecomend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
        try{
            this.setClosed(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRecomend;
    private javax.swing.JTextArea txtARecomend;
    // End of variables declaration//GEN-END:variables
}
