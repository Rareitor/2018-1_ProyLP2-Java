package Modelo;

import java.util.*;

public class Jefe extends Payee{
//atributos
    private ArrayList<Comisionista> listaComisionistas;
    private TipoLocacion sede;
//métodos
    //constructor
    public Jefe(){
        listaComisionistas = new ArrayList<Comisionista>();
    }
    
    //setters y getters

    public ArrayList<Comisionista> getListaComisionistas() {
        return listaComisionistas;
    }

    public void setListaComisionistas(ArrayList<Comisionista> listaComisionistas) {
        this.listaComisionistas = listaComisionistas;
    }

    public TipoLocacion getSede() {
        return sede;
    }

    public void setSede(TipoLocacion sede) {
        this.sede = sede;
    }
    
    public void listarComisionistas(){
    }
}
