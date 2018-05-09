package ch2.ch2.operatorsAndStatements.D_Using_Additional_Binary_Operators;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:10 PM
 */

import org.junit.Test;

public class C_RelationalOperators {

    @Test
    public void relationalOperators() {
        //compare two expressions and return a boolean value
        //The first four relational operators (see Table 2.3) are applied to numeric primitive data types only.

        /*
        TABLE 2.3       Relational operators
        __________________________________________________
            <        Strictly less than
            <=       Less than or equal to
            >        Strictly greater than
            >=       Greater than or equal to
        _________________________________________________
         */
        int x = 10, y = 20, z = 10; //primitivos
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false
    }
}
