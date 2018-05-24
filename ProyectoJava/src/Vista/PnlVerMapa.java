package Vista;

import Controlador.DistritoBL;
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
    public static final int MAX_DISTRITOS = 25;
    private BufferedImage[] imagenes;
    private BufferedImage background;
    private int numDistritos = 0;
    private List<String> lista;
    private DistritoBL logicaNegocio;
    JButton buttonPrevious,buttonNext;
    hiloCargarMapa hilo;
    
    public PnlVerMapa() {
        hilo = new hiloCargarMapa();
        hilo.start();
        //Empieza concurrencia
        numDistritos = 4;
        initComponents(); 
        //Termina concurrencia
        try{
            hilo.join();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void escribirLabel(){
        String cadDistritos = lista.get(0);
        for(int i=1;i<numDistritos;i++){
            if(i==lista.size()-1)
                cadDistritos += " y " + lista.get(i);
            else
                cadDistritos += ", " + lista.get(i);
        }
        labelDistrito.setText(cadDistritos);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background, 90, 130, this);
        if (imagenes[0] == null){
            return;
        }
        
        escribirLabel();
        for(int i=0;i<numDistritos;i++)
            g.drawImage(imagenes[i], 90, 130, this);
    }
    
    private class hiloCargarMapa extends Thread {
        @Override
        public void run(){
            logicaNegocio = new DistritoBL();
            lista = logicaNegocio.listarDistritos();
//            lista = new ArrayList<String>();
//            lista.add("Pueblo Libre");
//            lista.add("San Miguel");
//            lista.add("Chorrillos");
//            lista.add("Magdalena");

            //Agregamos la imagen de fondo
            String cadena = "./src/Distritos/Mapa en blanco.png";
            try {
                background = ImageIO.read(new File(cadena));
            } catch (Exception e){
                System.out.println("Error en la carga de la imagen");
            }
            imagenes = new BufferedImage[MAX_DISTRITOS];
            //Agregamos todos los distritos
            for(int i=0;i<lista.size();i++){
                cadena = "./src/Distritos/" + lista.get(i) + ".png";
                try {
                    imagenes[i] = ImageIO.read(new File(cadena));
                } catch (Exception e){
                    System.out.println("Error en la carga de la imagen" + i);
                }
            }
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelDistrito = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumDistritos = new javax.swing.JTextField();
        btnver = new javax.swing.JButton();

        setToolTipText("Ver Mapa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Actualmente, los distritos con mayor índice de comisiones son: ");

        labelDistrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDistrito.setText("Texto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Número de distritos: ");

        txtNumDistritos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumDistritos.setText("4");

        btnver.setText("Ver");
        btnver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDistrito)
                            .addGap(108, 108, 108)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(txtNumDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnver)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumDistritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelDistrito)
                .addGap(0, 424, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverMouseClicked
        if(imagenes[0] == null){
                JOptionPane.showMessageDialog(this, "Aún no existen ordenes con distritos válidos para mostrar", "Error en listar distritos", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
        try {
            int newnum = Integer.parseInt(txtNumDistritos.getText());
            if (newnum <= 0 || newnum > MAX_DISTRITOS || newnum > lista.size())
                throw new Exception();
            numDistritos = newnum;
            repaint();
        }catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Por favor, inserte un número válido", "Número de distritos inválido",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel labelDistrito;
    private javax.swing.JTextField txtNumDistritos;
    // End of variables declaration//GEN-END:variables
}
