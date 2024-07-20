
package javaapplication4.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConfig {
    private static DbConfig instance;
    
    private DbConfig(){
        
    }
    
    public static synchronized DbConfig getInstance(){
        if(instance ==null){
            instance=new DbConfig();
        }
        return instance;
        
    }
     public Connection dbconnection() throws Exception{
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/WinAcedamy";
     String user="root";
     String password="5555";
     Connection con=DriverManager.getConnection(url, user, password);
     return con;
     }
    
}
