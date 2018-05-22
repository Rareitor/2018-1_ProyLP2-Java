package AccesoDatos;

import Modelo.Orden;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenDA {
    public List<Orden> listarOrdenesComisionista(String idPayee, Date fecha1, Date fecha2){
        List<Orden> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_ORDENES_COMISIONISTA(?,?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1,idPayee);
            cs.setDate(2, new java.sql.Date(fecha1.getTime()));
            cs.setDate(3, new java.sql.Date(fecha2.getTime()));
            
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Orden o = new Orden();
                o.setId(rs.getString("idOrden"));
                o.setMontoPago(rs.getDouble("monto"));
                o.setIdProducto(rs.getString("idProducto"));
                o.setIdCanal(rs.getString("idCanal"));
                java.sql.Date dateSQL = rs.getDate("fechaVenta");
                o.setFechaVenta(new java.util.Date(dateSQL.getTime()));
                lista.add(o);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<Orden> listarOrdenesJefe(String idJefe, Date fecha1, Date fecha2){
        List<Orden> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_ORDENES_JEFE(?,?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1,idJefe);
            cs.setDate(2, new java.sql.Date(fecha1.getTime()));
            cs.setDate(3, new java.sql.Date(fecha2.getTime()));
            
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Orden o = new Orden();
                o.setId(rs.getString("idOrden"));
                o.setMontoPago(rs.getDouble("monto"));
                o.setIdProducto(rs.getString("idProducto"));
                o.setIdCanal(rs.getString("idCanal"));
                java.sql.Date dateSQL = rs.getDate("fechaVenta");
                o.setFechaVenta(new java.util.Date(dateSQL.getTime()));
                lista.add(o);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<Orden> listarOrdenesGerente(Date fecha1, Date fecha2){
        List<Orden> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{call LISTAR_ORDENES_GERENTE(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(fecha1.getTime()));
            cs.setDate(2, new java.sql.Date(fecha2.getTime()));
            
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Orden o = new Orden();
                o.setId(rs.getString("idOrden"));
                o.setMontoPago(rs.getDouble("monto"));
                o.setIdProducto(rs.getString("idProducto"));
                o.setIdCanal(rs.getString("idCanal"));
                java.sql.Date dateSQL = rs.getDate("fechaVenta");
                o.setFechaVenta(new java.util.Date(dateSQL.getTime()));
                lista.add(o);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
