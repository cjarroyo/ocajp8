package ch2.ch2.operatorsAndStatements.F_Understanding_Advanced_Flow_Control;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:14 PM
 */

import org.junit.Test;

public class D_The_continue_Statement {

    @Test
    public void thecontinueStatement(){
        //causes flow to finish the execution of the current loop
        /*
        optionalLabel: while(booleanExpression) {
            // Body
            // Somewhere in loop
        continue optionalLabel;
        }*/
        /*While the break statement transfers control to the enclosing statement, the continue
        statement transfers control to the boolean expression that determines if the loop should
        continue*/

        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }


        /*TABLE 2.5  Advanced flow control usage

                Allows optional labels          Allows break statement          Allows continue statement
if                  Yes *                               No                               No
while               Yes                                 Yes                              Yes
do while            Yes                                 Yes                              Yes
for                 Yes                                 Yes                              Yes
switch              Yes                                 Yes                              No
*/
    }
}
