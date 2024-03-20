package com.proyectoali.restaurantapp;

import people.User;
import values.UserTypes;


public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Peppa pig", "charco de barro");
        student.sell();
    }
}
