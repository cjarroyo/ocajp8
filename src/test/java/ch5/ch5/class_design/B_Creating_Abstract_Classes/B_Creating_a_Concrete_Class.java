package ch5.ch5.class_design.B_Creating_Abstract_Classes;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:30 PM
 */

public class B_Creating_a_Concrete_Class {
    /*

    When working with abstract classes, it is important to remember that by themselves, they
cannot be instantiated and therefore do not do much other than defi ne static variables and
methods. For example, the following code will not compile as it is an attempt to instantiate
an abstract class.
public abstract class Eel {
public static void main(String[] args) {
final Eel eel = new Eel(); // DOES NOT COMPILE
}
}
An abstract class becomes useful when it is extended by a concrete subclass. A concrete
class is the first nonabstract subclass that extends an abstract class and is required to imple-
ment all inherited abstract methods. When you see a concrete class extending an abstract
class on the exam, check that it implements all of the required abstract methods. Let’s
review this with the following example.
public abstract class Animal {
public abstract String getName();
}

public class Walrus extends Animal { // DOES NOT COMPILE
}
First, note that Animal is marked as abstract and Walrus is not. In this example, Walrus
is considered the fi rst concrete subclass of Animal. Second, since Walrus is the fi rst concrete
subclass, it must implement all inherited abstract methods, getName() in this example.
Because it doesn’t, the compiler rejects the code.
Notice that when we define a concrete class as the “fi rst” nonabstract subclass, we
include the possibility that another nonabstract class may extend an existing nonabstract
class. The key point is that the fi rst class to extend the nonabstract class must implement all
inherited abstract methods. For example, the following variation will also not compile:
public abstract class Animal {
public abstract String getName();
}
public class Bird extends Animal { // DOES NOT COMPILE
}
public class Flamingo extends Bird {
public String getName() {
return "Flamingo";
}
}
Even though a second subclass Flamingo implements the abstract method getName(), the
fi rst concrete subclass Bird doesn’t; therefore, the Bird class will not compile.

     */
}
