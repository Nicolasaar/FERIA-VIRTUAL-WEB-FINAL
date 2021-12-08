package Modelo;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PagoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    

    
    
    public int agregar(Pago s){
        int r = 0;
        String sql = "INSERT INTO PAGO (ID_PAGO, IVA, TOTAL, ID_USUARIO) VALUES (?, ?, ?, ?)";
        try{
            con = c.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, s.getId_pago());
            ps.setInt(2, s.getIva());
            ps.setInt(3, s.getMonto());
            ps.setInt(4, s.getId_usuario());
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
    public List listar() {
        List<Pago>lista = new ArrayList<>();
        String sql = "select id_pago, iva, total, id_usuario from pago  order by id_pago";
        try {
            con = c.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pago p = new Pago();
                p.setId_pago(rs.getInt(1));
                p.setIva(rs.getInt(2));
                p.setMonto(rs.getInt(3));
                p.setId_usuario(rs.getInt(4));
         
                lista.add(p);
            }
            
        } catch (Exception e) {

        }
        return lista;
    }
    
    
}
