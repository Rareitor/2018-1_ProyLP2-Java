package Controlador;

import AccesoDatos.PayeeDA;
import Modelo.Payee;
import java.util.List;


public class PayeeBL {
    private PayeeDA accesoDatos;
    
    public PayeeBL(){
        accesoDatos = new PayeeDA();
    }
    
    public List<Payee> listarPayees(String idPayee){
        return accesoDatos.listarPayee(idPayee);
    }
    
    public String obtenerId(String username){
        return accesoDatos.obtenerId(username);
    }
}
