package ClasesProyecto;

import java.util.*;

public class Jefe extends Payee{
//atributos
    private List<Comisionista> listaComisionistas;
    private TipoLocacion sede;
//métodos
    //constructor
    public Jefe(){
        listaComisionistas = new ArrayList<>();
    }
    
    //setters y getters

    public List<Comisionista> getListaComisionistas() {
        return listaComisionistas;
    }

    public void setListaComisionistas(List<Comisionista> listaComisionistas) {
        this.listaComisionistas = listaComisionistas;
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
    
    public void listarComisionistas(){
    }
    
}
