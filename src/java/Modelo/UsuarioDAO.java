package Modelo;

import Configuracion.Database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    Database db = new Database();
    String sql = "";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int r;
    
    public UsuarioDAO() {
    }
    
    public int Validar(String nom_usuario, String contra) {
        Usuario user = new Usuario();
        int nivel = 0;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "select u.ROL_ID_ROL from usuario u join usuario_contrasenia uc on u.id_usucon = uc.id_usucon where uc.NOM_USUARIO = '" + nom_usuario + "'and uc.CONTRASENIA = '" + contra + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nivel = rs.getInt(1);
            }
            con.close();
            rs.close();
            return nivel;
        } catch (SQLException | ClassNotFoundException e) {
            if (con == null) {
                nivel = 8;
            }
            return nivel;
            }
    }
    
    
}
