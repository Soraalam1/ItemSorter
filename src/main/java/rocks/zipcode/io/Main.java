package rocks.zipcode.io;
import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item one = new Item(1015415L, "Sunny D", 600.0);
        Item two = new Item(32451234L, "Audio Interface", 60.0);
        Item three = new Item(73254213L, "Speakers", 100.0);
        Item four = new Item(21431241L, "Spaghetti", 15.0);
        Item[] items = new Item[]{one, two, three,four};
        ItemSorter sorter = new ItemSorter(items);

        System.out.println("Unsorted: " +Arrays.toString(items));

        IdComparator idComparator = new IdComparator();

        sorter.sort(idComparator);

        System.out.println("Sorted by ID: "+ Arrays.toString(items));

        NameComparator nameComparator = new NameComparator();

        sorter.sort(nameComparator);

        System.out.println("Sorted by Name: " + Arrays.toString(items));

        PriceComparator priceComparator = new PriceComparator();

        sorter.sort(priceComparator);

        System.out.println("Sorted by Price: " + Arrays.toString(items));
    }
}
