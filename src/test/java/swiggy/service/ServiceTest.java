package swiggy.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swiggy.model.Address;
import swiggy.model.Dish;
import swiggy.model.Restaurant;
import swiggy.model.User;

import java.util.ArrayList;
import java.util.List;

public class ServiceTest {
    @Test
    public void validateLogin() {
        Address address=new Address("hyd","kphb","2","508216");
        User user=new User("vinny","91540",address);

        LoginService loginService=new LoginService();
        loginService.validateLogin(user);

        Assertions.assertNotNull(user);
        Assertions.assertEquals("91540",user.otp);
    }
    @Test
    public  void serviceTest() {
        List<Restaurant>restaurants=new ArrayList<>();
        List<Dish>dish=new ArrayList<>();

        Address address=new Address("hyd","kphb","2","508216");
        Restaurant restaurant=new Restaurant("Lucky",address,4,dish);
        Restaurant restaurant1=new Restaurant("Mehfil",address,5,dish);

        SearchService searchService=new SearchService();
        searchService.restaurants.add(restaurant);
        searchService.restaurants.add(restaurant1);

        Restaurant res=searchService.Service("Mehfil");

        Assertions.assertEquals("Mehfil",res.name);
        Assertions.assertNotNull(res);
    }
    @Test
    public void dishTest() {

        List<Dish> dishes=new ArrayList<>();
        Dish dish1=new Dish("chicken",4,450,2);
        Dish dish2=new Dish("butternan",4,250,3);

        DishService dishService=new DishService();
        dishService.dishes.add(dish1);
        dishService.dishes.add(dish2);

        Dish orderedDish= dishService.findDish("butternan");

        Assertions.assertEquals("butternan",orderedDish.items);
        Assertions.assertNotNull(orderedDish);


    }
}
