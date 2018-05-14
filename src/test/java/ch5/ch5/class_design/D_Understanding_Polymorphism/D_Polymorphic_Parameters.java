package ch5.ch5.class_design.D_Understanding_Polymorphism;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:32 PM
 */

public class D_Polymorphic_Parameters {
    /*
    One of the most useful applications of polymorphism is the ability to pass instances of
a subclass or interface to a method. For example, you can defi ne a method that takes an
instance of an interface as a parameter. In this manner, any class that implements the inter-
face can be passed to the method. Since you’re casting from a subtype to a supertype, an
explicit cast is not required. This property is referred to as polymorphic parameters of a
method, and we demonstrate it in the following example:
public class Reptile {
public String getName() {
return "Reptile";
}
}
public class Alligator extends Reptile {
public String getName() {
return "Alligator";
}
}
public class Crocodile extends Reptile {
public String getName() {
return "Crocodile";
}
}
public class ZooWorker {
public static void feed(Reptile reptile) {
System.out.println("Feeding reptile "+reptile.getName());
}

public static void main(String[] args) {
feed(new Alligator());
feed(new Crocodile());
feed(new Reptile());
}
}
This code compiles and executes without issue, yielding the following output:
Feeding: Alligator
Feeding: Crocodile
Feeding: Reptile
Let’s focus on the feed(Reptile reptile) method in this example. As you can see, that
method was able to handle instances of Alligator and Crocodile without issue, because
both are subclasses of the Reptile class. It was also able to accept a matching type Reptile
class. If we had tried to pass an unrelated class, such as the previously defi ned Rodent or
Capybara classes, or a superclass such as java.lang.Object, to the feed() method, the
code would not have compiled.

     */

    public void polymorphic_Parameters_and_Code_Reusability(){
        /*
        If you’re defining a method that will be accessible outside the current class, either to
subclasses of the current class or publicly to objects outside the current class, it is con-
sidered good coding practice to use the superclass or interface type of input parameters
whenever possible.
As you may remember from Chapter 3, “Core Java APIs,” the type java.util.List is an
interface, not a class. Although there are many classes that implement java.util.List,
such as java.util.ArrayList and java.util.Vector, when you’re passing an existing
List you’re not usually interested in the particular subclass of the List. In this manner, a
method that passes a List should use the interface type java.util.List as the polymor-
phic parameter type, rather than a specific class that implements List, as the code will be
more reusable for other types of lists.
For example, it is common to see code such as the following that uses the interface refer-
ence type over the class type for greater reusability:
java.util.List list = new java.util.ArrayList();

         */

    }

}
