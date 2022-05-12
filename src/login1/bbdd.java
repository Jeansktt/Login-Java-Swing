/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 34680
 */
public class bbdd {
 
    public static Connection conectbd(){
        Connection con = null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/test", "jean", "1234");
            return con;
            
        } catch (SQLException ex) {
            Logger.getLogger(bbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
    
}
