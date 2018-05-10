package ch2.ch2.operatorsAndStatements.F_Understanding_Advanced_Flow_Control;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:13 PM
 */

import org.junit.Test;

// We’ll now show you other ways loops could end,
public class A_Nested_Loops {

    @Test
    public void nestedLoops() {
        //loops can contain other loops.
        //Example:  two-dimensional array,
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    /*
            5  2  1  3
            3  9  8  9
            5  7 12  7

     */
    }

    @Test
    public void nestedLoops_1() {
        //Nested loops can include while and do-while,
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }
        //3 0

    }
}
