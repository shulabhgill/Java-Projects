/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sunrise Institute
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;

        public static Connection ConnectDB(){
             try{

          Class.forName("org.gjt.mm.mysql.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hms_db","root","");
          return con;

        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
}
}
