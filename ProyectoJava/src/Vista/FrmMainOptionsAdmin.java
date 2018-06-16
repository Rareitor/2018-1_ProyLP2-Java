package Vista;
import Reportes.GenerarReporte;
import Vista.panels.*;
import Controlador.PayeeBL;
import Modelo.Payee;
import javax.swing.*;
import java.awt.*;


public class FrmMainOptionsAdmin extends javax.swing.JFrame {
    private final Payee currentUser;
    private FrmAdministrarCuenta administrarCuenta;
    private FrmAnadirNoticia addNoticia;
    private FrmReportarInfraccion reportarInfraccion;
    private FrmRealizarBackup backup;
    private FrmPapeleraReciclaje papelera;
    private FrmVerRecomendaciones verRecom;
    private FrmNoticias verNoticia;
    private FrmVisualizarInfraccion visualizarInfracciones;
    private FrmVisualizarUsuario usuarios;
    private FrmVisualizarCanal canalesVenta;
    private FrmVisualizarProducto productos;
    private FrmVisualizarOrdenes comisiones;
    private FrmFijarPeriodoCalculo fijarPerCalc;
    private FrmGestionarObjeto gestOrden;
    private FrmGestionarObjeto gestProducto;
    private FrmGestionarObjeto gestUsuario;
    private JInternalFrame calcularComisiones;
    private JInternalFrame productosDestacados;
    private JInternalFrame payeesDestacados;
    private PnlVerMapa verMapa;
    private PayeeBL logicaNegocio;
    private String idPayee;
    private java.awt.Frame parent;
    /**
     * Creates new form NewJDialog
     */
    public FrmMainOptionsAdmin(java.awt.Frame parent, boolean modal, Payee user) {
        //super(parent, modal);
        this.parent = parent;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        logicaNegocio = new PayeeBL();
        currentUser = user;
        try{
            if(currentUser == null){
                throw new Exception();
            }else{
                setVisibleOpts();
                this.setTitle("GESCOM TDP - " + currentUser.getCargo());

                this.initForms();
                this.idPayee = logicaNegocio.obtenerId(currentUser.getUserName());
            }            
        }catch(Exception ex){
            System.out.println("No user has been detected.");
            JOptionPane.showMessageDialog(this, "NO USER DETECTED", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        this.setLocationRelativeTo(null);
    }
    
    private void initForms(){
        administrarCuenta = null;
        addNoticia = null;
        reportarInfraccion = null;
        backup = null;
        papelera = null;
        verRecom = null;
        verNoticia = null;
        visualizarInfracciones = null;
        usuarios = null;
        canalesVenta = null;
        productos = null;
        comisiones = null;
        fijarPerCalc = null;
        gestOrden = null;
        gestProducto = null;
        gestUsuario = null;
        verMapa = null;
        calcularComisiones = null;
        productosDestacados = null;
        payeesDestacados = null;
    }
    
    private void setVisibleOpts(){
        menuiComisiones.setVisible(false);
        menuiProductos.setVisible(false);
        menuiCanalesVenta.setVisible(false);
        menuPersonalCargo.setVisible(false);
        menuiInfracciones.setVisible(false);
        menuiNoticias.setVisible(false);
        menuiAnadirNoticias.setVisible(false);
        menuAdministracion.setVisible(false);
        menuiAnadirNoticias.setVisible(false);
        menuiRecomendaciones.setVisible(false);
        menuiReportInfraccion.setVisible(false);
        menuiPapelera.setVisible(false);
        menuiBackup.setVisible(false);
       // menuiCambContr.setVisible(false);
        
        switch(currentUser.getCargo()){
            case "ADMINISTRADOR":
                menuVisualizacion.setVisible(false);
                menuiCalcularComisiones.setVisible(false);
                menuiReportInfraccion.setVisible(false);
                menuiVerMapa.setVisible(false);
                menuReportes.setVisible(false);
                menuOtros.setVisible(false);
                break;
            case "GERENTE":
                menuiGestUsuario.setVisible(false);
                menuiGestProducto.setVisible(false);
                menuiFijarPeriodo.setVisible(false);
                menuiVerGerentes.setVisible(false);
                menuiPapelera.setVisible(false);
                menuiBackup.setVisible(false);
                //menuiEnvRecomendaciones.setVisible(false);
                menuiReportInfraccion.setVisible(false);
                break;
            case "JEFE":
                menuiGestUsuario.setVisible(false);
                menuiGestProducto.setVisible(false);
                menuCalculo.setVisible(false);
                menuiVerGerentes.setVisible(false);
                menuiVerJefes.setVisible(false);
                menuiInfracciones.setVisible(false);
                //menuiEnvRecomendaciones.setVisible(false);
                menuiPapelera.setVisible(false);
                menuiBackup.setVisible(false);
                menuiAnadirNoticias.setVisible(false);
                menuiVerProdDestacados.setVisible(false);
                menuReportes.setVisible(false);
                break;
            case "COMISIONISTA":
                menuVisualizacion.setVisible(false);
                menuiGestUsuario.setVisible(false);
                menuiGestProducto.setVisible(false);
                menuCalculo.setVisible(false);
                menuPersonalCargo.setVisible(false);
                menuiInfracciones.setVisible(false);
                //menuiEnvRecomendaciones.setVisible(false);
                menuiPapelera.setVisible(false);
                menuiBackup.setVisible(false);
                menuiAnadirNoticias.setVisible(false);
                menuiVerGerentes.setVisible(false);
                menuiVerProdDestacados.setVisible(false);
                menuiVerPayeeDestacados.setVisible(false);
                menuReportes.setVisible(false);
                break;
            //case "sysadmin": break;
            default: 
                JOptionPane.showMessageDialog(this, "Usuario desconocido.");
                break;
        }
    }
        
    private void getUserForm(String listar){
        if(usuarios != null){
            try{
                usuarios.setClosed(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            usuarios.dispose();
        }
        usuarios = new FrmVisualizarUsuario(listar, this.idPayee, currentUser.getCargo());
        usuarios.setClosable(true);
        dskPnPrincipal.add(usuarios);
        usuarios.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPnPrincipal = new javax.swing.JDesktopPane();
        menubPrincipal = new javax.swing.JMenuBar();
        menuAdministracion = new javax.swing.JMenu();
        menuiGestUsuario = new javax.swing.JMenuItem();
        menuiGestOrden = new javax.swing.JMenuItem();
        menuiGestProducto = new javax.swing.JMenuItem();
        menuCalculo = new javax.swing.JMenu();
        menuiFijarPeriodo = new javax.swing.JMenuItem();
        menuiCalcularComisiones = new javax.swing.JMenuItem();
        menuVisualizacion = new javax.swing.JMenu();
        menuiComisiones = new javax.swing.JMenuItem();
        menuiProductos = new javax.swing.JMenuItem();
        menuiCanalesVenta = new javax.swing.JMenuItem();
        menuPersonalCargo = new javax.swing.JMenu();
        menuiVerJefes = new javax.swing.JMenuItem();
        menuiVerComisionistas = new javax.swing.JMenuItem();
        menuiVerGerentes = new javax.swing.JMenuItem();
        menuiInfracciones = new javax.swing.JMenuItem();
        menuiNoticias = new javax.swing.JMenuItem();
        menuiVerProdDestacados = new javax.swing.JMenuItem();
        menuiVerPayeeDestacados = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        menuReporteOrden = new javax.swing.JMenuItem();
        menuReporteComisionistas = new javax.swing.JMenuItem();
        menuOtros = new javax.swing.JMenu();
        menuiRecomendaciones = new javax.swing.JMenuItem();
        menuiPapelera = new javax.swing.JMenuItem();
        menuiBackup = new javax.swing.JMenuItem();
        menuiReportInfraccion = new javax.swing.JMenuItem();
        menuiAnadirNoticias = new javax.swing.JMenuItem();
        menuiVerMapa = new javax.swing.JMenuItem();
        menuCuenta = new javax.swing.JMenu();
        menuiCambDatPer = new javax.swing.JMenuItem();
        menuiCambContr = new javax.swing.JMenuItem();
        menuiPermisos = new javax.swing.JMenuItem();
        menuCerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout dskPnPrincipalLayout = new javax.swing.GroupLayout(dskPnPrincipal);
        dskPnPrincipal.setLayout(dskPnPrincipalLayout);
        dskPnPrincipalLayout.setHorizontalGroup(
            dskPnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1162, Short.MAX_VALUE)
        );
        dskPnPrincipalLayout.setVerticalGroup(
            dskPnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        menuAdministracion.setText("Administración");

        menuiGestUsuario.setText("Gestionar Usuarios");
        menuiGestUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiGestUsuarioActionPerformed(evt);
            }
        });
        menuAdministracion.add(menuiGestUsuario);

        menuiGestOrden.setText("Gestionar Ordenes");
        menuiGestOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiGestOrdenActionPerformed(evt);
            }
        });
        menuAdministracion.add(menuiGestOrden);

        menuiGestProducto.setText("Gestionar Productos");
        menuiGestProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiGestProductoActionPerformed(evt);
            }
        });
        menuAdministracion.add(menuiGestProducto);

        menubPrincipal.add(menuAdministracion);

        menuCalculo.setText("Cálculo");

        menuiFijarPeriodo.setText("Fijar periodo de cálculo");
        menuiFijarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiFijarPeriodoActionPerformed(evt);
            }
        });
        menuCalculo.add(menuiFijarPeriodo);

        menuiCalcularComisiones.setText("Calcular Comisiones");
        menuiCalcularComisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiCalcularComisionesActionPerformed(evt);
            }
        });
        menuCalculo.add(menuiCalcularComisiones);

        menubPrincipal.add(menuCalculo);

        menuVisualizacion.setText("Visualización");

        menuiComisiones.setText("Comisiones");
        menuiComisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiComisionesActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiComisiones);

        menuiProductos.setText("Productos");
        menuiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiProductosActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiProductos);

        menuiCanalesVenta.setText("Canales de Venta");
        menuiCanalesVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiCanalesVentaActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiCanalesVenta);

        menuPersonalCargo.setText("Personal a Cargo");

        menuiVerJefes.setText("Jefes");
        menuiVerJefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerJefesActionPerformed(evt);
            }
        });
        menuPersonalCargo.add(menuiVerJefes);

        menuiVerComisionistas.setText("Comisionistas");
        menuiVerComisionistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerComisionistasActionPerformed(evt);
            }
        });
        menuPersonalCargo.add(menuiVerComisionistas);

        menuiVerGerentes.setText("Gerentes");
        menuiVerGerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerGerentesActionPerformed(evt);
            }
        });
        menuPersonalCargo.add(menuiVerGerentes);

        menuVisualizacion.add(menuPersonalCargo);

        menuiInfracciones.setText("Infracciones");
        menuiInfracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiInfraccionesActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiInfracciones);

        menuiNoticias.setText("Noticias");
        menuiNoticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiNoticiasActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiNoticias);

        menuiVerProdDestacados.setText("Productos Destacados");
        menuiVerProdDestacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerProdDestacadosActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiVerProdDestacados);

        menuiVerPayeeDestacados.setText("Usuarios Destacados");
        menuiVerPayeeDestacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerPayeeDestacadosActionPerformed(evt);
            }
        });
        menuVisualizacion.add(menuiVerPayeeDestacados);

        menubPrincipal.add(menuVisualizacion);

        menuReportes.setText("Reportes");

        menuReporteOrden.setText("Órdenes");
        menuReporteOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteOrdenActionPerformed(evt);
            }
        });
        menuReportes.add(menuReporteOrden);

        menuReporteComisionistas.setText("Pago Comisionistas");
        menuReporteComisionistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteComisionistasActionPerformed(evt);
            }
        });
        menuReportes.add(menuReporteComisionistas);

        menubPrincipal.add(menuReportes);

        menuOtros.setText("Otros");

        menuiRecomendaciones.setText("Ver Recomendaciones");
        menuiRecomendaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiRecomendacionesActionPerformed(evt);
            }
        });
        menuOtros.add(menuiRecomendaciones);

        menuiPapelera.setText("Papelera de Reciclaje");
        menuiPapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiPapeleraActionPerformed(evt);
            }
        });
        menuOtros.add(menuiPapelera);

        menuiBackup.setText("Backup");
        menuiBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiBackupActionPerformed(evt);
            }
        });
        menuOtros.add(menuiBackup);

        menuiReportInfraccion.setText("Reportar Infracción");
        menuiReportInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiReportInfraccionActionPerformed(evt);
            }
        });
        menuOtros.add(menuiReportInfraccion);

        menuiAnadirNoticias.setText("Añadir Noticias");
        menuiAnadirNoticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiAnadirNoticiasActionPerformed(evt);
            }
        });
        menuOtros.add(menuiAnadirNoticias);

        menuiVerMapa.setText("Ver Mapa");
        menuiVerMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiVerMapaActionPerformed(evt);
            }
        });
        menuOtros.add(menuiVerMapa);

        menubPrincipal.add(menuOtros);

        menuCuenta.setText("Mi Cuenta");

        menuiCambDatPer.setText("Cambiar Datos Personales");
        menuiCambDatPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiCambDatPerActionPerformed(evt);
            }
        });
        menuCuenta.add(menuiCambDatPer);

        menuiCambContr.setText("Cambiar Contraseña");
        menuiCambContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiCambContrActionPerformed(evt);
            }
        });
        menuCuenta.add(menuiCambContr);

        menuiPermisos.setText("Permisos");
        menuiPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiPermisosActionPerformed(evt);
            }
        });
        menuCuenta.add(menuiPermisos);

        menubPrincipal.add(menuCuenta);

        menuCerrar.setText("Cerrar Sesión");
        menuCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCerrarMouseClicked(evt);
            }
        });
        menuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarActionPerformed(evt);
            }
        });
        menubPrincipal.add(menuCerrar);

        setJMenuBar(menubPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskPnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskPnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_menuCerrarMouseClicked

    private void menuiCambContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiCambContrActionPerformed
        FrmCambiarContrasena cambiar = new FrmCambiarContrasena(this, true);
        cambiar.setUsername(currentUser.getUserName());
        cambiar.setVisible(true);
    }//GEN-LAST:event_menuiCambContrActionPerformed

    private void menuiCambDatPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiCambDatPerActionPerformed
        // TODO add your handling code here:
        if(administrarCuenta != null){
            try{
                administrarCuenta.setClosed(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            administrarCuenta.dispose();
        }
        administrarCuenta = new FrmAdministrarCuenta(currentUser);
        administrarCuenta.setClosable(true);
        dskPnPrincipal.add(administrarCuenta);
        //System.out.println(dskPnPrincipal.getAllFrames().length);
        administrarCuenta.setVisible(true);
    }//GEN-LAST:event_menuiCambDatPerActionPerformed

    private void menuiAnadirNoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiAnadirNoticiasActionPerformed
        // TODO add your handling code here:
        if(addNoticia != null){
            try{
                addNoticia.setClosed(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            addNoticia.dispose();
        }
        addNoticia = new FrmAnadirNoticia();
        addNoticia.setClosable(true);
        addNoticia.pack();
        dskPnPrincipal.add(addNoticia);
        addNoticia.setVisible(true);
    }//GEN-LAST:event_menuiAnadirNoticiasActionPerformed

    private void menuiReportInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiReportInfraccionActionPerformed
        // TODO add your handling code here:
        if(reportarInfraccion != null){
            try{
                reportarInfraccion.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            reportarInfraccion.dispose();
        }
        reportarInfraccion = new FrmReportarInfraccion();
        reportarInfraccion.setClosable(true);
        reportarInfraccion.pack();
        dskPnPrincipal.add(reportarInfraccion);
        reportarInfraccion.setVisible(true);
    }//GEN-LAST:event_menuiReportInfraccionActionPerformed

    private void menuiBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiBackupActionPerformed
        // TODO add your handling code here:
        if(backup != null){
            try{
                backup.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            backup.dispose();
        }
        backup = new FrmRealizarBackup();
        backup.setClosable(true);
        backup.pack();
        dskPnPrincipal.add(backup);
        backup.setVisible(true);
    }//GEN-LAST:event_menuiBackupActionPerformed

    private void menuiPapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiPapeleraActionPerformed
        // TODO add your handling code here:
        if(papelera != null){
            try{
                papelera.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            papelera.dispose();
        }
        papelera = new FrmPapeleraReciclaje();
        papelera.setClosable(true);
        papelera.pack();
        dskPnPrincipal.add(papelera);
        papelera.setVisible(true);
    }//GEN-LAST:event_menuiPapeleraActionPerformed

    private void menuiRecomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiRecomendacionesActionPerformed
        // TODO add your handling code here:
        if(verRecom != null){
            try{
                verRecom.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            verRecom.dispose();
        }
        verRecom = new FrmVerRecomendaciones();
        verRecom.setClosable(true);
        verRecom.pack();
        dskPnPrincipal.add(verRecom);
        verRecom.setVisible(true);
    }//GEN-LAST:event_menuiRecomendacionesActionPerformed

    private void menuiNoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiNoticiasActionPerformed
        // TODO add your handling code here:
        if(verNoticia != null){
            try{
                verNoticia.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            verNoticia.dispose();
        }
        verNoticia = new FrmNoticias();
        verNoticia.setClosable(true);
        verNoticia.pack();
        dskPnPrincipal.add(verNoticia);
        verNoticia.setVisible(true);
    }//GEN-LAST:event_menuiNoticiasActionPerformed

    private void menuiInfraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiInfraccionesActionPerformed
        // TODO add your handling code here:
        if(visualizarInfracciones != null){
            try{
                visualizarInfracciones.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            visualizarInfracciones.dispose();
        }
        visualizarInfracciones = new FrmVisualizarInfraccion();
        visualizarInfracciones.setClosable(true);
        visualizarInfracciones.pack();
        dskPnPrincipal.add(visualizarInfracciones);
        visualizarInfracciones.setVisible(true);
    }//GEN-LAST:event_menuiInfraccionesActionPerformed

    private void menuiVerGerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerGerentesActionPerformed
        // TODO add your handling code here:
        getUserForm("Gerente");
    }//GEN-LAST:event_menuiVerGerentesActionPerformed

    private void menuiVerComisionistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerComisionistasActionPerformed
        // TODO add your handling code here:
        getUserForm("Comisionista");
    }//GEN-LAST:event_menuiVerComisionistasActionPerformed

    private void menuiVerJefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerJefesActionPerformed
        // TODO add your handling code here:
        getUserForm("Jefe");
    }//GEN-LAST:event_menuiVerJefesActionPerformed

    private void menuiCanalesVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiCanalesVentaActionPerformed
        // TODO add your handling code here:
        if(canalesVenta != null){
            try{
                canalesVenta.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            canalesVenta.dispose();
        }
        canalesVenta = new FrmVisualizarCanal();
        canalesVenta.setClosable(true);
        canalesVenta.pack();
        dskPnPrincipal.add(canalesVenta);
        canalesVenta.setVisible(true);
    }//GEN-LAST:event_menuiCanalesVentaActionPerformed

    private void menuiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiProductosActionPerformed
        if(productos != null){
            try{
                productos.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            productos.dispose();
        }
        productos = new FrmVisualizarProducto();
        productos.setClosable(true);
        productos.pack();
        dskPnPrincipal.add(productos);
        productos.setVisible(true);
    }//GEN-LAST:event_menuiProductosActionPerformed

    private void menuiComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiComisionesActionPerformed
        // TODO add your handling code here:
        if(comisiones != null){
            try{
                comisiones.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            comisiones.dispose();
        }
        comisiones = new FrmVisualizarOrdenes(currentUser.getCargo(),this.idPayee);
        comisiones.setClosable(true);
        comisiones.pack();
        dskPnPrincipal.add(comisiones);
        comisiones.setVisible(true);
    }//GEN-LAST:event_menuiComisionesActionPerformed

    private void menuiCalcularComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiCalcularComisionesActionPerformed
        // TODO add your handling code here:
        if(calcularComisiones != null){
            try{
                calcularComisiones.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            calcularComisiones.dispose();
        }
        calcularComisiones = new JInternalFrame();
//        PnlCalcComis pnl = new PnlCalcComis();
//        calcularComisiones.setContentPane(pnl);
        calcularComisiones.setContentPane(new PnlCalcComis());
        calcularComisiones.setClosable(true);
        calcularComisiones.pack();
        dskPnPrincipal.add(calcularComisiones);
        calcularComisiones.setVisible(true);
    }//GEN-LAST:event_menuiCalcularComisionesActionPerformed

    private void menuiFijarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiFijarPeriodoActionPerformed
        // TODO add your handling code here:
        if(fijarPerCalc != null){
            try{
                fijarPerCalc.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            fijarPerCalc.dispose();
        }
        fijarPerCalc = new FrmFijarPeriodoCalculo();
        fijarPerCalc.setClosable(true);
        fijarPerCalc.pack();
        dskPnPrincipal.add(fijarPerCalc);
        fijarPerCalc.setVisible(true);
    }//GEN-LAST:event_menuiFijarPeriodoActionPerformed

    private void menuiGestProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiGestProductoActionPerformed
        // TODO add your handling code here:
        if(gestProducto != null){
            try{
                gestProducto.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            gestProducto.dispose();
        }
        gestProducto = new FrmGestionarObjeto("Producto");
        gestProducto.setClosable(true);
        gestProducto.pack();
        dskPnPrincipal.add(gestProducto);
        gestProducto.setVisible(true);
    }//GEN-LAST:event_menuiGestProductoActionPerformed

    private void menuiGestOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiGestOrdenActionPerformed
        // TODO add your handling code here:
        if(gestOrden != null){
            try{
                gestOrden.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            gestOrden.dispose();
        }
        gestOrden = new FrmGestionarObjeto("Orden");
        gestOrden.setClosable(true);
        gestOrden.pack();
        dskPnPrincipal.add(gestOrden);
        gestOrden.setVisible(true);
    }//GEN-LAST:event_menuiGestOrdenActionPerformed

    private void menuiGestUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiGestUsuarioActionPerformed
        // TODO add your handling code here:
        if(gestUsuario != null){
            try{
                gestUsuario.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            gestUsuario.dispose();
        }
        gestUsuario = new FrmGestionarObjeto("Usuario");
        gestUsuario.setClosable(true);
        gestUsuario.pack();
        dskPnPrincipal.add(gestUsuario);
        gestUsuario.setVisible(true);
    }//GEN-LAST:event_menuiGestUsuarioActionPerformed

    private void menuiVerMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerMapaActionPerformed
        final JDialog marco = new JDialog(this,"Ver Mapa",true);
        verMapa = new PnlVerMapa();
        marco.add(verMapa);
        marco.pack();
        marco.setSize(600,700);
        marco.setVisible(true);
    }//GEN-LAST:event_menuiVerMapaActionPerformed

    private void menuiPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiPermisosActionPerformed
        // TODO add your handling code here:
        FrmPermisos permisos = new FrmPermisos(this, "Permisos", true);
        permisos.setUser(currentUser);
        //final JDialog marco = new JDialog(this,"Ver Mapa",true);
        permisos.setVisible(true);
    }//GEN-LAST:event_menuiPermisosActionPerformed

    private void menuiVerProdDestacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerProdDestacadosActionPerformed
        // TODO add your handling code here:
        if(productosDestacados != null){
            try{
                productosDestacados.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            productosDestacados.dispose();
        }
        productosDestacados = new JInternalFrame();
//        PnlGrafTopProductos pnl = new PnlGrafTopProductos();
//        productosDestacados.setContentPane(pnl);
        productosDestacados.setContentPane(new PnlGrafTopProductos());
        productosDestacados.setClosable(true);
        productosDestacados.pack();
        dskPnPrincipal.add(productosDestacados);
        productosDestacados.setVisible(true);
    }//GEN-LAST:event_menuiVerProdDestacadosActionPerformed

    private void menuiVerPayeeDestacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiVerPayeeDestacadosActionPerformed
        // TODO add your handling code here:
        if(payeesDestacados != null){
            try{
                payeesDestacados.setClosed(true);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            payeesDestacados.dispose();
        }
        payeesDestacados = new JInternalFrame();
        PnlGrafTopComisionistas pnlg = new PnlGrafTopComisionistas(idPayee);
        payeesDestacados.setContentPane(pnlg);
        payeesDestacados.setClosable(true);
        payeesDestacados.pack();
        dskPnPrincipal.add(payeesDestacados);
        payeesDestacados.setVisible(true);
    }//GEN-LAST:event_menuiVerPayeeDestacadosActionPerformed

    private void menuReporteOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteOrdenActionPerformed
        GenerarReporte reporte = new GenerarReporte();
        reporte.reporteOrden();
    }//GEN-LAST:event_menuReporteOrdenActionPerformed

    private void menuReporteComisionistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteComisionistasActionPerformed
        GenerarReporte reporte = new GenerarReporte();
        reporte.reportePagoComisionistas();
    }//GEN-LAST:event_menuReporteComisionistasActionPerformed

    private void menuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarActionPerformed
