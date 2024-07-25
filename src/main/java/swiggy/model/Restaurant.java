package swiggy.model;

import java.util.List;

public class Restaurant {
    public String name;
    public Address address;
    public double rating;
    public List<Dish> dishList;

    public Restaurant(String name, Address address, double rating, List<Dish> dishList) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.dishList = dishList;
    }
}
