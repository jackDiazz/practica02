//Las hamburguesas se guardan en un arreglo
public class MenuGeneralIterator implements Iterator {
    Platillo[] generalItems;
    int position = 0;

    public MenuGeneralIterator(Platillo[] generalItems){
        this.generalItems = generalItems;
    }
    public Platillo next(){
        Platillo item = generalItems[position];
        position++;
        return item;
    }
    public boolean hasNext(){
        if (position >= generalItems.length){
            return false;
        }
        else {
            return true;
        }
    }
    
}
