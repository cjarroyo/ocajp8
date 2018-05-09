package ch2.ch2.operatorsAndStatements.F_Understanding_Advanced_Flow_Control;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:13 PM
 */

import org.junit.Test;

public class C_The_break_Statement {

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
}
