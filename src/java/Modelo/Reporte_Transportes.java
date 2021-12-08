package Modelo;

public class Reporte_Transportes {
    
   

    
    int id_reporte;
    String  descripcion;
    String productos_entregados;
    String productos_perdidos;
    String productos_restantes;
    int id_usuario;
    
    public Reporte_Transportes() {
    }

    public Reporte_Transportes(int id_reporte, String descripcion, String productos_entregados, String productos_perdidos, String productos_restantes, int id_usuario) {
        this.id_reporte=id_reporte;
        this.descripcion=descripcion;
        this.productos_entregados=productos_entregados;
        this.productos_perdidos=productos_perdidos;
        this.productos_restantes=productos_restantes;
        this.id_usuario=id_usuario;
    }

    public int getId_reporte() {
        return id_reporte;
    }

    public void setId_reporte(int id_reporte) {
        this.id_reporte = id_reporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProductos_entregados() {
        return productos_entregados;
    }

    public void setProductos_entregados(String productos_entregados) {
        this.productos_entregados = productos_entregados;
    }

    public String getProductos_perdidos() {
        return productos_perdidos;
    }

    public void setProductos_perdidos(String productos_perdidos) {
        this.productos_perdidos = productos_perdidos;
    }

    public String getProductos_restantes() {
        return productos_restantes;
    }

    public void setProductos_restantes(String productos_restantes) {
        this.productos_restantes = productos_restantes;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    

    
    
    
}
