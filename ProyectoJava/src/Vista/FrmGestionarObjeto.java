package Vista;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FrmGestionarObjeto extends javax.swing.JInternalFrame {
    private JDialog modDiag;
    public String tipo;
    /**
     * Creates new form FrmGestionarProducto
     */
    public FrmGestionarObjeto(String obj) {
        initComponents();
        calOrden.setVisible(false);
        tipo = obj;
        
        btnAdd.setText(btnAdd.getText() + " " + obj);
        btnMod.setText(btnMod.getText() + " " + obj);
        btnDel.setText(btnDel.getText() + " " + obj);
        pnlTipoUsr.setVisible(false);
        pnlOrdDate.setVisible(false);
        switch(obj){
            case "Orden":
                setItemsCmb((DefaultComboBoxModel) this.cmbCampo.getModel(), new String[]{"Fecha","Canal","IdComisionista","MontoRetribución"});
                setColsTbl((DefaultTableModel) this.tblDatosTrabajador.getModel(), new String[]{"Fecha","Canal","IdComisionista","MontoRetribución"});
                break;
            case "Producto":
                setItemsCmb((DefaultComboBoxModel) this.cmbCampo.getModel(), new String[]{"Nombre","Marca","Precio unitario"});
                setColsTbl((DefaultTableModel) this.tblDatosTrabajador.getModel(), new String[]{"Nombre","Marca","Precio unitario"});
                break;
            case "Usuario":
                setItemsCmb((DefaultComboBoxModel) this.cmbCampo.getModel(), new String[]{"Usuario","Nombre","Apellido Paterno","Apellido Materno","Correo","Jefe Directo","Tipo Usuario"});
                setColsTbl((DefaultTableModel) this.tblDatosTrabajador.getModel(), new String[]{"Usuario","Nombre","Apellido Paterno","Apellido Materno","Correo","Jefe Directo","Tipo Usuario"});
                break;
            default :
                //NULL
                break;
        }
    }
    // </editor-fold>
    // TODO add your handling code here:

    private void setColsTbl(DefaultTableModel tbl, String[] cols){
        for(int i = 0; i < cols.length; i++){
            tbl.addColumn(cols[i]);
        }
    }
    
    private void setItemsCmb(DefaultComboBoxModel lst, String[] items){
        for(int i = 0; i < items.length; i++){
            lst.addElement(items[i]);
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

        btnGrpUsrs = new javax.swing.ButtonGroup();
        tlbEditar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        tblBusqExport = new javax.swing.JToolBar();
        btnBuscqAvanz = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosTrabajador = new javax.swing.JTable();
        lbllCampo = new javax.swing.JLabel();
        cmbCampo = new javax.swing.JComboBox<>();
        btnListar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        calOrden = new com.toedter.calendar.JCalendar();
        lpnOptions = new javax.swing.JLayeredPane();
        pnlTipoUsr = new javax.swing.JPanel();
        rdoComisionista = new javax.swing.JRadioButton();
        rdoJefe = new javax.swing.JRadioButton();
        rdoGerente = new javax.swing.JRadioButton();
        rdoTodos = new javax.swing.JRadioButton();
        lblTipoUsuario = new javax.swing.JLabel();
        pnlDato = new javax.swing.JPanel();
        lblDato = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        pnlOrdDate = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        dtFechaOrden = new com.toedter.calendar.JDateChooser();

        tlbEditar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tlbEditar.setRollover(true);

        btnAdd.setText("Añadir");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        tlbEditar.add(btnAdd);

        btnMod.setText("Editar");
        btnMod.setFocusable(false);
        btnMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMod.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        tlbEditar.add(btnMod);

        btnDel.setText("Eliminar");
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
        });
        tlbEditar.add(btnDel);

        tblBusqExport.setRollover(true);

        btnBuscqAvanz.setText("Busqueda Avanzada");
        btnBuscqAvanz.setFocusable(false);
        btnBuscqAvanz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscqAvanz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscqAvanz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscqAvanzMouseClicked(evt);
            }
        });
        tblBusqExport.add(btnBuscqAvanz);

        btnExport.setText("Exportar");
        btnExport.setFocusable(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
            }
        });
        tblBusqExport.add(btnExport);

        tblDatosTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatosTrabajador);

        lbllCampo.setText("Ingrese campo a buscar:");

        cmbCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbCampo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCampoItemStateChanged(evt);
            }
        });

        btnListar.setText("Listar Todo");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        pnlTipoUsr.setEnabled(false);

        btnGrpUsrs.add(rdoComisionista);
        rdoComisionista.setText("Comisionista");

        btnGrpUsrs.add(rdoJefe);
        rdoJefe.setText("Jefe");

        btnGrpUsrs.add(rdoGerente);
        rdoGerente.setText("Gerente");

        btnGrpUsrs.add(rdoTodos);
        rdoTodos.setText("Todos");

        lblTipoUsuario.setText("Tipo Usuario:");

        javax.swing.GroupLayout pnlTipoUsrLayout = new javax.swing.GroupLayout(pnlTipoUsr);
        pnlTipoUsr.setLayout(pnlTipoUsrLayout);
        pnlTipoUsrLayout.setHorizontalGroup(
            pnlTipoUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoUsrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTipoUsrLayout.createSequentialGroup()
                        .addComponent(rdoComisionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoJefe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoGerente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoTodos))
                    .addComponent(lblTipoUsuario))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlTipoUsrLayout.setVerticalGroup(
            pnlTipoUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoUsrLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTipoUsuario)
                .addGap(18, 18, 18)
                .addGroup(pnlTipoUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoComisionista)
                    .addComponent(rdoJefe)
                    .addComponent(rdoGerente)
                    .addComponent(rdoTodos))
                .addGap(19, 19, 19))
        );

        pnlDato.setBackground(new java.awt.Color(204, 204, 204));

        lblDato.setText("Ingrese dato:");

        javax.swing.GroupLayout pnlDatoLayout = new javax.swing.GroupLayout(pnlDato);
        pnlDato.setLayout(pnlDatoLayout);
        pnlDatoLayout.setHorizontalGroup(
            pnlDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatoLayout.createSequentialGroup()
                        .addComponent(lblDato)
                        .addGap(0, 226, Short.MAX_VALUE))
                    .addComponent(txtDato))
                .addContainerGap())
        );
        pnlDatoLayout.setVerticalGroup(
            pnlDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDato)
                .addGap(27, 27, 27)
                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlOrdDate.setEnabled(false);

        lblFecha.setText("Ingrese Fecha:");

        javax.swing.GroupLayout pnlOrdDateLayout = new javax.swing.GroupLayout(pnlOrdDate);
        pnlOrdDate.setLayout(pnlOrdDateLayout);
        pnlOrdDateLayout.setHorizontalGroup(
            pnlOrdDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrdDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrdDateLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dtFechaOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOrdDateLayout.setVerticalGroup(
            pnlOrdDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha)
                .addGap(18, 18, 18)
                .addComponent(dtFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lpnOptions.setLayer(pnlTipoUsr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpnOptions.setLayer(pnlDato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpnOptions.setLayer(pnlOrdDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpnOptionsLayout = new javax.swing.GroupLayout(lpnOptions);
        lpnOptions.setLayout(lpnOptionsLayout);
        lpnOptionsLayout.setHorizontalGroup(
            lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlTipoUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlOrdDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpnOptionsLayout.setVerticalGroup(
            lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlTipoUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lpnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlOrdDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllCampo)
                                .addGap(37, 37, 37)
                                .addComponent(cmbCampo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lpnOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(calOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tblBusqExport, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblBusqExport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbllCampo)
                                    .addComponent(cmbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListar)
                                    .addComponent(btnRegresar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(btnBuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lpnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(calOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        // TODO add your handling code here:
        FrmElegirTipoExportar frm = new FrmElegirTipoExportar(null, true);
        frm.setVisible(true);
        //.setVisible(false);
        frm.dispose();
    }//GEN-LAST:event_btnExportMouseClicked

    private void btnBuscqAvanzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscqAvanzMouseClicked
        // TODO add your handling code here:
        switch(tipo){
            case "Orden":
                modDiag = new FrmPersonalizarBusqOrden(null, true);
                modDiag.setVisible(true);
                break;
            case "Producto":
                modDiag = new FrmPersonalizarBusqProducto(null, true);
                modDiag.setVisible(true);
                break;
            case "Usuario":
                modDiag = new FrmPersonalizarBusqUsuario(null, true);
                modDiag.setVisible(true);
                break;
            default :
                //NULL
                break;
        }
    }//GEN-LAST:event_btnBuscqAvanzMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        try{
            this.setClosed(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        String option = cmbCampo.getSelectedItem().toString();
        if(!option.equals("") && option.equals("Tipo Usuario")){
            if(!(rdoComisionista.isSelected() || rdoGerente.isSelected()|| rdoJefe.isSelected()||rdoTodos.isSelected())){
                JOptionPane.showMessageDialog(this, "Por favor seleccione un tipo a buscar.");
            }
        }else{
            if(txtDato.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Escriba dato a buscar.");
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        switch(tipo){
            case "Orden":
                modDiag = new FrmAdModOrden(null, true, "Modificar");
                modDiag.setVisible(true);
                break;
            case "Producto":
                modDiag = new FrmAdModProducto(null, true, "Modificar");
                modDiag.setVisible(true);
                break;
            case "Usuario":
                modDiag = new FrmAdModUsuario(null, true, "Modificar");
                modDiag.setVisible(true);
                break;
            default :
                //NULL
                break;
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        switch(tipo){
            case "Orden":
                modDiag = new FrmAdModOrden(null, true, "Añadir");
                modDiag.setVisible(true);
                break;
            case "Producto":
                modDiag = new FrmAdModProducto(null, true, "Añadir");
                modDiag.setVisible(true);
                break;
            case "Usuario":
                modDiag = new FrmAdModUsuario(null, true, "Añadir");
                modDiag.setVisible(true);
                break;
            default :
                //NULL
                break;
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void cmbCampoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCampoItemStateChanged
        // TODO add your handling code here:
        String option;
        switch(tipo){
            case "Usuario":
                option = cmbCampo.getSelectedItem().toString();
                if(option.equals("Tipo Usuario")){
                    pnlDato.setEnabled(false);
                    pnlDato.setVisible(false);
                    pnlTipoUsr.setEnabled(true);
                    pnlTipoUsr.setVisible(true);
                }else{
                    if(pnlDato.isEnabled()) return;
                    pnlDato.setEnabled(true);
                    pnlDato.setVisible(true);
                    pnlTipoUsr.setEnabled(false);
                    pnlTipoUsr.setVisible(false);
                }
                break;
            case "Orden":
                option = cmbCampo.getSelectedItem().toString();
                if(option.equals("Fecha")){
                    pnlDato.setEnabled(false);
                    pnlDato.setVisible(false);
                    pnlOrdDate.setEnabled(true);
                    pnlOrdDate.setVisible(true);
                }else{
                    if(pnlDato.isEnabled()) return;
                    pnlDato.setEnabled(true);
                    pnlDato.setVisible(true);
                    pnlOrdDate.setEnabled(false);
                    pnlOrdDate.setVisible(false);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cmbCampoItemStateChanged

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        // TODO add your handling code here:
        JDialog borrar = new FrmConfirmBorrar(null, true);
        borrar.setVisible(true);
    }//GEN-LAST:event_btnDelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscqAvanz;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExport;
    private javax.swing.ButtonGroup btnGrpUsrs;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnRegresar;
    private com.toedter.calendar.JCalendar calOrden;
    private javax.swing.JComboBox<String> cmbCampo;
    private com.toedter.calendar.JDateChooser dtFechaOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel lbllCampo;
    private javax.swing.JLayeredPane lpnOptions;
    private javax.swing.JPanel pnlDato;
    private javax.swing.JPanel pnlOrdDate;
    private javax.swing.JPanel pnlTipoUsr;
    private javax.swing.JRadioButton rdoComisionista;
    private javax.swing.JRadioButton rdoGerente;
    private javax.swing.JRadioButton rdoJefe;
    private javax.swing.JRadioButton rdoTodos;
    private javax.swing.JToolBar tblBusqExport;
    private javax.swing.JTable tblDatosTrabajador;
    private javax.swing.JToolBar tlbEditar;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
