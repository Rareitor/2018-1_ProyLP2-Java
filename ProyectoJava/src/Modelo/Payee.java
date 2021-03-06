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
        super();
        this.cargo = null;
        this.distrito = null;
    }
    
    public Payee(Payee p)
    {
        super(p);
        this.setCargo(p.getCargo());
        this.setDistrito(p.getDistrito());
    }
}