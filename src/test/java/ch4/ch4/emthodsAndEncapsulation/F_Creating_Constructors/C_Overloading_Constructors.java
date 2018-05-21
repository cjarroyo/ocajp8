package ch4.ch4.emthodsAndEncapsulation.F_Creating_Constructors;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 8:00 PM
 */

/*  You can have multiple constructors in the same class as long as they have different method signatures.
    When overloading methods, the method name and parameter list needed to match     */

public class C_Overloading_Constructors {
    private String color;
    private int weight;

//    public C_Overloading_Constructors(int weight) { // first constructor
//        this.weight = weight;
//        color = "brown";
//    }

    public C_Overloading_Constructors(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

//  What we really want is for the first constructor to call the second constructor with two parameters. You might be tempted to write this:
//        public C_Overloading_Constructors(int weight) {
//        C_Overloading_Constructors(weight, "brown"); // DOES NOT COMPILE
//        }

    public C_Overloading_Constructors(int weight) {
        this(weight, "brown");
    }
}