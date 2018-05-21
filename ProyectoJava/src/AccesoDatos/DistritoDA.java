package AccesoDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DistritoDA {

    public DistritoDA() {
    }
    
    public List<String> listarDistritos(){
        List<String> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jb.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call MOSTRAR_DISTRITOS_ORDEN()";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                String distrito = rs.getString("distrito");
                lista.add(distrito);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
