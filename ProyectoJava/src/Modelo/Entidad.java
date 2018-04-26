package Modelo;
import java.util.Date;

public abstract class Entidad {
/*Clase abstracta que representa a todas las clases que tenga como PK a un id,
tengan una fecha de validad y un canal de venta. */
//atributos
    protected String id;
    protected Date fechaInicio;
    protected Date fechaFinal;
    protected Canal canal;
//métododos
    //contructores
    public Entidad() {
    }
    //setters y getters    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    //métodos adicionoales
    
}
