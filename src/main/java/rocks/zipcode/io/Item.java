package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class Item implements Comparator<Item> {
    private String name = "";
    private Long id = 0L;
    private double price = 0.01;

    public Item() {}

    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
