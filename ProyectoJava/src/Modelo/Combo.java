package Modelo;
import java.util.ArrayList;

public class Combo extends Entidad{
//Atributos
    private ArrayList<Producto> productos;
//Métododos
    //Contructor
    public Combo() {
    }
    //Setters y getters    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        //this.productos.clear();
        this.productos = productos;
    }
    
    //Métodos adicionales
    public void AgregarProducto(Producto producto){
    };
    
    public void EliminarProducto(String producto){
    };
    
    public void MostrarProductos(){
    };
    
}
