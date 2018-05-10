package ch3.ch3.core_apis.A_Creating_and_Manipulating_Strings;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:29 PM
 */

import org.junit.Test;

public class B_Immutability {
     /*
     Once a String object is created, it is not allowed to change.
     The trade-off for the optimal packing is zero flexibility.
     You need to know that String is immutable.
     */

    class Mutable {
        private String s;

        // Setter makes it mutable
        public void setS(String newS) {
            s = newS;
        }

        //Immutable only has a getter.
        public String getS() {
            return s;
        }
    }

    final class Immutable {
        private String s = "name";

        public String getS() {
            return s;
        }
    }

    @Test
    public void inmutability1() {
        // + similar concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}