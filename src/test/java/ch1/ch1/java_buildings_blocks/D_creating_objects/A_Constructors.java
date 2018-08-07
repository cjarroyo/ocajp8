package ch1.ch1.java_buildings_blocks.D_creating_objects;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:13 PM
 */

import java.util.Random;
/*
Our programs wouldn’t be able to do anything useful if we didn’t have the ability to create new objects. Remember that an object is an instance of a class.
 */
public class A_Constructors {
    //To create an instance of a class, all you have to do is write new before it
    Random r = new Random();
    /*
    First you declare the type that you’ll be creating (Random) and give the variable a name ( r). This gives Java a place to store a reference to the object.
    Then you write new Random() to actually create the object. Random() looks like a method since it is followed by parentheses.
    It’s called a constructor, which is a special type of method that creates a new object
     */
    public A_Constructors() {
        System.out.println("in constructor");
    }

    /*  There are two key points to note about the constructor:
            - the name of the constructor matches the name of the class,
            - and there’s no return type.               */

    public void Chick() { } // NOT A CONSTRUCTOR
}
/*
The purpose of a constructor is to initialize fields, although you can put any code in there.
Another way to initialize fields is to do so directly on the line on which they’re declared. This example shows both approaches:  */

/*public*/ class Chicken {
    int numEggs = 0;// initialize on line
    String name;
    public Chicken() {
        name = "Duke";// initialize in constructor
    }
}