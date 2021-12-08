package Modelo;

public class Solicitud_CompraInterna {
    
    int id_solicitud;
    String descripcion;
    String fecha;
    String nombre_usuario;

    public Solicitud_CompraInterna() {
    }

    public Solicitud_CompraInterna(int id_solicitud, String descripcion, String fecha, String nombre_usuario) {
        this.id_solicitud = id_solicitud;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.nombre_usuario = nombre_usuario;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    
    
    
}
