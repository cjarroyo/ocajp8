/*
 * Learn String and StringBuilder are used for text data.
 * An array and an ArrayList are used when you have multiple values.
 * A variety of classes are used for working with dates.
 */

package ch3.ch3.core_apis.A_Creating_and_Manipulating_Strings;
/*A string is basically a sequence of characters*/
/*
In Java, these two snippets both create a String
String name = "Fluffy";
String name = new String("Fluffy");
Both give you a reference variable of type name pointing to the String object "Fluffy"
For now, just remember that the String class is special and doesn’t need to be instantiated with new.
*/

import org.junit.Test;

public class A_Concatenation {
    /* Placing one String before the other String and combining them together is called string concatenation*/
/*
RULES:
  1. If both operands are numeric, + means numeric addition.
  2. If either operand is a String, + means concatenation.
  3. The expression is evaluated left to right.
* */

    @Test
    public void concatenation1() {
        System.out.println(1 + 2); //rule 1
        System.out.println("a" + "b"); //rule 2
        System.out.println("a" + "b" + 3); //rule 3, rule 2
        System.out.println(1 + 2 + "c"); //rule 3, rule 1, rule 2
    }

    @Test
    public void concatenation2() {
        //remember the three rules
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);//rule 3, rule 1, rule 2
    }

    @Test
    public void concatenation3() {
        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s);
    }
}
