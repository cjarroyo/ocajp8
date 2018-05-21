package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 20 May 2018 - 12:11 AM
 */

import ch4.ch4.emthodsAndEncapsulation.I_excercises.my.rope.*;
import static ch4.ch4.emthodsAndEncapsulation.I_excercises.my.rope.RopeTwelve.*;

public class RopeSwingTwelve {
    private static RopeTwelve ropeTwelve1 = new RopeTwelve();
    private static RopeTwelve ropeTwelve2 = new RopeTwelve();
    {
        System.out.println(ropeTwelve1.length);
    }

    public static void main(String[] args){
        ropeTwelve1.length = 2;
        ropeTwelve2.length = 8;
        System.out.println(ropeTwelve1.length);
    }
}
