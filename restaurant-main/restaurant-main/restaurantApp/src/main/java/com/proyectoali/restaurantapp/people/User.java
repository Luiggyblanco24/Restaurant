package com.proyectoali.restaurantapp.people;

import com.proyectoali.restaurantapp.values.UserTypes;


public class User {
    private UserTypes type;
    String mane;
    String id;

    public User(UserTypes type, String mane, String id) {
        this.type = type;
        this.mane = mane;
        this.id = id;
    }
    
    public void buy(){
        
    }
    public void sell(){
        if(this.type != UserTypes.ADMINISTRATIVE){
            System.out.println("you are NOT AUTHORIZED to sell" );
        }
        else{
            System.out.println("You are AUTHORIZED to sell");
        }
    }
}
