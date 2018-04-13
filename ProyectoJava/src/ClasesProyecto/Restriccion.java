package ClasesProyecto;

public class Restriccion extends Parametrica{
//atributos
    private String descripcion;
    private int numValor;
//métodos
    //constructores
    public Restriccion() {
    }
    //setters y getters
    
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcionOperacion(String descripcion) {
        this.descripcion= descripcion;
    }

    public int getNumValor() {
        return this.numValor;
    }

    public void setNumValor(int numValor) {
        this.numValor = numValor;
    }
	
    //métodos adicionales
   
    @Override
    public void mostrarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }        
    
}
