package ch3.ch3.core_apis.D_Understanding_Java_Arrays;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:41 PM
 */

import java.util.Arrays;

import org.junit.Test;

public class D_Sorting {
    //Java makes it easy to sort an array by providing a sort method
    //Just like StringBuilder allowed you to pass almost anything to append(), you can pass almost any array to Arrays.sort().
    //To use it, you must have either of the following two statements in your class
    /*
    import java.util.*          // import whole package including Arrays
    import java.util.Arrays;    // import just Arrays
    */

    @Test
    public void sorting_1() {
        //This simple example sorts three numbers:
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        // we had to loop through the output to print the values in the array
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }

    @Test
    public void sorting_2() {
        //Try this again with String types:
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        //String sorts in alphabetic order, and 1 sorts before 9.
    }

}
