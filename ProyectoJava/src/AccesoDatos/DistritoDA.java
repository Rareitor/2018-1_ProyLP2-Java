package AccesoDatos;

import Modelo.Distrito;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DistritoDA {

    public DistritoDA() {
    }
    
    public List<Distrito> listarDistritos(){
        List<Distrito> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call MOSTRAR_DISTRITOS_ORDEN()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Distrito d = new Distrito();
                d.setNombre(rs.getString("Distrito"));
                d.setCantidadOrdenes(rs.getInt("Cantidad"));
                lista.add(d);
            }
            con.close();
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
