package Modelo;
import java.util.Date;

public abstract class Trabajador extends Persona{
//atributos	
    private String idTrabajador;
    private TipoRegimen regimen;
    private Date fechaIngreso;
    private String email;
    private String telefono;
    private String userName;
    private String password;
//métodos
    //constructores
    public Trabajador(){
    }

    //setters y getters

    public void setIdTrabajador(String idTrabajador){
            this.idTrabajador = idTrabajador;
    }

    public String getIdTrabajador(){
            return this.idTrabajador;
    }

    public void setTipoRegimen(TipoRegimen regimen){
            this.regimen = regimen;
    }

    public TipoRegimen getTipoRegimen(){
            return this.regimen;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
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
    
    //métodos adicionales

    public abstract void emitirReporte();
}