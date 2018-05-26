package Modelo;
import java.util.Date;

public abstract class Trabajador extends Persona{
//atributos	
    protected String idTrabajador;
    protected Date fechaIngreso;
    protected String email;
    protected String userName;
    protected String password;
//métodos
    //constructores
    public Trabajador(){
        super();
        this.idTrabajador = null;
        this.fechaIngreso = null;
        this.email = null;
        this.userName = null;
        this.password = null;
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

    public String getPassword(){
            return this.password;
    }

    public void setPassword(String password){
            this.password = password;
    }
}