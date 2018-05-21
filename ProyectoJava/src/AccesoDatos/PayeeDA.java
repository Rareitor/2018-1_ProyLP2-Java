package AccesoDatos;

import Modelo.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PayeeDA {
    public List<Payee> listarPayee(String idPayee){
        List<Payee> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_PAYEES(" + idPayee + ")}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Payee p = new Payee();
                p.setIdTrabajador(rs.getString("idPayee"));
                p.setDni("dni");
                p.setNombre("nombre");
                p.setApellidoPaterno("apellidoPaterno");
                p.setApellidoMaterno("apellidoMaterno");
                p.setEmail("email");
                p.setUserName("username");
                p.setDistrito("distrito");
                p.setCargo("cargo");
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
}
