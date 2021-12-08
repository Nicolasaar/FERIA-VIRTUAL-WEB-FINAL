package Modelo;

import Configuracion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar() {
        List<Producto>lista = new ArrayList<>();
        String sql = "select p.ID_PRODUCTO, p.nombre_producto, p.color, p.tamano, p.fecha_importado, p.precio, p.stock, u.CORREO from productos p join usuario u on p.USUARIO_ID_USUARIO = u.ID_USUARIO order by p.id_producto";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId_producto(rs.getInt(1));
                p.setNombre_producto(rs.getString(2));
                p.setColor(rs.getString(3));
                p.setTamano(rs.getInt(4));
                p.setFecha_importado(rs.getString(5));
                p.setPrecio(rs.getInt(6));
                p.setStock(rs.getInt(7));
                p.setCreador(rs.getString(8));
                lista.add(p);
            }
            
        } catch (Exception e) {

        }
        return lista;
    }
    
}
