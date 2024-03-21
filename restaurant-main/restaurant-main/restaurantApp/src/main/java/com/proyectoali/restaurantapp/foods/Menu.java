package com.proyectoali.restaurantapp.foods;

import com.proyectoali.restaurantapp.values.DishTypes;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;
    
    public Menu(){
        this.dishList = new ArrayList<>();
        
    }
 
    public void addDish(Dish dish){
        this.dishList.add(dish);
        
    }
    public void showMenu(){
        System.out.println("***---MENU---***");
        
        for(DishTypes dishType : DishTypes.values()){
            System.out.println("----" + dishType + "----");
            
        for (Dish dish : dishList) {
            if (dish.getType() == dishType ) {
                 System.out.println(dish.getName());
            }
           
        }
        }
            
      //que muestre el menu en español y si voy en la mañana que solo me muestre la opcion que yo le quiera enviar  
}
}
    
   
       
            
       
    
            
  
  

