package ch4.ch4.emthodsAndEncapsulation.E_Overloading_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:59 PM
 */

/*
Primitives work in a way similar to reference variables.
Java tries to find the most specific matching overloaded method.
What do you think happens here?
 */
public class C_Primitives {
    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        C_Primitives p = new C_Primitives();
        p.fly(123);
        p.fly(123L);
    }

}