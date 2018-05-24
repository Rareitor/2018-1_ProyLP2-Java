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
    
    public String obtenerPuesto(String username){
        return accesoDatos.obtenerPuesto(username);
    }
    
    public String obtenerContraseña(String username){
        return accesoDatos.obtenerContraseña(username);
    }
    
    public String[] obtenerPuestoContraseña(String username){
        return accesoDatos.obtenerPuestoContraseña(username);
    }
    
    public String obtenerId(String username){
        return accesoDatos.obtenerId(username);
    }

    public boolean cambiarContrasena(String usr,String str){
        return this.accesoDatos.cambiarContrasena(usr,str);
    }
    
    public boolean obtenerDatosOriginales(Payee user){
        return this.accesoDatos.obtenerDatosOriginales(user);
    }
    
    public boolean modificarDatosPropios(Payee user){
        return this.accesoDatos.modificarDatosPropios(user);
    }
    
    public void cargarRecomendaciones(String id){
        String recs = this.accesoDatos.obtenerRecomendaciones(id);
        try{
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
