package Controlador;

import AccesoDatos.DistritoDA;
import Modelo.Distrito;
import java.util.List;

public class DistritoBL {
    private DistritoDA accedoDatos;

    public DistritoBL() {
        accedoDatos = new DistritoDA();
    }
    
    public List<Distrito> listarDistritos(){
        return accedoDatos.listarDistritos();
    }
}
