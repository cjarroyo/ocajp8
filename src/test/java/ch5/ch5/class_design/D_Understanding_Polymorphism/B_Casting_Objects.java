package ch5.ch5.class_design.D_Understanding_Polymorphism;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:32 PM
 */

public class B_Casting_Objects {
/*
In the previous example, we created a single instance of a Lemur object and accessed it via superclass and interface references. Once we changed the reference type, though,
we lost access to more specifi c methods defined in the subclass that still exist within the object. We can reclaim those references by casting the object back to the specifi c sub-
class it came from:

    Primate primate = lemur;
    Lemur lemur2 = primate; // DOES NOT COMPILE
    Lemur lemur3 = (Lemur)primate;
    System.out.println(lemur3.age);

In this example, we first try to convert the primate reference back to a lemur reference, lemur2, without an explicit cast. The result is that the code will not compile. In the second
example, though, we explicitly cast the object to a subclass of the object Primate and we gain access to all the methods available to the Lemur class.
Here are some basic rules to keep in mind when casting variables:

    1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
    2. Casting an object from a superclass to a subclass requires an explicit cast.
    3. The compiler will not allow casts to unrelated types.
    4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class.

The third rule is important; the exam may try to trick you with a cast that the compiler doesn’t allow. For example, we were able to cast a Primate reference to a Lemur reference,
because Lemur is a subclass of Primate and therefore related.

Consider this example:
    public class Bird {}

    public class Fish {
        public static void main(String[] args) {
            Fish fish = new Fish();
            Bird bird = (Bird)fish; // DOES NOT COMPILE
        }
    }
In this example, the classes Fish and Bird are not related through any class hierarchy that the compiler is aware of; therefore, the code will not compile.
Casting is not without its limitations. Even though two classes share a related hierarchy, that doesn’t mean an instance of one can automatically be cast to another. Here’s an
example:

    public class Rodent {
    }

    public class Capybara extends Rodent {
        public static void main(String[] args) {
            Rodent rodent = new Rodent();
            Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
        }
    }

This code creates an instance of Rodent and then tries to cast it to a subclass of Rodent, Capybara. Although this code will compile without issue, it will throw a
ClassCastException at runtime since the object being referenced is not an instance of the Capybara class. The thing to keep in mind in this example is the object that was created is
not related to the Capybara class in any way.
======================================================================
Although this topic is out of scope for the OCA exam, keep in mind that the instanceof operator can be used to check whether an object belongs to a
particular class and to prevent ClassCastExceptions at runtime. Unlike the previous example, the following code snippet doesn’t throw an exception at
runtime and performs the cast only if the instanceof operator returns true.

    if(rodent instanceof Capybara) {
        Capybara capybara = (Capybara)rodent;
    }
======================================================================

When reviewing a question on the exam that involves casting and polymorphism, be sure to remember what the instance of the object actually is. Then, focus on whether the
compiler will allow the object to be referenced with or without explicit casts.
 */
}
