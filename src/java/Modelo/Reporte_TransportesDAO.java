package Modelo;
import Configuracion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Reporte_TransportesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar() {
        List<Reporte_Transportes>lista = new ArrayList<>();
        String sql = "select id_reportet, descripcion, prodcutos_entregados, productos_perdidos, productos_restantes, id_usuario from reporte_transporte order by id_reportet";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Reporte_Transportes p = new Reporte_Transportes();
                
                p.setId_reporte(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setProductos_entregados(rs.getString(3));
                p.setProductos_perdidos(rs.getString(4));
                p.setProductos_restantes(rs.getString(5));
                p.setId_usuario(rs.getInt(6));
  
                lista.add(p);
            }
            
        } catch (Exception e) {

        }
        return lista;
    }
    
}
