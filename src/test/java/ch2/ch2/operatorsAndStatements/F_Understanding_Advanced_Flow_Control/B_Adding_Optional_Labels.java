package ch2.ch2.operatorsAndStatements.F_Understanding_Advanced_Flow_Control;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:13 PM
 */

import org.junit.Test;

public class B_Adding_Optional_Labels {

    @Test
    public void addingOptionalLabels(){
        //A label is an optional pointer to the head of a statement that allows the application flow to jump to it or break from it.
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

    }
}
