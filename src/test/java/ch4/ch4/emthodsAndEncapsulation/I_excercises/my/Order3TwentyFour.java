package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 26 May 2018 - 12:55 AM
 */

public class Order3TwentyFour {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
        value2 = "e";
        value3 = "f";
    }
    static {
        value2="h";
    }
}
