package flower.store;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Filter {
    Class<?> filterClass;
    Filter(Class<?> filterClass){
        if (Item.class.isAssignableFrom(filterClass)){
            this.filterClass = filterClass;
        }
    }

    boolean match(Item items) {
        if (filterClass.isInstance(items)){return true;};
        return false;
    }
}
