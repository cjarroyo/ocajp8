package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 25 May 2018 - 11:56 PM
 */

public class BirdseedTwenty {
    private int numberBags;
    boolean call;


    public BirdseedTwenty(){
        this(2);
        call = false;
    }

    public BirdseedTwenty(int numberBags){
        this.numberBags = numberBags;
    }

    public static void main(String[] args){
        BirdseedTwenty seed = new BirdseedTwenty();
        System.out.println(seed.numberBags);
    }
}
