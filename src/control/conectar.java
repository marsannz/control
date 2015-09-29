package control;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Jesus Ariel
 */
public class conectar {
    
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQLi89
           Class.forName("org.gjt.mm.mysql.Driver"); //activamos el driver 
           conect = DriverManager.getConnection("jdbc:mysql://localhost/inventario","root","1234"); 
           //cadena de conexion                            ubicacion-base-usuario por default
        
        
        /*
            // Se crea un Statement, para realizar la consulta
            Statement s = conect.createStatement();
            // Se realiza la consulta. Los resultados se guardan en el "ResultSet rs"
            ResultSet rs = s.executeQuery ("select * from persona");
            // Se recorre el ResultSet, mostrando por pantalla los resultados.
                while (rs.next())
                {
                    System.out.println (rs.getInt ("Id") + " " + rs.getString (2)+ //Aquí tienes que cambiar conforme las celdas de la tabla en tu base de datos
                        " " + rs.getDate(3));
                }
            // Se cierra la conexión con la base de datos.
            conexion.close();
            
            */
          
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
    }
}
