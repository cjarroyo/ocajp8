package ch1.ch1.java_buildings_blocks.D_creating_objects;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:13 PM
 */

public class B_ReadingAndWritingObjectFields {
    /*
    It’s possible to read and write instance variables directly from the caller. In this example, a mother swan lays eggs:
    */
}

class Swan {
    int numberEggs;// instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable
    }
}

/*
Reading a variable is known as getting it. The class gets numberEggs directly to print it out.
Writing to a variable is known as setting it. This class sets numberEggs to 1.

You can even read and write fields directly on the line declaring them:
 */
class Name {
    String first = "Theodore";
    String last = "Moose";
    String full = first + last;
}

