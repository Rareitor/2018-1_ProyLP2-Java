package Vista;

import Controlador.OrdenBL;
import Modelo.Orden;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmVisualizarOrdenes extends javax.swing.JInternalFrame {

    private OrdenBL logicaNegocio;
    private List<Orden> listaOrdenes;
    private String puesto;
    private String idPayee;
    
    public FrmVisualizarOrdenes(String puesto, String idPayee) {
        initComponents();
        listaOrdenes = new ArrayList<>();
        logicaNegocio = new OrdenBL();
        this.puesto = puesto;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrdenes = new javax.swing.JTable();
        lblTipoReporte = new javax.swing.JLabel();
        rdoMensual = new javax.swing.JRadioButton();
        rdoRadio = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        dateFIni = new com.toedter.calendar.JDateChooser();
        dateFFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();

        setToolTipText("Visualizar Órdenes");

        lblFechaInicio.setText("Fecha de Inicio:");
        lblFechaInicio.setToolTipText("");

        lblFechaFin.setText("Fecha de Fin:");
        lblFechaFin.setToolTipText("");

        tbOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Comisionista", "Fecha", "Canal", "Monto vendido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbOrdenes);

        lblTipoReporte.setText("Seleccione el tipo de reporte:");

        rdoMensual.setText("Mensual");

        rdoRadio.setText("Radio");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnImprimir.setText("Imprimir");

        btnExportar.setText("Exportar");

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Total: ");

        textTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoReporte)
                        .addGap(47, 47, 47)
                        .addComponent(rdoMensual)
                        .addGap(38, 38, 38)
                        .addComponent(rdoRadio)
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaInicio)
                            .addComponent(dateFFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaFin)
                                .addGap(145, 145, 145)
                                .addComponent(btnBuscar))
                            .addComponent(dateFIni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoReporte)
                    .addComponent(rdoMensual)
                    .addComponent(rdoRadio))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaInicio)
                        .addGap(9, 9, 9)
                        .addComponent(dateFIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaFin)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addGap(30, 30, 30)
                        .addComponent(btnExportar)
                        .addGap(30, 30, 30)
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        try{
            this.setClosed(true);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Listamos
        Date fecha1 = dateFIni.getDate();
        Date fecha2 = dateFFin.getDate();
        Double subtotal = 0.0;
        switch(puesto){
            case "Comisionista":
                listaOrdenes = logicaNegocio.listarOrdenesComisionista(this.idPayee, fecha1, fecha2);
                break;
            case "Jefe":
                listaOrdenes = logicaNegocio.listarOrdenesJefe(this.idPayee, fecha1, fecha2);
                break;
            default:
                listaOrdenes = logicaNegocio.listarOrdenesGerente(fecha1, fecha2);
                break;  
        }
        
        //Borramos toda la data
        DefaultTableModel modelo = (DefaultTableModel) tbOrdenes.getModel();
        int rowCount = modelo.getRowCount();
        for (int i=0;i<rowCount;i++) modelo.removeRow(i);
        
        Object[] fila = new Object [3];
        for (int i=0;i<listaOrdenes.size();i++){
            fila[0] = listaOrdenes.get(i).getIdProducto();
            fila[1] = listaOrdenes.get(i).getMontoPago();
            fila[2] = listaOrdenes.get(i).getIdProducto();
            fila[3] = listaOrdenes.get(i).getIdCanal();
            fila[4] = listaOrdenes.get(i).getFechaVenta();
            subtotal += listaOrdenes.get(i).getMontoPago();
            modelo.addRow(fila);
        }
        
        textTotal.setText(subtotal.toString());
    }//GEN-LAST:event_btnBuscarMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dateFFin;
    private com.toedter.calendar.JDateChooser dateFIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblTipoReporte;
    private javax.swing.JRadioButton rdoMensual;
    private javax.swing.JRadioButton rdoRadio;
    private javax.swing.JTable tbOrdenes;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
