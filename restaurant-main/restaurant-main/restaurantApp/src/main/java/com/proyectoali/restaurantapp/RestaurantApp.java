package com.proyectoali.restaurantapp;

import com.proyectoali.restaurantapp.foods.Dish;
import com.proyectoali.restaurantapp.foods.Menu;
import com.proyectoali.restaurantapp.people.User;
import com.proyectoali.restaurantapp.values.DishTypes;
import com.proyectoali.restaurantapp.values.DishVariation;
import com.proyectoali.restaurantapp.values.UserTypes;


public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.ADMINISTRATIVE, "Peppa pig", "charco de barro");
        student.sell();
        
        

        Menu menu = new Menu();
        
        Dish dish1 = new Dish(DishTypes.BREAKFAST, "huevos fritos", 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish(DishTypes.LUNCH, "Arroz con carne ", 15, 2400, DishVariation.OPTION2); 
        Dish dish3 = new Dish (DishTypes.DINER, "Calentado", 20, 2400, DishVariation.OPTION3);
        
    
        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        
        menu.showMenu();
       
       
        
        
        
    }}
