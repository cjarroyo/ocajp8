package ch2.ch2.operatorsAndStatements.E_Understanding_Java_Statements;

/*
 * Created by: Cristian Arroyo
 * on 09 May 2018 - 12:11 PM
 */

import org.junit.Test;

//executed under certain conditions
public class A_The_if_then_Statement {

    @Test
    public void theIf_thenStatement(){
        //we only want to execute a block of code under certain circumstances
        //Accomplishes this by allowing our application to execute a particular block of code if and only if a boolean expression evaluates to true at runtime.

        int morningGreetingCount = 0;
        int hourOfDay = 8;

        if(hourOfDay < 11)
            System.out.println("Good Morning");

        //usando llaves, multiples statements
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }
    }
}
