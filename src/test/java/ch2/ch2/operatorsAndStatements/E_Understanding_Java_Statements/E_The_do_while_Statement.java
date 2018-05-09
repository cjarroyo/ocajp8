package ch2.ch2.operatorsAndStatements.E_Understanding_Java_Statements;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:12 PM
 */

import org.junit.Test;

public class E_The_do_while_Statement {

    @Test
    public void theDo_whileStatement(){
        //a do-while loop guarantees that the statement or block will be executed at least once.
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x); // Outputs 1
        //Java will execute the statement block first, and then check the loop condition.
        //puedes combinar los 2
    }
}
