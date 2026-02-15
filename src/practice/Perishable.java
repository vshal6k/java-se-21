package practice;

import java.time.Period;

public interface Perishable {
    public static final Period MAX_PERIOD = Period.ofDays(1); //only public static final are allowed in the interface

    void perish(); //Methods are implicity public and abstract
    
    // void daysRemaining(){
    //     //abstract methods cannot have body
    // }

    default void daysRemaining(){
        //not abstract hence, can or cannot have a body
    }

    static void isPerished(){
        //not abstract hence, can or cannot have a body
    }

    private void discard(){
        //not abstract hence, can or cannot have a body
    }

}
