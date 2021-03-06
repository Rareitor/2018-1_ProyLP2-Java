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
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Arruè
 */
public class ProductoDA {
    public List<Producto> listarProductos(){
        List<Producto> lista = new ArrayList<Producto>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "SELECT*FROM Producto";
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            while(rs.next()){
                Producto p = new Producto();
                p.setIdProducto(rs.getString("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setTipo(rs.getString("tipo"));
                lista.add(p);
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public List<String> listarTiposProductos(){
        List<String> lista = new ArrayList<String>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://200.16.7.96/inf282g8", "inf282g8", "4LDJZU");
            String sql = "{CALL LISTAR_TIPOS_PRODUCTOS()}";
            CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery();//usar execute y despues getResultSet
            while(rs.next()){
                String tipo;
                tipo = rs.getString("tipo");
                lista.add(tipo);
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public void ldProductosDestacados(ArrayList<String> noms, ArrayList<Double> mnts, Date ini, Date fin){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            CallableStatement cs = con.prepareCall("{CALL RANKING_ORDENES(?,?)}");
            cs.setDate(1, java.sql.Date.valueOf(LocalDate.from(Instant.ofEpochMilli(ini.getTime()).atZone(ZoneId.systemDefault()))));
            cs.setDate(2, java.sql.Date.valueOf(LocalDate.from(Instant.ofEpochMilli(fin.getTime()).atZone(ZoneId.systemDefault()))));
            cs.execute();
            
            ResultSet rs = cs.getResultSet();
            while(rs.next()){
                noms.add(rs.getString(2));
                mnts.add(rs.getDouble(3));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            noms.clear();
            mnts.clear();
        }
    }
}
