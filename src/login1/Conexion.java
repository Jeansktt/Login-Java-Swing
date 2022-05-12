package login1;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public Connection CrearDB(){
        Connection con; 
        String barra = File.separator;
        String proyecto = System.getProperty("user.dir")+ barra+ "Registros";
        File url= new File(proyecto);
        
        if (url.exists()){
            System.out.println("base de datos ya existe");
        }else{
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                String db = "jdbc:derby:"+proyecto+";create=true";
                con= DriverManager.getConnection(db);
                
                String tabla= "create table Tabla_login (Usuario VARCHAR(50) PRIMARY KEY, contraseña VARCHAR(50) ";
                PreparedStatement ps= con.prepareStatement(tabla);
                ps.execute();
                ps.close();
                System.out.println("BASE DE DATOS CREADA");
                return con;
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error: "+ ex);
            }
        }
        
        return null;
    }
    
    public Connection CargarDB(){
        
            Connection con;
            String barra = File.separator;
            String proyecto = System.getProperty("user.dir")+ barra+ "Registros";
            
         try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String db = "jdbc:derby:"+proyecto;
            con= DriverManager.getConnection(db);
             System.out.println("BASE DATOS CARGADA ");
            return con;
             
        } catch (ClassNotFoundException | SQLException ex) {
             System.out.println("error: "+ ex);
        }
        return null;
    }
    
    public Connection usuarios(){
        
        
        return null;
    }
    

   
}
