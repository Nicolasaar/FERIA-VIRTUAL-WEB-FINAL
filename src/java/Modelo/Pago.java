package Modelo;

public class Pago {
    
    int id_pago;
    int iva;
    int monto;
    int id_usuario;
    

    public Pago() {
    }

    public Pago(int id_pago, int iva, int monto, int id_usuario) {
        this.id_pago=id_pago;
        this.iva=iva;
        this.monto=monto;
        this.id_usuario=id_usuario;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

   
    
    
}
