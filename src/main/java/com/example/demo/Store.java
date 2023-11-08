package flower.store;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Item> items;
    public List<Item> search(Filter filter) {
        List<Item> foundItems = new ArrayList<Item>();
        for (Item item : items) {
            if (filter.match(item)){
                foundItems.add(item);
            }
        }
        return foundItems;
    }
    
}
