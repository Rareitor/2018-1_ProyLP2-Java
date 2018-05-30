package AccesoDatos;

import Modelo.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PayeeDA {
    
    public List<Payee> listarTrabajadores(){
        List<Payee> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_TRABAJADORES()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Payee p = new Payee();
                p.setIdTrabajador(rs.getString("idPayee"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidoPaterno(rs.getString("apellidoPaterno"));
                p.setApellidoMaterno(rs.getString("apellidoMaterno"));
                p.setEmail(rs.getString("email"));
                p.setUserName(rs.getString("username"));
                p.setDistrito(rs.getString("distrito"));
                p.setCargo(rs.getString("cargo"));
                lista.add(p);
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<Payee> listarGerentes(){
        List<Payee> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_GERENTES()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Payee p = new Payee();
                p.setIdTrabajador(rs.getString("idPayee"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidoPaterno(rs.getString("apellidoPaterno"));
                p.setApellidoMaterno(rs.getString("apellidoMaterno"));
                p.setEmail(rs.getString("email"));
                p.setUserName(rs.getString("username"));
                p.setDistrito(rs.getString("distrito"));
                p.setCargo(rs.getString("cargo"));
                lista.add(p);
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<Payee> listarJefes(String idPayee){
        List<Payee> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            idPayee = "\"" + idPayee + "\"";
            String sql = "{call LISTAR_JEFES(" + idPayee + ")}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Payee p = new Payee();
                p.setIdTrabajador(rs.getString("idPayee"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidoPaterno(rs.getString("apellidoPaterno"));
                p.setApellidoMaterno(rs.getString("apellidoMaterno"));
                p.setEmail(rs.getString("email"));
                p.setUserName(rs.getString("username"));
                p.setDistrito(rs.getString("distrito"));
                p.setCargo(rs.getString("cargo"));
                lista.add(p);
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<Payee> listarComisionistas(String idPayee){
        List<Payee> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            idPayee = "\"" + idPayee + "\"";
            String sql = "{call LISTAR_COMISIONISTAS(" + idPayee + ")}";
            System.out.println(sql);
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Payee p = new Payee();
                p.setIdTrabajador(rs.getString("idPayee"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidoPaterno(rs.getString("apellidoPaterno"));
                p.setApellidoMaterno(rs.getString("apellidoMaterno"));
                p.setEmail(rs.getString("email"));
                p.setUserName(rs.getString("username"));
                p.setDistrito(rs.getString("distrito"));
                p.setCargo(rs.getString("cargo"));
                lista.add(p);
            }
            con.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public String obtenerId(String username){
        String id="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_ID(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            id = cs.getString(2);
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    public String obtenerPuesto(String username){
        String puesto="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_PUESTO(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            puesto = cs.getString(2);
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return puesto;
    }
    
    public boolean verificarContraseña(String username, String psw){
        boolean returnVal = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_CONTRASEÑA(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.execute();
            returnVal = psw.equals(cs.getString(2));
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return returnVal;
    }
    
    public boolean cambiarContrasena(String usr, String str){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            CallableStatement cstt = con.prepareCall("{call MODIFICAR_CONTRASENA(?,?)}");
            
            cstt.setString(1, usr);
            cstt.setString(2, str);
            
            cstt.execute();
            con.close();
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean obtenerDatosUsuario(Payee user){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            Statement stt = con.createStatement();
            ResultSet origData = stt.executeQuery("SELECT P.dni,P.nombre,P.apellidoPaterno,P.apellidoMaterno,P.email,J.cargo FROM Payee P, Jerarquia J WHERE P.username = '"+ user.getUserName()+"' and P.idPayee = J.idPayee and P.isVisible = 1");
            //can be inner join on idpayee
            origData.first();
            
            user.setDni(origData.getString(1));
            user.setNombre(origData.getString(2));
            user.setApellidoPaterno(origData.getString(3));
            user.setApellidoMaterno(origData.getString(4));
            user.setEmail(origData.getString(5));
            user.setCargo(origData.getString(6));

            con.close();
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean modificarDatosPropios(Payee user){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            CallableStatement cstt = con.prepareCall("{call MODIFICAR_PROPIO_USUARIO(?,?,?,?,?,?)}");
            
            cstt.setString(1, user.getUserName());
            cstt.setString(2, user.getDni());
            cstt.setString(3, user.getNombre());
            cstt.setString(4, user.getApellidoPaterno());
            cstt.setString(5, user.getApellidoMaterno());
            cstt.setString(6, user.getEmail());
            
            cstt.execute();
            con.close();
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
