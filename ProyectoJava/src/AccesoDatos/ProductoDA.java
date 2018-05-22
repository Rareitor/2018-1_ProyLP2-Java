/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arruè
 */
public class ProductoDA {
    public List<Producto> listarProductos(){
        List<Producto> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "SELECT*FROM Producto";
            PreparedStatement sentencia = con.prepareStatement(sql);
            ResultSet rs = sentencia.executeQuery(sql);
            while(rs.next()){
                Producto p = new Producto();
                p.setIdProducto(rs.getString("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setTipo(rs.getString("tipo"));
                lista.add(p);
            }
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<String> listarTiposProductos(){
        List<String> lista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{CALL LISTAR_TIPOS_PRODUCTOS()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                String tipo;
                tipo = rs.getString("tipo");
                lista.add(tipo);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
