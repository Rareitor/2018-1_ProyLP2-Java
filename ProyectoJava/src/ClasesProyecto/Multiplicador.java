package ClasesProyecto;

public class Multiplicador extends Parametrica{
//atributos
    private float mult;
    private String descripcion;
 //métodos   
    //constructores
    public Multiplicador() {
    }
    //setters y getters
    public float getMultiplicador() {
        return this.mult;
    }

    public void setMultiplicador(float multiplicador) {
        this.mult= multiplicador;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //métodos adicionales
    @Override
    public void mostrarReporte() {
    }

    
   
    
}
