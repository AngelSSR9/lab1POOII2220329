
package observerpattern;


public interface Sujeto {
    abstract void agregar(Observador observador);
    abstract void eliminar(Observador observador);
    abstract void notificar();
}
