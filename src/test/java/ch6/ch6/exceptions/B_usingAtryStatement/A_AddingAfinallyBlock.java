package ch6.ch6.exceptions.B_usingAtryStatement;

/*
 * Created by: Cristian Arroyo
 * on 20 April 2018 - 6:22 PM
 */

public class A_AddingAfinallyBlock {

    /*
     how to handle them
     _________________
     Java uses a "try" statement to separate the logic that might throw an exception from the logic to handle that exception.

     try {
            //The try block is also referred to
            //as protected code
     } catch ( exception_type identifier ) {
            //exception handler
     }

     The code in the try block is run normally.
     If any of the statements throw an exception that can be caught by the exception type listed in the catch block,
     the try block stops running and execution goes to the catch statement.
     If none of the statements in the try block throw an exception that can be caught, the catch clause is not run.

    You probably noticed the words “block” and “clause” used interchangeably.
    The exam does this as well, so we are getting you used to it. Both are correct.
    “Block” is correct because there are braces present.
    “Clause” is correct because they are part of a try statement.

    In our example:
    The little girl gets up by herself the first time she falls. Here’s what this looks like:
     */
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            //getUp();
        }
        //seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
    }

}

class Trick {

    void explore() {
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }
    }

    void fall() {
        throw new RuntimeException();
    }
}