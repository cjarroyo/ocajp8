package ch2.ch2.operatorsAndStatements.E_Understanding_Java_Statements;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:12 PM
 */

import org.junit.Test;

public class D_The_while_Statement {

    /*During execution, the boolean expression is evaluated before each iteration of the loop and exits if the evaluation returns false.*/
    int roomInBelly = 5;

    @Test
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
        //you ensure that the while loop can end for either of the conditions
    }
    //tener cuidado con los loops infinitos
}