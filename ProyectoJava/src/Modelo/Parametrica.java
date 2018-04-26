package Modelo;

import java.util.Date;

public abstract class Parametrica {
    
//atributos
    private Canal canal;
    private Combo combo;
    private Date fechaInicio;
    private Date fechaFinal;
    
//métodos
    //constructores
    public Parametrica (){
    }  
    //setters y getters
    public Canal getCanal() {
        return this.canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Combo getCombo() {
        return this.combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return this.fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    //métodos adicionales
    public abstract void mostrarReporte();
}
    
    