package Modelo;

public class Producto extends Entidad {

    //atributos
    private int stock;
    private String nombre;
    private String marca;
    private TipoPrdCmb tipo;
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
    
    public TipoPrdCmb getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoPrdCmb tipo) {
        this.tipo = tipo;
    }
    
     //métodos adicionales

}