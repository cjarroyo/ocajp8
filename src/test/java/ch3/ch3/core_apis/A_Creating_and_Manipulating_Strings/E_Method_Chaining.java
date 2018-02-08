package ch3.ch3.core_apis.A_Creating_and_Manipulating_Strings;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:31 PM
 */

import org.junit.Test;

public class E_Method_Chaining {

    @Test
    public void method_Chaining_1() {
        /* It is common to call multiple methods on the same String */
        String start = "AniMaL      ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); //"animal"
        String result = lowercase.replace('a', 'A'); //"Animal"
        System.out.println(result);
    }

    @Test
    public void method_Chaining_2() {
        /*You’ll see code using a technique called method chaining */
        String result = "AniMaL     ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
        /* Remember that String is immutable. */
    }

    @Test
    public void method_Chaining_3() {
        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3'); // chaining
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
