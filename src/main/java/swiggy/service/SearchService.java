package swiggy.service;

import swiggy.model.Restaurant;

import swiggy.model.Swiggy;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    List<Restaurant>restaurants=new ArrayList<>();
    public Restaurant Service(String name){

    for(Restaurant restaurant:restaurants){
        if(restaurant.name==name){
            return restaurant;
        }
    }
       return null;
    }
}
