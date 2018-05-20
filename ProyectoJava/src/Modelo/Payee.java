package Modelo;

public class Payee extends Trabajador{
    //atributos
    String distrito;
    String cargo;
    
    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 
    //constructores
    public Payee()
    {
    }
}