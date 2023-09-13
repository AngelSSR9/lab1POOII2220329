package com.mycompany.patronstrategy01;

public class Cliente {

    private String nombre;
    private Tarjeta tarjeta;
    private String correo;
    private String contraseña;
    
    public Cliente(String nombre, Tarjeta tarjeta, String correo, String contraseña) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
