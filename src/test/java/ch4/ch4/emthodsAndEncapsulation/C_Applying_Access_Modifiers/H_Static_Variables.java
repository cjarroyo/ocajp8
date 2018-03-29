package ch4.ch4.emthodsAndEncapsulation.C_Applying_Access_Modifiers;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:57 PM
 */


import java.util.ArrayList;

public class H_Static_Variables {
    /*
    Some static variables are meant to change as the program runs. Counters are a common example of this.
    We want the count to increase over time.
    */

    private static int counter = 0; // initialization

    /*
    Other static variables are meant to never change during the program.
    This type of variable is known as a constant.
    It uses the "final" modifier to ensure the variable never changes.
    */

    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // DOES NOT COMPILE
        //The compiler will make sure that you do not accidentally try to update a final variable.
    }



}

class Initializers {
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        values.add("changed");
    }

    /*
    It actually does compile. "values" is a reference variable.
    We are allowed to call methods on reference variables.
    All the compiler can do is check that we don’t try to reassign the final values to point to a different object.
     */
}
