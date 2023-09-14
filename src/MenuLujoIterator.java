import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

public class MenuLujoIterator implements Iterator {
    Hashtable lujoItems = new Hashtable();
    int position = 0;

    public MenuLujoIterator (Hashtable lujoItems){
        this.lujoItems = lujoItems;
    }
    public Platillo next() {
        if (hasNext()) {
            Enumeration<Platillo> values = lujoItems.elements();
            int i = 0;
            while (i < position) {
                values.nextElement();
                i++;
            }
            position++;
            return values.nextElement();
        } else {
            throw new NoSuchElementException("No hay más elementos en la iteración");
        }
    }
    


    public boolean hasNext(){
        if(position < lujoItems.size()){
            return true;
        } else{
            return false;
        }

    }
}

