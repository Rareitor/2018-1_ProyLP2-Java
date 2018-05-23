package Controlador;

import AccesoDatos.PayeeDA;
import Modelo.Payee;
import java.util.List;


public class PayeeBL {
    private PayeeDA accesoDatos;
    
    public PayeeBL(){
        accesoDatos = new PayeeDA();
    }
    
    public List<Payee> listarTrabajadores(){
        return accesoDatos.listarTrabajadores();
    }
    
    public List<Payee> listarGerentes(){
        return accesoDatos.listarTrabajadores();
    }
    
    public List<Payee> listarJefes(String idPayee){
        return accesoDatos.listarJefes(idPayee);
    }
    
    public List<Payee> listarComisionistas(String idPayee){
        return accesoDatos.listarComisionistas(idPayee);
    }
    
    public String obtenerId(String username){
        return accesoDatos.obtenerId(username);
    }
}
