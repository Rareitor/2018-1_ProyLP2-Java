package Vista.panels;

import Controlador.DistritoBL;
import Modelo.Distrito;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PnlVerMapa extends javax.swing.JPanel {
    public static final int MAX_DISTRITOS = 30;
    private BufferedImage[] imagenes;
    private BufferedImage background;
    private int numDistritos = 0;
    private List<Distrito> lista;
    private DistritoBL logicaNegocio;
    private int currentDistrito;
    hiloCargarMapa hilo;
    
    public PnlVerMapa() {
        hilo = new hiloCargarMapa();
        hilo.start();
        //Empieza concurrencia
        initComponents(); 
        currentDistrito = 0;
        //Termina concurrencia
        try{
            hilo.join();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void escribirLabel(){
        String texto = lista.get(currentDistrito).getNombre() +
                " con " + 
                String.valueOf(lista.get(currentDistrito).getCantidadOrdenes()) + 
                " órdenes";
        labelDistritoActual.setText(texto);
    }
    
    private void ocultarBotones(){
//        System.out.println(currentDistrito);
        if(currentDistrito == 0)
            botonPrevious.setVisible(false);
        else if(currentDistrito == numDistritos-1)
            botonNext.setVisible(false);
        else {
            botonPrevious.setVisible(true);
            botonNext.setVisible(true);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        ocultarBotones();
        g.drawImage(background, 90, 90, this);
        escribirLabel();
        if (imagenes[currentDistrito] == null){
            return;
        }
        g.drawImage(imagenes[currentDistrito], 90, 90, this);
    }
    
    private class hiloCargarMapa extends Thread {
        @Override
        public void run(){
            logicaNegocio = new DistritoBL();
            lista = logicaNegocio.listarDistritos();
            numDistritos = lista.size();
//            System.out.println(numDistritos);
            //Agregamos la imagen de fondo
            String cadena = "./src/Distritos/Mapa en blanco.png";
            try {
                background = ImageIO.read(new File(cadena));
            } catch (Exception e){
                System.out.println("Error en la carga de la imagen de fondo");
            }
            imagenes = new BufferedImage[MAX_DISTRITOS];
            //Agregamos todos los distritos
            for(int i=0;i<lista.size();i++){
                cadena = "./src/Distritos/" + lista.get(i).getNombre() + ".png";
                try {
                    imagenes[i] = ImageIO.read(new File(cadena));
                } catch (Exception e){
                    System.out.println("Error en la carga de la imagen: " + lista.get(i) + ".png");
                }
            }
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelDistritoActual = new javax.swing.JLabel();
        botonPrevious = new javax.swing.JButton();
        botonNext = new javax.swing.JButton();

        setToolTipText("Ver Mapa");
        setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Actualmente, los distritos con mayor índice de comisiones son: ");

        labelDistritoActual.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        labelDistritoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDistritoActual.setText("Distrito");

        botonPrevious.setText("◄");
        botonPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPreviousMouseClicked(evt);
            }
        });

        botonNext.setText("►");
        botonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(botonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelDistritoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelDistritoActual)
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        botonNext.setBounds(580, 430, 20, 20);
        botonPrevious.setBounds(20, 430, 20, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void botonPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPreviousMouseClicked
        if (currentDistrito != 0) currentDistrito--;
        repaint();
    }//GEN-LAST:event_botonPreviousMouseClicked

    private void botonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNextMouseClicked
        if (currentDistrito != numDistritos-1) currentDistrito++;
        repaint();
    }//GEN-LAST:event_botonNextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNext;
    private javax.swing.JButton botonPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDistritoActual;
    // End of variables declaration//GEN-END:variables
}
