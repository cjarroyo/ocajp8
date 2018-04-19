package ch4.ch4.emthodsAndEncapsulation.E_Overloading_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:58 PM
 */

/*
  Given the rule about Java picking the most specific version of a method that it can,
  what do you think this code outputs?
 */
public class B_Reference_Types {

    public void fly(String s) {
        System.out.println("string ");
    }

    public void fly(Object o) {
        System.out.println("object ");
    }

    public static void main(String[] args) {
        B_Reference_Types r = new B_Reference_Types();
        r.fly("test");
        r.fly(56);
    }

/*
 The answer is "string object". The first call is a String and fi nds a direct match.
 There's no reason to use the Object version when there is a nice String parameter list just waiting to be called.
 The second call looks for an int parameter list. When it doesn't fi nd one, it autoboxes to Integer.
 Since it still doesn't find a match, it goes to the Object one
*/
}
