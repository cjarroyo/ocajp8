package ch4.ch4.emthodsAndEncapsulation.I_excercises;

/*
 * Created by: Cristian Arroyo
 * on 19 May 2018 - 9:12 PM
 */

import org.junit.Test;

public class A_Excercises {

    public int howMany(boolean b, boolean... b2) {
        System.out.println(b2.length);
        return b2.length;
    }

    @Test
    public void cinco() {
        howMany(true, new boolean[]{true, true});
        howMany(true, true, true);
    }

}
