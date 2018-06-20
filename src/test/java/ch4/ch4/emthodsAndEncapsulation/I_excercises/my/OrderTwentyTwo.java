package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 26 May 2018 - 12:12 AM
 */

public class OrderTwentyTwo {
    static String result = "";

    {
        result += "c";
    }

    static {
        result += "u";
        result += "r";
    }
}

class OrderDriver {
    public static void main(String[] args){
        System.out.println(OrderTwentyTwo.result + " ");
        System.out.println(OrderTwentyTwo.result + " ");
        new OrderTwentyTwo();
        new OrderTwentyTwo();
        System.out.println(OrderTwentyTwo.result + " ");
    }
}
