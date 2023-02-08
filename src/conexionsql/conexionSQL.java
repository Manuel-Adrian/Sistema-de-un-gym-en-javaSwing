package conexionsql;
/* https://www.youtube.com/watch?v=4T8nYTGj0Y0&list=PLvcebgXCVhORpN8rPX1AdWiX81-BD4Z6P */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexionSQL {
    Connection conectar=null;
    public Connection conexxion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","");
           
           /* JOptionPane.showMessageDialog(null,"Conexion Exitosa");*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexión"+e.getMessage());
        }
       return conectar;
    }
    
  
}
