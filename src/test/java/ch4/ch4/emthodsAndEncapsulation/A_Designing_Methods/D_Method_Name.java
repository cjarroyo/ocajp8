package ch4.ch4.emthodsAndEncapsulation.A_Designing_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:51 PM
 */

public class D_Method_Name {
    /*
    an identifier may only contain letters, numbers, $, or _.
    Also, the first character is not allowed to be a number, and reserved words are not allowed.
    By convention, methods begin with a lowercase letter but are not required to.
     */
    public void walk1() { }

    //public void 2walk() { } // DOES NOT COMPILE -> not allowed to begin with numbers

    //public walk3 void() { } // DOES NOT COMPILE -> the method name is before the return type

    public void Walk_$() { }

    //public void() { } // DOES NOT COMPILE -> method name is missing

}
