
package observerpattern;


public class Fanatico implements Observador{
    private String nombre;
    private String apellido;
    private String artistaFavorito;

    public Fanatico(String nombre, String apellido, String artistaFavorito){
        this.nombre = nombre;
        this.apellido = apellido;
        this.artistaFavorito = artistaFavorito;
    }

    public String getArtistaFavorito() {
        return artistaFavorito;
    }

    public void setArtistaFavorito(String artistaFavorito) {
        this.artistaFavorito = artistaFavorito;
    }

    @Override
    public void actualizar(boolean disponibilidad) {
        if(disponibilidad){
            System.out.println("Hola! "+ nombre+ " "+ apellido+ " tu artista "+ getArtistaFavorito()+ " Ha llegado!!");
        }
        else{
            System.out.println("Hola! "+ nombre+ " "+ apellido+ " tu artista "+ getArtistaFavorito()+ " No Ha llegado!!");
        }
    }
    
    public void suscribirse(Teleticket teleticket) {
        teleticket.agregar(this);
    }
    
    public void dejarDeSeguir(Teleticket teleticket) {
        teleticket.eliminar(this);
    }
}
