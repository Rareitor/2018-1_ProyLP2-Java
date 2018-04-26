package Modelo;

public class Producto extends Entidad {
//atributos
    private int stock;
    private float precioEstandar;
    private String nombre;
    private String marca;
//m�todos
    //Constructor
    public Producto(){  
    };
	
    //setters y getters

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(float precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     //métodos adicionales

}