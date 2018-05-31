/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesoDatos;
import java.sql.*;

/**
 * @author Emilio
 */
public class CalculoDA {

    public CalculoDA() {
        
    }
    
    public boolean calculoDeComision(){
        try{//falta integrar fechas
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g8", "inf282g8", "4LDJZU");
            CallableStatement cstt = con.prepareCall("{call CALCULAR_COMISIONES()}");

            cstt.execute();
            con.close();
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
