package Modelo;
import java.util.Date;

public abstract class Trabajador extends Persona{
//atributos	
    protected String idTrabajador;
    protected Date fechaIngreso;
    protected String email;
    protected String userName;
    protected Double monto;


//métodos
    //constructores
    public Trabajador(){
        super();
        this.idTrabajador = null;
        this.fechaIngreso = null;
        this.email = null;
        this.userName = null;
    }

    //setters y getters

    public void setIdTrabajador(String idTrabajador){
            this.idTrabajador = idTrabajador;
    }

    public String getIdTrabajador(){
            return this.idTrabajador;
    }

    public void setFechaIngreso(Date fechaIngreso){
            this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso(){
            return this.fechaIngreso;
    }
      
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
	
    public String getUserName(){
            return this.userName;
    }

    public void setUserName(String userName){
            this.userName = userName;
    }
    
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}