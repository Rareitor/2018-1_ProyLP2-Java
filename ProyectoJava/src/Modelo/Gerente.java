package Modelo;

import java.util.*;

public class Gerente extends Trabajador{
//atributos
    private ArrayList<Jefe> listaJefes;
    private TipoLocacion sede;
//métodos
    //constructor
    public Gerente(){
        //listaJefes = new ArrayList<>();
    }
    
    //setters y getters
    public ArrayList<Jefe> getListaJefes() {
        return listaJefes;
    }

    public void setListaJefes(ArrayList<Jefe> listaJefes) {
        this.listaJefes = listaJefes;
    }

    public TipoLocacion getSede() {
        return sede;
    }

    public void setSede(TipoLocacion sede) {
        this.sede = sede;
    }
    
    //métodos adicionales
    @Override
    public void emitirReporte() {
    }
    
    public void listarJefes(){
    }
    
}
