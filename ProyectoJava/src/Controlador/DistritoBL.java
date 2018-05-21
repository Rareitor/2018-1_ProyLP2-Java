package Controlador;

import AccesoDatos.DistritoDA;
import java.util.List;

public class DistritoBL {
    private DistritoDA accedoDatos;

    public DistritoBL() {
        accedoDatos = new DistritoDA();
    }
    
    public List<String> listarDistritos(){
        return accedoDatos.listarDistritos();
    }
}
