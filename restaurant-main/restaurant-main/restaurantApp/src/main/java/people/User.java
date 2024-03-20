
package people;

import values.UserTypes;


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
            System.out.println("you are NOT AUTHORIZED to sell");
        }
    }
}
