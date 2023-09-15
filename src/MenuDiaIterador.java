import java.util.Iterator;
import java.util.ArrayList;

/**
 * Esta clase implementa un iterador para una lista de MenuDia.
 */
public class MenuDiaIterador implements Iterator<Platillo> {
    private ArrayList<Platillo> diaItems; // La lista de platillos a iterar.
    private int position = 0; // La posición actual en la lista.

    /**
     * Constructor de la clase MenuDiaIterador.
     * @param diaItems La lista de platillos a ser iterada.
     */
    public MenuDiaIterador(ArrayList<Platillo> diaItems) {
        this.diaItems = diaItems;
    }

    /**
     * Devuelve el siguiente platillo en la lista y avanza la posición.
     * @return El siguiente platillo en la lista.
     */
    public Platillo next() {
        Platillo diaItem = diaItems.get(position); // Obtiene el platillo en la posición actual.
        position = position + 1; // Avanza a la siguiente posición.
        return diaItem; // Devuelve el platillo actual.
    }

    /**
     * Verifica si hay más elementos en la lista para iterar.
     * @return true si hay más elementos, false si no los hay.
     */
    public boolean hasNext() {
        // Si la posición actual es mayor o igual al tamaño de la lista, no hay más elementos.
        if (position >= diaItems.size()) {
            return false; // No hay más elementos, retorna false.
        } else {
            return true; // Hay más elementos, retorna true.
        }
    }
}
