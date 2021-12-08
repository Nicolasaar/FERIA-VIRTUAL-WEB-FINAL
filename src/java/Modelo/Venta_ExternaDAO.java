package Modelo;
import Configuracion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Venta_ExternaDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar() {
        List<Venta_Externas>lista = new ArrayList<>();
        String sql = "select v.id_venta_externa, v.detalles, v.estado, v.monto, v.fecha, u.correo from venta_externa v join usuario u on v.id_usuario = u.id_usuario order by v.id_venta_externa";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta_Externas p = new Venta_Externas();
                p.setId_venta_interna(rs.getInt(1));
                p.setDetalles(rs.getString(2));
                p.setEstado(rs.getString(3));
                p.setMonto(rs.getInt(4));
                p.setFecha(rs.getString(5));
                p.setNombre_usuario_responsable(rs.getString(6));
                lista.add(p);
            }
            
        } catch (Exception e) {

        }
        return lista;
    }
    
}
