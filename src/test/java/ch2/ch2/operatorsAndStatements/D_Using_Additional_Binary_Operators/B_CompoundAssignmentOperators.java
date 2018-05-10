package ch2.ch2.operatorsAndStatements.D_Using_Additional_Binary_Operators;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:10 PM
 */

import org.junit.Test;

public class B_CompoundAssignmentOperators {

    @Test
    public void compoundAssignmentOperators() {
        /*
        There are also numerous compound assignment operators.
        In Table 2.1 are required for the exam, += and -=
        Stores the resulting value in a variable in the left-hand side of the statement.
        */
        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long a = 10;
        int b = 5;
        //b = b * a; // DOES NOT COMPILE
        b *= a; //FIXING, The compound operator will first cast "b" to a long , apply the multiplication of two long values, then cast the result to an int
        System.out.println("a: " +a);

        long p = 5;
        long q = (p=3);
        System.out.println("p: "+p); // Outputs 3
        System.out.println("q: "+q); // Also, outputs 3
    }
}
