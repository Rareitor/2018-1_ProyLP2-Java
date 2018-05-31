/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.ProductoDA;
import Modelo.Producto;
import java.util.*;


public class ProductoBL {
    private ProductoDA accesoDatos;

    public ProductoBL() {
        accesoDatos = new ProductoDA();
    }
    
    public List<Producto> listarProductos(){
        return accesoDatos.listarProductos();
    }
    
    public List<String> listarTiposProductos(){
        return accesoDatos.listarTiposProductos();
    }
    
    public boolean productosDestacados(ArrayList<String> noms, ArrayList<Double> mnts, Date fechaIni, Date fechaFin){
        this.accesoDatos.ldProductosDestacados(noms, mnts, fechaIni, fechaFin);
        return (mnts.isEmpty() && noms.isEmpty())? true : false;
    }
}
