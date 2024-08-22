package src;

import src.model.User;

public class SpringRest {

    public static void main(String [] args){
        User user = new User();
        user.setName("Erickson");
        System.out.println(user.getName());
    }
}