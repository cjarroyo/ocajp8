package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 26 May 2018 - 1:03 AM
 */

public class CreateTwentyFive {
    CreateTwentyFive(){
        System.out.println("1");
    }

//    CreateTwentyFive(int num){
//        System.out.println("2");
//    }
    CreateTwentyFive(Integer num){
        System.out.println("3");
    }
    CreateTwentyFive(Object num){
        System.out.println("4");
    }
    CreateTwentyFive(int ... nums){
        System.out.println("5");
    }
    public static void main(String[] ars){
        new CreateTwentyFive(100);
        new CreateTwentyFive(1000L);
    }
}
