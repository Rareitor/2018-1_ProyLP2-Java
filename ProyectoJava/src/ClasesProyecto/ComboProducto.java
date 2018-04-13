package ClasesProyecto;

import java.util.ArrayList;

public class ComboProducto extends Parametrica {
 
//atributos
    private ArrayList<Producto> productos;
    
//metodos
    //constructores
    public ComboProducto(){
        
    }
	
	
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    

    //métodos adicionales
    public void insertarProductoalCombo(Producto p){
        // productos.add(p);
    }
    
   @Override
    public void mostrarReporte() {        
    }
    
}
