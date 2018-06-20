package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 26 May 2018 - 12:08 AM
 */

public class CheatTwentyOne {
    int numPots;
    public CheatTwentyOne(int numPots){
        this.numPots = numPots;
    }

    public static void main(String[] args){
        System.out.println(new CheatTwentyOne(50).numPots);
    }
}
