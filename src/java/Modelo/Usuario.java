
package Modelo;

public class Usuario {
    
    private int id_usuario;
    private String primer_nombre;
    private String segundo_nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String correo;
    private int telefono_movil;
    private int edad;
    private int rol_id_rol;
    private int pais_id_pais;
    private String nom_usuario;    
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(int id_usuario, String primer_nombre, String segundo_nombre, String apellido_paterno, String apellido_materno, String correo, int telefono_movil, int edad, int rol_id_rol, int pais_id_pais, String nom_usuario, String contrasenia) {
        this.id_usuario = id_usuario;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo = correo;
        this.telefono_movil = telefono_movil;
        this.edad = edad;
        this.rol_id_rol = rol_id_rol;
        this.pais_id_pais = pais_id_pais;
        this.nom_usuario = nom_usuario;
        this.contrasenia = contrasenia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(int telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRol_id_rol() {
        return rol_id_rol;
    }

    public void setRol_id_rol(int rol_id_rol) {
        this.rol_id_rol = rol_id_rol;
    }

    public int getPais_id_pais() {
        return pais_id_pais;
    }

    public void setPais_id_pais(int pais_id_pais) {
        this.pais_id_pais = pais_id_pais;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
