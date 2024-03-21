package com.proyectoali.restaurantapp.foods;

import com.proyectoali.restaurantapp.values.DishTypes;
import com.proyectoali.restaurantapp.values.DishVariation;


 public class Dish {
    DishTypes type;
    String name;
    int stock;
    int price;
    DishVariation variation;
  

    public Dish(DishTypes type, String name, int stock, int price, DishVariation variation ) {
        this.type = type;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
        
    }
    
}
