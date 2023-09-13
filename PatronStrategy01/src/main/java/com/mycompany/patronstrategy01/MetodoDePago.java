package com.mycompany.patronstrategy01;

public interface MetodoDePago {
    boolean comprobarDatos(Cliente cliente);
    boolean pagar(double monto);
}
