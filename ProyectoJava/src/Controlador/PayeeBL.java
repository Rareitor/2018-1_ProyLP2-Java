package Controlador;

import AccesoDatos.PayeeDA;
import Modelo.Payee;
import java.util.List;
import javax.swing.JOptionPane;


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
    
    public String obtenerId(String username){
        return accesoDatos.obtenerId(username);
    }

    public boolean cambiarContrasena(String usr,String str){
        return this.accesoDatos.cambiarContrasena(usr,str);
    }
    
    public boolean verificarContrasena(String username, String str){
        return this.accesoDatos.verificarContraseña(username, str);
    }
    
    public Payee verificarLogin(String username, String str){
        if(this.accesoDatos.verificarContraseña(username, str)){
            str=""; Payee user = new Payee();
            user.setUserName(username);
            if(this.accesoDatos.obtenerDatosUsuario(user)){
                return user;
            }else{
                JOptionPane.showMessageDialog(null, "ERROR DE CARGA DE DATOS", "ERROR", JOptionPane.WARNING_MESSAGE);
                return null;
            }
        }else{
            return null;
        }
    }
    
    public boolean modificarDatosPropios(Payee user){
        return this.accesoDatos.modificarDatosPropios(user);
    }
}
