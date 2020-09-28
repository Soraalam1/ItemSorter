package rocks.zipcode.io.comparators;

/**
 * @author leon on 30/01/2019.
 */
import rocks.zipcode.io.Item;

import java.util.Comparator;

public class IdComparator implements Comparator<Item> {
    public int compare(Item a, Item b){
        if(a.getId() > b.getId()){
            return 1;
        }
        if(a.getId() < b.getId()){
            return -1;
        }
        else return 0;
    }
}