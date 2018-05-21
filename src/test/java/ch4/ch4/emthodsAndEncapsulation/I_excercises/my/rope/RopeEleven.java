package ch4.ch4.emthodsAndEncapsulation.I_excercises.my.rope;

/*
 * Created by: Cristian Arroyo
 * on 20 May 2018 - 12:01 AM
 */

public class RopeEleven {

    public static void swing(){
        System.out.println("swing ");
    }

    public void climb(){
        System.out.println("climb ");
    }

    public static void play(){
        swing();
        //climb();
    }

    public static void main(String[] args){
        RopeEleven ropeEleven = new RopeEleven();
        ropeEleven.play();
        RopeEleven ropeEleven1 = null;
        ropeEleven1.play();
    }
}
