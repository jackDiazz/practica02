import java.util.Iterator;

/**
 * Clase que implementa un iterador para el Menú general, donde las hamburguesas se guardan en un arreglo.
 */
public class MenuGeneralIterador implements Iterator<Platillo> {
    private Platillo[] generalItems; // Arreglo que almacena los platillos del menú general.
    private int position = 0; // La posición actual en el arreglo.

    /**
     * Constructor de la clase MenuGeneralIterador.
     * @param generalItems Arreglo que contiene los platillos del menú general.
     */
    public MenuGeneralIterador(Platillo[] generalItems) {
        this.generalItems = generalItems;
    }

    /**
     * Devuelve el siguiente platillo en el arreglo y avanza la posición.
     * @return El siguiente platillo en el arreglo.
     */
    public Platillo next(){
        Platillo item = generalItems[position]; // Obtiene el platillo en la posición actual.
        position++; // Avanza a la siguiente posición.
        return item; // Devuelve el platillo actual.
    }

    /**
     * Verifica si hay más elementos en el arreglo.
     * @return true si hay más elementos, false si no los hay.
     */
    public boolean hasNext() {
        return position < generalItems.length; // Comprueba si la posición actual es menor que la longitud del arreglo.
    }
    public void resetPosicion(){
        this.position=0;
    }

}
