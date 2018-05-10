package ch2.ch2.operatorsAndStatements.C_Working_with_Unary_Operators;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:08 PM
 */


import org.junit.Test;

/*unary operator is one that requires exactly one operand, or variable, to function*/
/*
    TABLE 2. 2 Java unary operators
    ________________________________________________________________________________________________________________________________________________________
    Unary operator	Description
    ________________________________________________________________________________________________________________________________________________________
        + 			Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
        - 			Indicates a literal number is negative or negates an expression
        ++ 			Increments a value by 1
        -- 			Decrements a value by 1
        ! 			Inverts a Booleans logical value
    ________________________________________________________________________________________________________________________________________________________
 */
public class A_LogicalComplementAndNegationOperators {

    @Test
    public void logicalComplementAndNegationOperators() {
        //The logical complement operator --> !
        boolean b = false;
        System.out.println(b); // false
        b = !b;
        System.out.println(b); // true

        //the negation operator --> -
        double a = 1.21;
        System.out.println(a); // 1.21
        a = -a;
        System.out.println(a); // -1.21
        a = -a;
        System.out.println(a); // 1.21


        //you cannot apply a negation operator, -, to a boolean expression
        //nor can you apply a logical complement operator, !, to a numeric expression
        //example
        //int x = !5; // DOES NOT COMPILE
        //boolean y = -true; // DOES NOT COMPILE
        //boolean z = !0; // DOES NOT COMPILE

    }
}
