package swiggy.service;

import swiggy.model.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishService {

    List<Dish>dishes=new ArrayList<>();
    public Dish findDish(String items) {
        for (Dish dish : dishes) {
            if (dish.items == items) {
                return dish;

            }
        }
            return null;
    }
}
