package Controlador;

import AccesoDatos.OrdenDA;
import Modelo.Orden;
import java.util.Date;
import java.util.List;

public class OrdenBL {
    private OrdenDA accesoDatos;
    
    public OrdenBL() {
        accesoDatos = new OrdenDA();
    }
    
    public List<Orden> listarOrdenesComisionista(String idPayee, Date fecha1, Date fecha2){
        return accesoDatos.listarOrdenesComisionista(idPayee, fecha1, fecha2);
    }
    
    public List<Orden> listarOrdenesJefe(String idJefe, Date fecha1, Date fecha2){
        return accesoDatos.listarOrdenesJefe(idJefe, fecha1, fecha2);
    }
    
    public List<Orden> listarOrdenesGerente(Date fecha1, Date fecha2){
        return accesoDatos.listarOrdenesGerente(fecha1, fecha2);
    }
}
