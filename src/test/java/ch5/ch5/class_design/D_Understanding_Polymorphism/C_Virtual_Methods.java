package ch5.ch5.class_design.D_Understanding_Polymorphism;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:32 PM
 */

public class C_Virtual_Methods {

/*
The most important feature of polymorphism—and one of the primary reasons we have class structure at all—is to support virtual methods. A virtual method is a method in which
the specific implementation is not determined until runtime. In fact, all non-fi nal, nonstatic, and non-private Java methods are considered virtual methods, since any of them can
be overridden at runtime. What makes a virtual method special in Java is that if you call a method on an object that overrides a method, you get the overridden method, even if the
call to the method is on a parent reference or within the parent class.

We’ll illustrate this principle with the following example:
     */
}

class Bird {
    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }
}

class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
/*
This code compiles and executes without issue and outputs the following:
The bird name is: Peacock
As you saw in similar examples in the section “Overriding a Method,” the method getName() is overridden in the child class Peacock. More importantly, though, the value of
the getName() method at runtime in the displayInformation() method is replaced with the value of the implementation in the subclass Peacock.

In other words, even though the parent class Bird defi nes its own version of getName() and doesn’t know anything about the Peacock class during compile-time, at runtime the
instance uses the overridden version of the method, as defined on the instance of the object.
We emphasize this point by using a reference to the Bird class in the main() method, although the result would have been the same if a reference to Peacock was used.
You now know the true purpose of overriding a method and how it relates to polymorphism. The nature of the polymorphism is that an object can take on many different forms.
By combining your understanding of polymorphism with method overriding, you see that objects may be interpreted in vastly different ways at runtime, especially in methods
defined in the superclasses of the objects.
*/
