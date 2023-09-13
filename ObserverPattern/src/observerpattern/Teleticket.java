
package observerpattern;

import java.util.ArrayList;
import java.util.List;


public class Teleticket implements Sujeto{
    
    private List<Observador> suscriptores = new ArrayList<>();
    private String nombreDelArtista;
    private int fechaDeConcierto;
    private String categoria;
    private boolean disponibilidad;

    public Teleticket(String nombreDelArtista, int fechaDeConcierto, String categoria,boolean disponibilidad) {
        this.nombreDelArtista = nombreDelArtista;
        this.fechaDeConcierto = fechaDeConcierto;
        this.categoria = categoria;
        this.disponibilidad =disponibilidad;
        
    }
    
    @Override
    public void agregar(Observador suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void eliminar(Observador suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notificar() {
        for (Observador suscriptor : suscriptores) {
            suscriptor.actualizar(this.getDisponibilidad());
        }
    }

    public String getNombreDelArtista() {
        return nombreDelArtista;
    }

    public void setNombreDelArtista(String nombreDelArtista) {
        this.nombreDelArtista = nombreDelArtista;
    }

    public int getFechaDeConcierto() {
        return fechaDeConcierto;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    

    public void setFechaDeConcierto(int fechaDeConcierto) {
        this.fechaDeConcierto = fechaDeConcierto;
    }
    
}
