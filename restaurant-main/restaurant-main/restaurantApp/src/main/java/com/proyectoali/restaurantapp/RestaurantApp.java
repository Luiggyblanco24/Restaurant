package com.proyectoali.restaurantapp;
import java.util.ArrayList;

import com.proyectoali.restaurantapp.foods;;
import com.proyectoali.restaurantapp.foods.Menu;
import com.proyectoali.restaurantapp.people.User;
import com.proyectoali.restaurantapp.values.UserTypes;


public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.ADMINISTRATIVE, "Peppa pig", "charco de barro");
        student.sell();
        
        Menu menu = new Menu();
        
        Dish dish1 = new Dish();
        menu.addDish(dish1);
        
        
        menu.showMenu();
        
        
    }
