package Controlador;

import AccesoDatos.CalculoDA;

public class CalculoBL {
    private CalculoDA dataAccess;
    
    public CalculoBL() {
        dataAccess = new CalculoDA();
    }

    public boolean calculoDeComision(){
        return dataAccess.calculoDeComision();
    }
}
