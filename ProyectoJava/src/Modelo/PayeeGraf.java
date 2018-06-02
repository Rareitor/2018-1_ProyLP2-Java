/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * @author Emilio
 */
public class PayeeGraf {

    public PayeeGraf(String nombre, double totSum) {
        this.nombre = nombre;
        this.totSum = totSum;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotSum() {
        return totSum;
    }

    public void setTotSum(double totSum) {
        this.totSum = totSum;
    }

    private String nombre;
    private double totSum;
}
