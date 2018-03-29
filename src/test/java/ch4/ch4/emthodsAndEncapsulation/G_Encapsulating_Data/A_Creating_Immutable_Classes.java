package ch4.ch4.emthodsAndEncapsulation.G_Encapsulating_Data;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 8:00 PM
 */

// we had an example of a class with a field that wasn’t private:
/*class Swan {

    int numberEggs;     // instance variable
    //that means any class in the package can set numberEggs
    //We no longer have control of what gets set in our own class. A caller could even write this:.

    // mother.numberEggs = -1;

    //This is clearly no good. We do not want the mother Swan to have a negative number of eggs!
}*/

//Encapsulation to the rescue
//==============================
//Encapsulation means we set up the class so only methods in the class with the variables can refer to the instance variables.
//Callers are required to use these methods. Let’s take a look at our newly encapsulated Swan class:
class Swan {

    private int numberEggs; // private

    public int getNumberEggs() { // getter or accessor method
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) { // setter or mutator method
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
    }
}
/*
For encapsulation, remember that data (an instance variable) is private and getters/setters
are public. Java defines a naming convention that is used in JavaBeans. JavaBeans are reusable
software components. JavaBeans call an instance variable a property. The only thing you need
to know about JavaBeans for the exam is the naming conventions listed
 */

class Saw2 {

    private boolean playing;
    private String name;

    public boolean getPlaying() { //doesn't follow the JavaBeans naming conventions. isPlaying
        return playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String name() { // doesn't follow the JavaBeans naming conventions. getName
        return name;
    }

    public void updateName(String n) { //do not follow the JavaBeans naming conventions. setName
        name = n;
    }

    public void setname(String n) { ////do not follow the JavaBeans naming conventions. setName
        name = n;
    }

}

public class A_Creating_Immutable_Classes {



}


