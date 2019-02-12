package ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.A_lambda_example;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 8:01 PM
 */

/*
In Java 8, the language added the ability to write code using another style.
Functional programming is a way of writing code more declaratively.
You specify what you want to do rather than dealing with the state of objects.
You focus more on expressions than loops.

Functional programming uses lambda expressions to write code.
A lambda expression is a block of code that gets passed around.
You can think of a lambda expression as an anonymous method.
It has parameters and a body just like full-fledged methods do, but it doesn’t have a name like a real method.
Lambda expressions are often referred to as lambdas for short.
You might also know them as closures if Java isn’t your first language.
If you had a bad experience with closures in the past, don’t worry. They are far simpler in Java.

In other words, a lambda expression is like a method that you can pass as if it were a variable.
For example, there are different ways to calculate age. One human year is equivalent to seven dog years.
You want to write a method that takes an age() method as input.
To do this in an object-oriented program, you’d need to define a Human subclass and a
Dog subclass. With lambdas, you can just pass in the relevant expression to calculate age.

*/

import java.util.ArrayList;
import java.util.List;

public class A_Lambda_Example {
    /*
    Our goal is to print out all the animals in a list according to some criteria.
    We’ll show you how to do this without lambdas to illustrate how lambdas are useful.
     */

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        //print(animals, new CheckIfHopper()); // pass class that does check
        //print(animals, new CheckIfSwims()); // pass class that does check
        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());

        /*
        This code uses a concept called deferred execution. Deferred execution
        means that code is specified now but will run later. In this case, later is when the print()
        method calls it.
         */
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))// the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }

}






