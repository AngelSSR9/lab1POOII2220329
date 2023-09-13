package com.mycompany.patronstrategy01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MetodoDePagoYape implements MetodoDePago {
    
    private final BufferedReader ENTRADA = new BufferedReader(new InputStreamReader(System.in));
    private String nombre;
    
    @Override
    public boolean comprobarDatos(Cliente cliente) {
        try {
            System.out.println("Ingrese el nombre: ");
            nombre = ENTRADA.readLine();
            System.out.println("Procesando pago...");
            Thread.sleep(3000);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean pagar(double monto) {
        if(monto > 1000){
            monto = monto*0.93;
        }
        
        System.out.println("Pagando " + monto + " con yape " + "a nombre de " + nombre);
        return true;
    }

  
    
}