//        FrmLogin frmLogin = new FrmLogin();
//        frmLogin.setVisible(true);
//        this.dispose();
        System.out.println("xddd");
        parent.setVisible(true);
        System.out.println(parent.getTitle());
        //this.dispose();
           
    }//GEN-LAST:event_menuCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainOptionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainOptionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainOptionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainOptionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmMainOptionsAdmin dialog = new FrmMainOptionsAdmin(new javax.swing.JFrame(), true , null);
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
    private javax.swing.JDesktopPane dskPnPrincipal;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuCalculo;
    private javax.swing.JMenu menuCerrar;
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenu menuOtros;
    private javax.swing.JMenu menuPersonalCargo;
    private javax.swing.JMenuItem menuReporteComisionistas;
    private javax.swing.JMenuItem menuReporteOrden;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuVisualizacion;
    private javax.swing.JMenuBar menubPrincipal;
    private javax.swing.JMenuItem menuiAnadirNoticias;
    private javax.swing.JMenuItem menuiBackup;
    private javax.swing.JMenuItem menuiCalcularComisiones;
    private javax.swing.JMenuItem menuiCambContr;
    private javax.swing.JMenuItem menuiCambDatPer;
    private javax.swing.JMenuItem menuiCanalesVenta;
    private javax.swing.JMenuItem menuiComisiones;
    private javax.swing.JMenuItem menuiFijarPeriodo;
    private javax.swing.JMenuItem menuiGestOrden;
    private javax.swing.JMenuItem menuiGestProducto;
    private javax.swing.JMenuItem menuiGestUsuario;
    private javax.swing.JMenuItem menuiInfracciones;
    private javax.swing.JMenuItem menuiNoticias;
    private javax.swing.JMenuItem menuiPapelera;
    private javax.swing.JMenuItem menuiPermisos;
    private javax.swing.JMenuItem menuiProductos;
    private javax.swing.JMenuItem menuiRecomendaciones;
    private javax.swing.JMenuItem menuiReportInfraccion;
    private javax.swing.JMenuItem menuiVerComisionistas;
    private javax.swing.JMenuItem menuiVerGerentes;
    private javax.swing.JMenuItem menuiVerJefes;
    private javax.swing.JMenuItem menuiVerMapa;
    private javax.swing.JMenuItem menuiVerPayeeDestacados;
    private javax.swing.JMenuItem menuiVerProdDestacados;
    // End of variables declaration//GEN-END:variables
}
