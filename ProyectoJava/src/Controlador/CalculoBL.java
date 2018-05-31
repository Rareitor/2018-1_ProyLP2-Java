package Controlador;

import AccesoDatos.CalculoDA;
import java.util.Date;

public class CalculoBL {
    private CalculoDA dataAccess;
    
    public CalculoBL() {
        dataAccess = new CalculoDA();
    }

    public boolean calculoDeComision(Date dt){
        return dataAccess.calculoDeComision(dt);
    }
}
