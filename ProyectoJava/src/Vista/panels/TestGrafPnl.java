/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.panels;

import Modelo.Payee;
import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Emilio
 */
public class TestGrafPnl extends javax.swing.JPanel {

    private final ArrayList<Color> lstClr;
    private ArrayList<Payee> lst;
    private Double tot;
    
    public void setLst(ArrayList<Payee> lst) {
        this.lst = lst;
    }
    public void setTot(Double tot) {
        this.tot = tot;
    }
    /**
     * Creates new form TestGrafPnl
     */
    public TestGrafPnl() {
        this.lstClr = new ArrayList<>();
        initGrafElems();
        initComponents();
    }
    
    private void initGrafElems(){
        setLst(null);
        setTot(null);
        lstClr.add(Color.blue);
        lstClr.add(Color.green);
        lstClr.add(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        if(lst != null && tot != null)
        try{
            int lim = 20;
            int y = 120;
            DecimalFormat df = new DecimalFormat("#.##"); 
            g.drawRect(290, 50, 190, 190);
            g.drawString("Leyenda", 290, y-80);
            g.drawString("Nombre", 335, y-25 );
            g.drawString("Monto (S/.)", 415, y-25);
            for(int i = 0; i < lst.size(); i++){

                g.setColor(lstClr.get(i));
                g.fillRect(295, y-10, 20, 20);
                g.fillArc(40, 25, 220, 250, lim-20, 360-lim+20);
                lim += (int) (360*lst.get(i).getMonto()/tot);
                g.setColor(Color.black);
                g.drawString(lst.get(i).getNombre() + " " + lst.get(i).getApellidoPaterno(), 320, y);
                double monto = lst.get(i).getMonto();
                g.drawString(df.format(monto), 435, y);
                y += 30;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
