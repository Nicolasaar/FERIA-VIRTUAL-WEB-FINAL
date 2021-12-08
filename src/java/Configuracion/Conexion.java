package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    public Connection conectar(){
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="feria";
        String pass="feria";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url,user,pass);
        }catch (Exception e){

        }
        return con;
    }
    
}
