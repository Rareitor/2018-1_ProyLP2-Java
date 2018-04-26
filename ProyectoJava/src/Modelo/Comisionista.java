package Modelo;

public class Comisionista extends Trabajador{
//atributos
    private TipoLocacion region;
//métodos
    //constructores
    public Comisionista(){
    }
    //setters y getters

    public TipoLocacion getRegion() {
        return region;
    }

    public void setRegion(TipoLocacion region) {
        this.region = region;
    }
    
    //métodos adicionales
    @Override
    public void emitirReporte() {
    }
    
}
