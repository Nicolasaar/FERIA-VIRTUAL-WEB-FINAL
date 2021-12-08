package Modelo;

public class Venta_Externas {
    
    int id_venta_interna;
    String detalles;
    String estado;
    int monto;
    String fecha;
    String nombre_usuario_responsable;

    public Venta_Externas() {
    }

    public Venta_Externas(int id_venta_interna, String detalles, String estado, int monto, String fecha, String nombre_usuario_responsable) {
        this.id_venta_interna = id_venta_interna;
        this.detalles = detalles;
        this.estado = estado;
        this.monto = monto;
        this.fecha = fecha;
        this.nombre_usuario_responsable = nombre_usuario_responsable;
    }

    public int getId_venta_interna() {
        return id_venta_interna;
    }

    public void setId_venta_interna(int id_venta_interna) {
        this.id_venta_interna = id_venta_interna;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre_usuario_responsable() {
        return nombre_usuario_responsable;
    }

    public void setNombre_usuario_responsable(String nombre_usuario_responsable) {
        this.nombre_usuario_responsable = nombre_usuario_responsable;
    }
    
    
    
}
