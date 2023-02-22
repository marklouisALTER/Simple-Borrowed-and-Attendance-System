/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemshs;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class SYSTEMSHS {

  Connection con=null;
        
        public static Connection connect()
        {
            try{
                Class.forName("org.sqlite.JDBC");
                  Connection con=DriverManager.getConnection("jdbc:sqlite:DATABASE.sqlite");
      
              
  
                return con;      
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Failed");
                return null;
            }
    }
    
}
