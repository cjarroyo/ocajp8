package ch1.ch1.java_buildings_blocks.H_Understanding_Default_Initialization_of_Variables;

/*
 * Created by: Cristian Arroyo
 * on 08 May 2018 - 3:24 PM
 */

public class B_Instance_and_Class_Variables {
    /*
    Variables that are not local variables are known as instance variables or class variables.
Instance variables are also called fields. Class variables are shared across multiple objects.
You can tell a variable is a class variable because it has the keyword static before it. You’ll
learn about this in Chapter 4. For now, just know that a variable is a class variable if it has
the static keyword in its declaration.
Instance and class variables do not require you to initialize them. As soon as you declare
these variables, they are given a default value. You’ll need to memorize everything in table
1.2 except the default value of char. To make this easier, remember that the compiler
doesn’t know what value to use and so wants the simplest type it can give the value: null
for an object and 0/ false for a primitive.


TA B L E 1 . 2
 Default initialization values by type
Variable type
boolean
byte, short, int, long
float, double
char
All object references (everything else)
Default initialization value
false
0 (in the type’s bit-length)
0.0 (in the type’s bit-length)
'\u0000' (NUL)
null


     */
}
