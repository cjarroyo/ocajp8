package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 20 May 2018 - 11:45 PM
 */

public class SquaresSixteen {
    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int value = 9;
        long result = square(value);
        System.out.println(value);
    }
}
