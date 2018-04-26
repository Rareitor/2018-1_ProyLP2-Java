package Modelo;

import java.util.Date;

public class Bono extends Retribucion {
//Atributos
    private float monto;
    private Date fechaEmision;
//Metodos
    //Constructor
    public Bono(){
    };
	
    //Setters y getters

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    //métodos adicionales
}