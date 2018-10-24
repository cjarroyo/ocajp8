package ch4.ch4.emthodsAndEncapsulation.C_Applying_Access_Modifiers;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:54 PM
 */

/*
 There are four access modifiers: We are going to discuss them in order from most restrictive to least restrictive.
    - private: Only accessible within the same class.
    - default (package private) access: private and other classes in the same package.
    - protected: default access and child classes.
    - public: protected and classes in the other packages.
 */

public class A_Private_Access {
    // Only code in the same class can call private methods or access private fields.
}

class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is ok
    }

    private void makeNoise() {
        quack(); // private access is ok
    }
}

class BadDuckling {
    public void makeNoise() {
        FatherDuck fatherDuck = new FatherDuck();
        //fatherDuck.quack(); // DOES NOT COMPILE
        //System.out.println(fatherDuck.noise); // DOES NOT COMPILE
    }
}

