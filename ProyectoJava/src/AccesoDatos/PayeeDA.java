package AccesoDatos;

import Modelo.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public String obtenerId(String username){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_ID(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            return cs.getString(2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    
    public String obtenerPuesto(String username){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_PUESTO(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            return cs.getString(2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    
    public String obtenerContraseña(String username){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_CONTRASEÑA(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            return cs.getString(2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    
    public String[] obtenerPuestoContraseña(String username){
        String[] data = new String[2];
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call OBTENER_PUESTO_CONTRASEÑA(?,?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, username);
            cs.executeUpdate();
            data[0] = cs.getString(2);
            data[1] = cs.getString(3);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }
}
