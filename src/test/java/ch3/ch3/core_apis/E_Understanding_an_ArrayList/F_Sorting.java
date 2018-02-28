package ch3.ch3.core_apis.E_Understanding_an_ArrayList;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:46 PM
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class F_Sorting {
    //Sorting an ArrayList is very similar to sorting an array.

    @Test
    public void sorting_1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]

    }
}
