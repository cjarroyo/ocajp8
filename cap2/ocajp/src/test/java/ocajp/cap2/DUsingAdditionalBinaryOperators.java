package ocajp.cap2;

import org.junit.Test;

public class DUsingAdditionalBinaryOperators {

    @Test
    public void assignmentOperators() {
        /* The simplest assignment operator is the = assignment*/
        // This statement assigns x the value of 1.
        int x = 1;
        //Java will automatically promote from smaller to larger data types
        //it will throw a compiler exception if it detects you are trying to convert from larger to smaller data types
        /* EXAMPLES
           ========
          int x = 1.0; // DOES NOT COMPILE, you are trying to assign a double 1.0 to an integer value.
          short y = 1921222; // DOES NOT COMPILE, 1921222 is outside the range of short
          int z = 9f; // DOES NOT COMPILE, f added to the end of the number that instructs the compiler to treat
                                            the number as floating-point value
          long t = 192301398193810323; // DOES NOT COMPILE, he value is larger than int allows
        */
    }

    @Test
    public void castingPrimitiveValues(){
        //We can fix the examples in the previous section by casting the results to a smaller data type
        //Casting primitives is required any time you are going from a larger numerical data type to a smaller numerical data type
        //or converting from a floating-point number to an integral value
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;

        /*******Overfl ow and Underflow: ver siguiente metodo********/

        short a = 10;
        short b = 3;
        //short c =  a * b; // DOES NOT COMPILE, a y b son promovidos a int x lo que (a * b) es int, int es mas grande que short, so, error, tendrias que castearlo a short para que compile
        short c = (short) (a * b); //lo solucionamos con un explicit cast al valor mas grande
    }

    @Test
    public void overflowAndUnderflow(){
        short y = (short)1921222; // Stored as 20678
        /*The second value, 1,921,222 , is too large to be stored as a short, so numeric OVERFLOW occurs and it becomes 20,678*/
        /*OVERFLOW is when a number is so large that it will no longer fit within the data type, so
          the system “wraps around” to the next lowest value and counts up from there.*/
        /*There’s also an analogous UNDERFLOW, when the number is too low to fi t in the data type.*/
        /*OJO*/
        System.out.print(2147483647 + 1); // -2147483648
        //Since 2147483647 is the maximum int value, adding any strictly positive value to it will
        //cause it to wrap to the next negative number.
    }

    @Test
    public void compoundAssignmentOperators() {
        //there are also numerous compound assignment operators.
        //in Table 2.1 are required for the exam, += and -=
        //stores the resulting value in a variable in the left-hand side of the statement.
        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long a = 10;
        int b = 5;
        //b = b * a; // DOES NOT COMPILE
        b *= a;//FIXING, The compound operator will first cast "a" to a long , apply the multiplication of two long values, then cast the result to an int

        long p = 5;
        long q = (p=3);
        System.out.println(p); // Outputs 3
        System.out.println(q); // Also, outputs 3
    }

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

    @Test
    public void logicalOperators() {
        /*The logical operators, ( & ), ( | ), and ( ^ ), may be applied to both numeric and boolean data types*/
        /*when they’re applied to numeric data types, they’re referred to as bitwise operators*/
        /*
            x & y       x | y           x ^ y
            (AND)   (INCLUSIVE OR)  (EXCLUSIVE OR)

            AND is only true if both operands are true.
            Inclusive OR is only false if both operands are false.
            Exclusive OR is only true if the operands are different.

            short-circuit operators --> && and ||
            identical to the
            logical operators -->  & and |

            the final result can be determined by the left-hand side of the expression.
         */
            int y = 9;
            boolean x = true || (y < 4); //always TRUE
    }

    @Test
    public void equalityOperators() {

    }


}
