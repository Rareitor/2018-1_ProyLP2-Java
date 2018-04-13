package ClasesProyecto;

import java.util.Date;
public class Comision extends Retribucion {
//atributos
    private float monto;
    private Date fechaVenta;
    private Date fechaEmision;
//metodos
    //Constructores
    public Comision(){

    };
	
    //setters y getters

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    //métodos adicionoales
}