package ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.C_predicates;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 8:01 PM
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class C_Predicates {
    /*
    Lambdas work with interfaces that have only one method.
    These are called functional interfaces, interfaces that can be used with functional programming.

    You can imagine that we’d have to create lots of interfaces like this to use lambdas.
    We want to test Animals and Strings and Plants and anything else that we come across.
    Luckily, Java recognizes that this is a common problem and provides such an interface for us.
    It’s in the package java.util.function and the gist of it is as follows:

    public interface Predicate<T> {
        boolean test(T t);
    }
    That’s the syntax for generics
     */

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }

    /*
    Java 8 even integrated the Predicate interface into some existing classes. There is only one you need to know for the exam.
    ArrayList declares a removeIf() method that takes a Predicate.
    Imagine we have a list of names for pet bunnies.
    We decide we want to remove all of the bunny names that don’t begin with the letter h because our little cousin really wants us to choose an H name.
    We could solve this problem by writing a loop. Or we could solve it in one line:
*/
    @Test
    public void conejitos() {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);  // [long ear, floppy, hoppy]
        bunnies.removeIf(x -> x.charAt(0) != 'h');
        System.out.println(bunnies);  // [hoppy]
    }
    /*
Line 8 takes care of everything for us. It defines a predicate that takes a String and returns a boolean. The removeIf() method does the rest.
For the OCA exam, you only need to know how to implement lambda expressions that use the Predicate interface.
Remember the one method in the interface called test()? It takes any one reference type parameter and returns a boolean.
Functional programming is a large topic and just the basics are covered.
On the OCP exam, you’ll learn how to get rid of the loop entirely for more than just removeIf().
You’ll also learn the rules for implementing your own functional interfaces as we did with CheckTrait.

     */
}
