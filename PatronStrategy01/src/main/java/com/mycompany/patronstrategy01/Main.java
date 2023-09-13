package com.mycompany.patronstrategy01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double precioPrenda=0;
        
        Tarjeta tarjeta  = new Tarjeta("123", "123", "11/11");
        Cliente cliente = new Cliente("Angel", tarjeta, "aaa", "1234");
        MetodoDePago metodoPago;
        
        System.out.println("Ingrese su producto a comprar: \n"+
                            "1. polo \n"+
                            "2. pantalon \n"+
                            "3. zapatilla");
        
        int opcion=Integer.parseInt(reader.readLine());
        
        if(opcion==1){
            precioPrenda= 50;
        }else if(opcion==2){
            precioPrenda= 60.5;
        }else{
            precioPrenda= 80;    
        }
        
        System.out.println("Elije la cantidad: ");
        int cantidad = Integer.parseInt(reader.readLine());
        
        System.out.println("Ingrese metodo de pago: \n"+
                            "1. visa \n"+
                            "2. yape \n"+
                            "3. plin \n"+
                            "4. debito");
        int opcion2 = Integer.parseInt(reader.readLine());
        
        double montototal=precioPrenda*cantidad;
        switch(opcion2){
            case 1:
                metodoPago = new MetodoDePagoVisa();
                if(metodoPago.comprobarDatos(cliente)){
                    metodoPago.pagar(montototal);
                }
                break;
            case 2:
                metodoPago = new MetodoDePagoYape();
                if(metodoPago.comprobarDatos(cliente)){
                    metodoPago.pagar(montototal);
                }
                break;
            case 3:
                metodoPago = new MetodoDePagoPlin();
                if(metodoPago.comprobarDatos(cliente)){
                    metodoPago.pagar(montototal);
                }
                break;
            case 4:
                metodoPago = new MetodoDePagoDebito();
                if(metodoPago.comprobarDatos(cliente)){
                    metodoPago.pagar(montototal);
                }
                break;
        }
    }
}
