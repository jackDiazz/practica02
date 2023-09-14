//Se guarda en un ArrayList
import java.util.ArrayList;

public class MenuDiaIterador implements Iterator {
    ArrayList<Platillo> diaItems;
    int position = 0;

    public MenuDiaIterador (ArrayList<Platillo> diaItems){
        this.diaItems = diaItems;
    }

    public Platillo next(){
        Platillo diaItem = diaItems.get(position);
            position = position + 1;
            return diaItem;    
    }
    public boolean hasNext(){
        if(position >= diaItems.size()){
            return false;
        } else {
            return true;
        }
    }

    
}
