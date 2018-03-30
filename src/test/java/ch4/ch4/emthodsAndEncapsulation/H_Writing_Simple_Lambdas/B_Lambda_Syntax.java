package ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 8:01 PM
 */

import java.util.List;

import ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.A_lambda_example.Animal;
import ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.A_lambda_example.CheckTrait;

public class B_Lambda_Syntax {
    /*

    One of the simplest lambda expressions you can write

    a -> a.canHop();

    This means that Java should call a method with an Animal parameter that returns a boolean value that’s the result of a.canHop()
    We are passing this lambda as the second parameter of the print() method. That method expects a CheckTrait as the second parameter.
    Since we are passing a lambda instead, Java tries to map our lambda to that interface:

    boolean test(Animal a);

    Since that interface’s method takes an Animal, that means the lambda parameter has to be an Animal.
    And since that interface’s method returns a boolean, we know the lambda returns a boolean.

    The syntax of lambdas is tricky because many parts are optional. These two lines do the exact same thing:

    a -> a.canHop()
    (Animal a) -> { return a.canHop(); }

    Sintaxis:

    Parameter name      body

                a -> a.canHop()

                   arrow
     */

    public static void main(String[] args) {
        //print(() -> true);                        //0 parameters
        //print(a -> a.startsWith("test"));           //1 parameter
        //print((String a) -> a.startsWith("test"));  //1 parameter
        //print((a, b) -> a.startsWith("test"));      //2 pareameters
        //print((String a, String b) -> a.startsWith("test"));    //2 parameters

        //print(a, b -> a.startsWith("test"));        // DOES NOT COMPILE
        /*
        The first line needs parentheses around the parameter list. Remember that the parenthe-
        ses are only optional when there is one parameter and it doesn’t have a type declared.
         */
        //print(a -> { a.startsWith("test"); });      // DOES NOT COMPILE
        /*
        The second line is missing the return keyword
         */
        //print(a -> { return a.startsWith("test") });    // DOES NOT COMPILE
        /*
        The last line is missing the semicolon
         */

        /*
        (a, b) -> { int a = 0; return 5;     // DOES NOT COMPILE,  Since Java doesn’t allow us to redeclare a local variable


        We tried to redeclare a, which is not allowed. By contrast, the following line is okay because it uses a different variable name:
        (a, b) -> { int c = 0; return 5;}
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
