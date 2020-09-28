package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter{
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public int compare(Item a, Item b){
        if(a.getPrice() > b.getPrice()){
            return 1;
        }
        if(a.getPrice() < b.getPrice()){
            return -1;
        }
        else if(Long.compare(a.getId(),b.getId()) != 0){
            return Long.compare(a.getId(),b.getId());
        }
        else return a.getName().compareTo(b.getName());
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator);
       return items;
    }
}
