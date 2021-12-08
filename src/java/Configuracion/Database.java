package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    String url;
    String user;
    String contra;
    String driver;


    public Database() {
        this.url = "jdbc:oracle:thin:@localhost:1521:xe";
        this.user = "feria";
        this.contra = "feria";
        this.driver = "oracle.jdbc.OracleDriver";
    }
    
    public Connection Database() {
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "feria";
        String pass = "feria";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            
        }
        return con;
    }  
    
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getContra() {
        return contra;
    }

    public String getDriver() {
        return driver;
    } 
}
