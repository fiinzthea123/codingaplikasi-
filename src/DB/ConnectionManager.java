/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author A'finarizkia
 */
public class ConnectionManager {
    private Connection con;
    private final String driver = "com.sql.jdbc.Driver";
    private final String url = "jdbc:mysql//localhost3306/koneksi";
    private final String user = "root";
    private final String pass = "";
    
    public Connection LogOn() {
     try{
         Class.forName(driver).newInstance();
         con = DriverManager.getConnection(url, user, pass);
     }
     catch(Exception ex) {
         ex.printStackTrace();
     }
     return con;
    }
    
    public void LogOff() {
        try{
            con.close();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void logOff() {
        throw new UnsupportedOperationException("Not supported yet"); 
    }
}
