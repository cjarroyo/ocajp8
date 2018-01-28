package ocajp.cap2;

import org.junit.Test;

public class FUnderstandingAdvancedFlowControl {
    // We’ll now show you other ways loops could end,

    @Test
    public void nestedLoops(){
        //loops can contain other loops.
        //Example:  two-dimensional array,
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for(int[] mySimpleArray : myComplexArray) {
            for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    /*
            5  2  1  3
            3  9  8  9
            5  7 12  7

     */

    //Nested loops can include while and do-while,
        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }
    //3 0

    }

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

    @Test
    public void thebreakStatement(){
        //A break statement transfers the flow of control out to the enclosing statement.
        /*
        optionalLabel: while(booleanExpression) {
            // Body
            // Somewhere in loop
        break optionalLabel;
        }
         */
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
                    "("+positionX+","+positionY+")");
        }
    //output: Value 2 found at: (1,1)
    }

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


        /*TA B L E 2 . 5  Advanced flow control usage

                Allows optional labels          Allows break statement          Allows continue statement
if                  Yes *                               No                               No
while               Yes                                 Yes                              Yes
do while            Yes                                 Yes                              Yes
for                 Yes                                 Yes                              Yes
switch              Yes                                 Yes                              No
*/
    }

}
