package ch5.ch5.class_design.A_Introducing_Class_Inheritance;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:29 PM
 */

public class G_Inheriting_Variables {
    /*
    As you saw with method overriding, there were a lot of rules when two methods have the
same signature and are defi ned in both the parent and child classes. Luckily, the rules for
variables with the same name in the parent and child classes are a lot simpler, because Java
doesn’t allow variables to be overridden but instead hidden.

     */

    public void hiding_Variables() {
        /*
        When you hide a variable, you define a variable with the same name as a variable in a par-
ent class. This creates two copies of the variable within an instance of the child class: one
instance defined for the parent reference and another defi ned for the child reference.
As when hiding a static method, you can’t override a variable; you can only hide it. Also
similar to hiding a static method, the rules for accessing the parent and child variables are
quite similar. If you’re referencing the variable from within the parent class, the variable
defi ned in the parent class is used. Alternatively, if you’re referencing the variable from
within a child class, the variable defined in the child class is used. Likewise, you can refer-
ence the parent value of the variable with an explicit use of the super keyword. Consider
the following example:
public class Rodent {
protected int tailLength = 4;
public void getRodentDetails() {
System.out.println("[parentTail="+tailLength+"]");
}
}
public class Mouse extends Rodent {
protected int tailLength = 8;
public void getMouseDetails() {
System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
}
public static void main(String[] args) {
Mouse mouse = new Mouse();
mouse.getRodentDetails();
mouse.getMouseDetails();
}
}
This code compiles without issue and outputs the following when executed:
[parentTail=4]
[tail=8,parentTail=4]


Notice that the instance of Mouse contains two copies of the tailLength variables: one
defi ned in the parent and one defi ned in the child. These instances are kept separate from
each other, allowing our instance of Mouse to reference both tailLength values indepen-
dently. In the fi rst method call, getRodentDetails(), the parent method outputs the parent
value of the tailLength variable. In the second method call, getMouseDetails(), the child
method outputs both the child and parent version of the tailLength variables, using the
super keyword to access the parent variable’s value.
The important thing to remember is that there is no notion of overriding a member vari-
able. For example, there is no code change that could be made to cause Java to override the
value of tailLength, making it the same in both parent and child. These rules are the same
regardless of whether the variable is an instance variable or a static variable.



         */
    }

    public void dont_Hide_Variables_in_Practice() {
            /*


Although Java allows you to hide a variable defined in a parent class with one defined in
a child class, it is considered an extremely poor coding practice. For example, take a look
at the following code, which uses a hidden variable length, marked as public in both
parent and child classes.
public class Animal {
public int length = 2;
}
public class Jellyfish extends Animal {
public int length = 5;
public static void main(String[] args) {
Jellyfish jellyfish = new Jellyfish();
Animal animal = new Jellyfish();
System.out.println(jellyfish.length);
System.out.println(animal.length);
}
}
This code compiles without issue. Here’s the output:
5
2


Notice the same type of object was created twice, but the reference to the object deter-
mines which value is seen as output. If the object Jellyfish was passed to a method by
an Animal reference, as you’ll see in the section “Understanding Polymorphism,” later in
this chapter, the wrong value might be used.
Hiding variables makes the code very confusing and difficult to read, especially if you
start modifying the value of the variable in both the parent and child methods, since it
may not be clear which variable you’re updating.
When defining a new variable in a child class, it is considered good coding practice to
select a name for the variable that is not already a public, protected, or default variable
in use in a parent class. Hiding private variables is considered less problematic because
the child class did not have access to the variable in the parent class to begin with.
             */
    }


}
