package Modelo;

public abstract class Persona{
//atributos	
    protected String dni;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
//métodos
    //constructores
    public Persona(){
        this.dni = null;
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
    }

    //setters y getters
    public void setDni(String dni){
            this.dni = dni;
    }

    public String getDni(){
            return this.dni;
    }

    public void setNombre(String nombre){
            this.nombre = nombre;
    }

    public String getNombre(){
            return this.nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno){
            this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno(){
            return this.apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
            this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoMaterno(){
            return this.apellidoMaterno;
    }
	
}