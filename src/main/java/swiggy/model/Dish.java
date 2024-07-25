package swiggy.model;

public class Dish {

   public String items;
   public int  rating;
    public double price;
   public int  quantity;

    public Dish(String items, int rating, double price, int quantity) {
        this.items = items;
        this.rating = rating;
        this.price = price;
        this.quantity = quantity;
    }
}
