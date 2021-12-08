package Modelo;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Solicitud_CompraDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    

    
    public List listar() {
        List<Solicitud_Compra>lista = new ArrayList<>();
        String sql = "select s.id_solicitud, s.descripcion, s.fecha, u.correo from solicitud_compra s join usuario u on s.id_usuario=u.id_usuario order by s.id_solicitud";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Solicitud_Compra p = new Solicitud_Compra();
                p.setId_solicitud(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setFecha(rs.getString(3));
                p.setNombre_usuario(rs.getString(4));
                lista.add(p);
            }
            
        } catch (Exception e) {

        }
        return lista;
    }
    
    public int agregar(Solicitud_Compra s){
        int r = 0;
        String sql = "INSERT INTO SOLICITUD_COMPRA (ID_SOLICITUD, DESCRIPCION, FECHA, ID_USUARIO) VALUES (?, ?, ?, ?)";
        try{
            con = c.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, s.getId_solicitud());
            ps.setString(2, s.getDescripcion());
            ps.setString(3, s.getFecha());
            ps.setString(4, s.getNombre_usuario());
            r= ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }

        }catch(Exception e){
            
        }
        return r;
    }
    
    
}
