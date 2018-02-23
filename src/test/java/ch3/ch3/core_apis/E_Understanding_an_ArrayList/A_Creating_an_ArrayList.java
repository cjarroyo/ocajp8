package ch3.ch3.core_apis.E_Understanding_an_ArrayList;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:45 PM
 */

import java.util.ArrayList;

import org.junit.Test;
/*
    - An array has one glaring shortcoming
    - you have to know how many elements will be in the array when you create it and then you are stuck with that choice.
    - Just like a StringBuilder, ArrayList can change size at runtime as needed
    - Like an array, an ArrayList is an ordered sequence that allows duplicates.
    - As when we used Arrays.sort, ArrayList requires an import

    import java.util.*                  // import whole package including ArrayList
    import java.util.ArrayList;         // import just ArrayList

    In this section, we’ll look at creating an ArrayList, common methods, autoboxing, conversion, and sorting.

 */



public class A_Creating_an_ArrayList {

    @Test
    public void creating_an_ArrayList_1(){
        //As with StringBuilder, there are three ways to create an ArrayList:
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        //The first says to create an ArrayList containing space for the default number of elements but not to fill any slots yet
        //The second says to create an ArrayList containing a specific number of slots, but again not to assign any
        //The final example tells Java that we want to make a copy of another ArrayList. We copy both the size and contents of that ArrayList

    }


}
