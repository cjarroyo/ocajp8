package ch5.ch5.class_design.C_Implementing_Interfaces;

/*
 * Created by: Cristian Arroyo
 * on 14 May 2018 - 2:31 PM
 */

public class C_Interface_Variables {
    /*
    Let’s expand our discussion of interfaces to include interface variables, which can be
defi ned within an interface. Like interface methods, interface variables are assumed to
be public. Unlike interface methods, though, interface variables are also assumed to be
static and final.
Here are two interface variables rules:
1.
2.
Interface variables are assumed to be public, static, and final. Therefore, marking
a variable as private or protected will trigger a compiler error, as will marking any
variable as abstract.
The value of an interface variable must be set when it is declared since it is marked as
final.
In this manner, interface variables are essentially constant variables defi ned on the
interface level. Because they are assumed to be static, they are accessible even without

an instance of the interface. Like our earlier CanFly example, the following two interface
defi nitions are equivalent, because the compiler will automatically convert them both to the
second example:
public interface CanSwim {
int MAXIMUM_DEPTH = 100;
final static boolean UNDERWATER = true;
public static final String TYPE = "Submersible";
}
public interface CanSwim {
public static final int MAXIMUM_DEPTH = 100;
public static final boolean UNDERWATER = true;
public static final String TYPE = "Submersible";
}
As we see in this example, the compile will automatically insert public static final to
any constant interface variables it fi nds missing those modifiers. Also note that it is a com-
mon coding practice to use uppercase letters to denote constant values within a class.
Based on these rules, it should come as no surprise that the following entries will not
compile:
public interface CanDig {
private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
public static String TYPE; // DOES NOT COMPILE
}
The first example, MAXIMUM_DEPTH, doesn’t compile because the private modifier is used,
and all interface variables are assumed to be public. The second line, UNDERWATER, doesn’t
compile for two reasons. It is marked as protected, which conflicts with the assumed
modifi er public, and it is marked as abstract, which confl icts with the assumed modifier
final. Finally, the last example, TYPE, doesn’t compile because it is missing a value. Unlike
the other examples, the modifiers are correct, but as you may remember from Chapter 4,
you must provide a value to a static final member of the class when it is defi ned.

     */
}
