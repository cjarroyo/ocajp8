package ch4.ch4.emthodsAndEncapsulation.A_Designing_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:53 PM
 */

public class F_Optional_Exception_List {
    //code can indicate that something went wrong by throwing an exception.
    //that it is optional and where in the method signature it goes if present
    // You can list as many types of exceptions as you want in this clause separated by commas.
    public void zeroExceptions() { }

    public void oneException() throws IllegalArgumentException { }

    public void twoExceptions() throws IllegalArgumentException, InterruptedException { }

    //The calling method can throw the same exceptions or handle them.
}
