package ch5.ch5.class_design.C_Implementing_Interfaces;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:31 PM
 */

/*
Although Java doesn’t allow multiple inheritance, it does allow classes to implement any number of interfaces. An interface is an abstract data type that defi nes a list of abstract
public methods that any class implementing the interface must provide. An interface can also include a list of constant variables and default methods, which we’ll cover in this sec-
tion. In Java, an interface is defined with the interface keyword, analogous to the class keyword used when defi ning a class. A class invokes the interface by using the implements
keyword in its class defi nition. Refer to Figures 5.4 and 5.5 for proper syntax usage.


FIGURE 5.4 Defining an interface

                    public or default access modifier
                       |     abstract keyword (assumed)
                       |     |       interface keyword (required)
                       |     |          |     interface name
                       |     |          |       |
                       |     |          |       |
                    public abstract interface CanBurrow {
                        public static final int MINIMUM_DEPTH = 2;
                        public abstract int getMaximumDepth();
                    }   |       |
                        |       |
                        public abstract keywords (assumed)
                                public static final keywords (assumed)

FIGURE 5.5 Implementing an interface

                                  class name
                                      |      implements keyword (required)
                                      |       |         interface name
                                      |       |         |
                                      |       |         |
                    public class FieldMouse implements CanBurrow {
                        public int getMaximumDepth() {
                          |  return 10;
                        } |
                    }     |
                          |
                        signature matches interface method


As you see in this example, an interface is not declared an abstract class, although it has many of the same properties of abstract class. Notice that the method modifiers in this

example, abstract and public, are assumed. In other words, whether or not you provide them, the compiler will automatically insert them as part of the method defi nition.
A class may implement multiple interfaces, each separated by a comma, such as in the following example:

    public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {
    }

In the example, if any of the interfaces defi ned abstract methods, the concrete class Elephant would be required to implement those methods.
New to Java 8 is the notion of default and static interface methods, which we’ll cover at the end of this section.

*/
public class A_Defining_an_Interface {

/*
It may be helpful to think of an interface as a specialized kind of abstract class, since it shares many of the same properties and rules as an abstract class. The following is a list
of rules for creating an interface, many of which you should recognize as adaptions of the rules for defi ning abstract classes.

    1. Interfaces cannot be instantiated directly.
    2. An interface is not required to have any methods.
    3. An interface may not be marked as final.
    4. All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier in their definition.
       Therefore, marking an interface as private, protected, or final will trigger a compiler error, since this is incompatible with these assumptions.
    5. All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition.
       Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible with the abstract and public keywords.

The fourth rule doesn’t apply to inner interfaces, although inner classes and interfaces are not in scope for the OCA exam.
The fi rst three rules are identical to the fi rst three rules for creating an abstract class. Imagine we have an interface WalksOnTwoLegs, defi ned as follows:

    public interface WalksOnTwoLegs {}

It compiles without issue, since interfaces are not required to define any methods. Now consider the following two examples, which do not compile:

    public class TestClass {
        public static void main(String[] args) {
            WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE
        }
    }

    public final interface WalksOnEightLegs {
     // DOES NOT COMPILE
    }
The first example doesn’t compile, as WalksOnTwoLegs is an interface and cannot be instantiated directly. The second example, WalksOnEightLegs, doesn’t compile since inter-
faces may not be marked as final for the same reason that abstract classes cannot be marked as final.
The fourth and fifth rule about “assumed keywords” might be new to you, but you should think of these in the same light as the compiler inserting a default no-argument con-
structor or super() statement into your constructor. You may provide these modifiers yourself, although the compiler will insert them automatically if you do not. For example, the
following two interface defi nitions are equivalent, as the compiler will convert them both to the second example:

    public interface CanFly {
        void fly(int speed);
        abstract void takeoff();
        public abstract double dive();
    }
    public abstract interface CanFly {
        public abstract void fly(int speed);
        public abstract void takeoff();
        public abstract double dive();
    }

In this example, the abstract keyword is fi rst automatically added to the interface defi nition. Then, each method is prepended with abstract and public keywords. If the
method already has either of these keywords, then no change is required. Let’s take a look at an example that violates the assumed keywords:

    private final interface CanCrawl { // DOES NOT COMPILE
        private void dig(int depth); // DOES NOT COMPILE
        protected abstract double depth(); // DOES NOT COMPILE
        public final void surface(); // DOES NOT COMPILE
    }

Every single line of this example doesn’t compile. The first line doesn’t compile for two reasons. First, it is marked as final, which cannot be applied to an interface since it con-
fl icts with the assumed abstract keyword. Next, it is marked as private, which conflicts with the public or default required access for interfaces. The second and third line do
not compile because all interface methods are assumed to be public and marking them as private or protected throws a compiler error. Finally, the last line doesn’t compile
because the method is marked as final and since interface methods are assumed to be abstract, the compiler throws an exception for using both abstract and final keywords
on a method.
========================================================================
Adding the assumed keywords to an interface is a matter of personal preference, although it is considered good coding practice to do so. Code
with the assumed keywords written out tends to be easier and clearer to read, and leads to fewer potential conflicts, as you saw in the previous examples.
========================================================================

Be sure to review the previous example and understand why each of the lines doesn’t compile. There will likely be at least one question on the exam in which an interface or
interface method uses an invalid modifi er.
*/
}