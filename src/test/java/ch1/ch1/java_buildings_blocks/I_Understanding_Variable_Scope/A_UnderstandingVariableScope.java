package ch1.ch1.java_buildings_blocks.I_Understanding_Variable_Scope;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:17 PM
 */

public class A_UnderstandingVariableScope {
    /*
    You’ve learned that local variables are declared within a method. How many local variables
do you see in this example?
public void eat(int piecesOfCheese) {
int bitesOfCheese = 1;
}
There are two local variables in this method. bitesOfCheese is declared inside the
method. piecesOfCheese is called a method parameter. It is also local to the method. Both
of these variables are said to have a scope local to the method. This means they cannot be
used outside the method.
Local variables can never have a scope larger than the method they are defi ned in.
However, they can have a smaller scope. Consider this example:
3: public void eatIfHungry(boolean hungry) {
4: if (hungry) {
5:
 int bitesOfCheese = 1;
 6: } // bitesOfCheese goes out of scope here
7:
 System.out.println(bitesOfCheese);// DOES NOT COMPILE
8: }
hungry has a scope of the entire method. bitesOfCheese has a smaller scope. It is only
available for use in the if statement because it is declared inside of it. When you see a set of
braces ( { }) in the code, it means you have entered a new block of code. Each block of code
has its own scope. When there are multiple blocks, you match them from the inside out.
In our case, the if statement block begins at line 4 and ends at line 6. The method’s block
begins at line 3 and ends at line 8.
Since bitesOfCheese is declared in such a block, the scope is limited to that block. When
the compiler gets to line 7, it complains that it doesn’t know anything about this bitesOf-
Cheese thing and gives an error:
bitesOfCheese cannot be resolved to a variable
Remember that blocks can contain other blocks. These smaller contained blocks can ref-
erence variables defi ned in the larger scoped blocks, but not vice versa. For example:
16: public void eatIfHungry(boolean hungry) {
17:
 if (hungry) {
18:
 int bitesOfCheese = 1;
19:
 {
20:
 boolean teenyBit = true;
21:
 System.out.println(bitesOfCheese);
22:
 }
23:
 }
24:
 System.out.println(teenyBit); // DOES NOT COMPILE
25: }
The variable defi ned on line 18 is in scope until the block ends on line 23. Using it in the
smaller block from lines 19 to 22 is fine. The variable defi ned on line 20 goes out of scope
on line 22. Using it on line 24 is not allowed.
The exam may attempt to trick you with questions on scope. You’ll probably see a ques-
tion that appears to be about something complex and fails to compile because one of the
variables is out of scope. Let’s try one. Don’t worry if you aren’t familiar with if state-
ments or while loops yet. It doesn’t matter what the code does since we are talking about
scope. See if you can figure out on which line each of the five local variables goes into and
out of scope:
11: public void eatMore(boolean hungry, int amountOfFood) {
12: int roomInBelly = 5;
13: if (hungry) {
14:
 boolean timeToEat = true;
15:
 while (amountOfFood > 0) {
16:
 int amountEaten = 2;
17:
 roomInBelly = roomInBelly - amountEaten;
18:
 amountOfFood = amountOfFood - amountEaten;
19:
 }
20: }
21: System.out.println(amountOfFood);
22: }
The first step in fi guring out the scope is to identify the blocks of code. In this case, there
are three blocks. You can tell this because there are three sets of braces. Starting from the
innermost set, we can see where the while loop’s block starts and ends. Repeat this as we
go out for the if statement block and method block. Table 1.3 shows the line numbers that
each block starts and ends on.
TA B L E 1 . 3
 Blocks for scope
Line
while
if
Method
First line in block
15
13
11
Last line in block
19
20
22
You’ll want to practice this skill a lot. Identifying blocks needs to be second nature for
the exam. The good news is that there are lots of code examples to practice on. You can
look at any code example in this book on any topic and match up braces.
Now that we know where the blocks are, we can look at the scope of each variable.
hungry and amountOfFood are method parameters, so they are available for the entire
method. This means their scope is lines 11 to 22. roomInBelly goes into scope on line 12
because that is where it is declared. It stays in scope for the rest of the method and so goes
out of scope on line 22. timeToEat goes into scope on line 14 where it is declared. It goes
out of scope on line 20 where the if block ends. amountEaten goes into scope on line 16
where it is declared. It goes out of scope on line 19 where the while block ends.
All that was for local variables. Luckily the rule for instance variables is easier: they are
available as soon as they are defi ned and last for the entire lifetime of the object itself. The
rule for class (static) variables is even easier: they go into scope when declared like the other
variables types. However, they stay in scope for the entire life of the program.
Let’s do one more example to make sure you have a handle on this. Again, try to fi gure
out the type of the four variables and when they go into and out of scope.
1:
 public class Mouse {
2:
 static int MAX_LENGTH = 5;
3:
 int length;
4:
 public void grow(int inches) {
5:
 if (length < MAX_LENGTH) {
6:
 int newSize = length + inches;
7:
 length = newSize;
8:
 }
9:
 }
10: }
In this class, we have one class variable (MAX_LENGTH ), one instance variable (length),
and two local variables ( inches and newSize .) MAX_LENGTH is a class variable because it has
the static keyword in its declaration. MAX_LENGTH goes into scope on line 2 where it is
declared. It stays in scope until the program ends. length goes into scope on line 3 where
it is declared. It stays in scope as long as this Mouse object exists. inches goes into scope
where it is declared on line 4. It goes out of scope at the end of the method on line 9.
newSize goes into scope where it is declared on line 6. Since it is defi ned inside the if state-
ment block, it goes out of scope when that block ends on line 8.
Got all that? Let’s review the rules on scope:
■
■
Local variables—in scope from declaration to end of block
Instance variables—in scope from declaration until object garbage collected
■
 Class variables—in scope from declaration until program ends


     */
}
