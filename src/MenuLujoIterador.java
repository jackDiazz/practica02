import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Clase que implementa un iterador para el Menú de lujo guardado en una hashtable.
 */
public class MenuLujoIterador implements Iterator<Platillo> {
    private Hashtable lujoItems; // Hashtable que almacena los platillos del menú de lujo.
    private int position = 0; // La posición actual en la enumeración.

    /**
     * Constructor de la clase MenuLujoIterador.
     * @param lujoItems Hashtable que contiene los platillos del menú de lujo.
     */
    public MenuLujoIterador(Hashtable lujoItems) {
        this.lujoItems = lujoItems;
    }

    /**
     * Devuelve el siguiente platillo en la enumeración y avanza la posición.
     * @return El siguiente platillo en la enumeración.
     */
    public Platillo next() {
        if (hasNext()) {
            Enumeration<Platillo> values = lujoItems.elements(); // Obtiene una enumeración de los valores (platillos).
            int i = 0;
            while (i < position) {
                values.nextElement(); // Avanza a la siguiente posición de la enumeración.
                i++;
            }
            position++; // Avanza la posición actual.
            return values.nextElement(); // Devuelve el platillo actual.
        } else {
            throw new NoSuchElementException("No hay más elementos en la iteración");
        }
    }

    /**
     * Verifica si hay más elementos en la enumeración.
     * @return true si hay más elementos, false si no los hay.
     */
    public boolean hasNext() {
        return position < lujoItems.size();
    }
}
