package Vista;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class PnlVerMapa extends javax.swing.JPanel {
    public static final int MAX_DISTRITOS = 4;
    private BufferedImage[] imagenes;
    private BufferedImage background;
    private int currDistrito;
    private ArrayList<String> lista;
    //private ---BL logicaNegocio;
    JButton buttonPrevious,buttonNext;
    
    public PnlVerMapa() {
        initComponents();   
        currDistrito = 0;
        imagenes = new BufferedImage[MAX_DISTRITOS];
        //lista = logicaNegocio.listarDistritos();
        lista = new ArrayList<String>();
        lista.add("Pueblo Libre");
        lista.add("San Miguel");
        lista.add("Chorrillos");
        lista.add("Magdalena");
        agregarComponentes();
    }
    
    private void agregarComponentes(){
        String cadDistritos = lista.get(0);
        for(int i=1;i<MAX_DISTRITOS;i++){
            if(i==MAX_DISTRITOS-1)
                cadDistritos += " y " + lista.get(i);
            else
                cadDistritos += ", " + lista.get(i);
        }
        labelDistrito.setText(cadDistritos);
        
        //Agregamos la imagen de fondo
        String cadena = "./src/Distritos/Mapa en blanco.png";
        try {
            background = ImageIO.read(new File(cadena));
        } catch (Exception e){
            System.out.println("Error en la carga de la imagen");
        }
        
        //Agregamos cada distrito
        for(int i=0;i<MAX_DISTRITOS;i++){
            cadena = "./src/Distritos/" + lista.get(i) + ".png";
            try {
                imagenes[i] = ImageIO.read(new File(cadena));
            } catch (Exception e){
                System.out.println("Error en la carga de la imagen" + i);
            }
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background, 90, 100, this);
        for(int i=0;i<MAX_DISTRITOS;i++)
            g.drawImage(imagenes[i], 90, 100, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelDistrito = new javax.swing.JLabel();

        setToolTipText("Ver Mapa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Actualmente, los distritos con mayor índice de comisiones son: ");

        labelDistrito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDistrito.setText("Texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDistrito)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelDistrito)
                .addContainerGap(444, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel labelDistrito;
    // End of variables declaration//GEN-END:variables
}
