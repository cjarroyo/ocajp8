package ch1.ch1.java_buildings_blocks.H_Understanding_Default_Initialization_of_Variables;

/*
 * Created by: Cristian Arroyo
 * on 08 May 2018 - 3:24 PM
 */

public class A_Local_Variables {
    /*
    A local variable is a variable defined within a method. Local variables must be initialized
before use. They do not have a default value and contain garbage data until initialized. The
compiler will not let you read an uninitialized value. For example, the following code
generates a compiler error:
4: public int notValid() {
5: int y = 10;
6: int x;
7: int reply = x + y; // DOES NOT COMPILE
8: return reply;
9: }
y is initialized to 10. However, because x is not initialized before it is used in the expres-
sion on line 7, the compiler generates the following error:
Test.java:5: variable x might not have been initialized
int reply = x + y;
^
Until x is assigned a value, it cannot appear within an expression, and the compiler will
gladly remind you of this rule. The compiler knows your code has control of what happens
inside the method and can be expected to initialize values.
The compiler is smart enough to recognize variables that have been initialized after their
declaration but before they are used. Here’s an example:
public int valid() {
int y = 10;
int x; // x is declared here
x = 3; // and initialized here
int reply = x + y;
return reply;
}
The compiler is also smart enough to recognize initializations that are more complex.
In this example, there are two branches of code. answer is initialized in both of them so
the compiler is perfectly happy. onlyOneBranch is only initialized if check happens to be
true. The compiler knows there is the possibility for check to be false, resulting in uninitial-
ized code, and gives a compiler error. You’ll learn more about the if statement in the next
chapter.
public void findAnswer(boolean check) {
int answer;
int onlyOneBranch;
if (check) {
onlyOneBranch = 1;
answer = 1;
} else {
answer = 2;
}
System.out.println(answer);
System.out.println(onlyOneBranch); // DOES NOT COMPILE
}

     */
}
