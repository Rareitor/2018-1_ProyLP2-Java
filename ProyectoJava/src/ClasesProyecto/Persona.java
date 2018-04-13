package ClasesProyecto;

public abstract class Persona{
//atributos	
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
//métodos
    //constructores
    public Persona(){
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

    public void setEdad(int edad){
            this.edad = edad;
    }

    public int getEdad(){
            return this.edad;
    }

    //métodos adicionales
	
}