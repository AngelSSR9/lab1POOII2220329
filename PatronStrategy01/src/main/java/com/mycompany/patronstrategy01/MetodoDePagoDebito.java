
package com.mycompany.patronstrategy01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetodoDePagoDebito implements MetodoDePago{
    private final BufferedReader ENTRADA = new BufferedReader(new InputStreamReader(System.in));
    private Tarjeta tarjeta;
    
    @Override
    public boolean comprobarDatos(Cliente cliente) {
       try {
            System.out.println("Ingrese el numero de tarjeta: ");
            String numero = ENTRADA.readLine();
            System.out.println("Ingrese la fecha de expiracion de la tarjeta: ");
            String fecha = ENTRADA.readLine();
            System.out.println("Ingrese el codigo CVV");
            String cvv = ENTRADA.readLine();
            tarjeta = new Tarjeta(numero, cvv, fecha);
            if(cliente.getTarjeta().equals(tarjeta)){
                System.out.println("Procesando pago...");
                Thread.sleep(3000);
                return true;   
            }
            else{
                System.out.println("Datos de tarjeta incorrectos.");
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean pagar(double monto) {
        if(tarjeta != null){
            System.out.println("Pagando " + monto + " con Débito.");
            tarjeta.setDinero(tarjeta.getDinero() - monto);
            
            return true;
        }
        else{
            return false;
        }
    }

 
}
