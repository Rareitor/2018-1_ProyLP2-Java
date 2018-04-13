package ClasesProyecto;

public class Canal {
//Atributos
	private String idCanal;
	private String nombre;
	private String responsable;
	private String zona;
//M�todos
    //Constructor
    public Canal(){
    };
	
    //Setters y getters

    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    //métodos adicionales
}