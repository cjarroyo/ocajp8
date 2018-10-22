package ch4.ch4.emthodsAndEncapsulation.A_Designing_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:50 PM
 */

public class B_Optional_Specifiers {
    /*
    Unlike with access modifiers, you can have multiple specifiers in the same method (although not all combinations are legal)
    you can have zero or more specifiers in a method declaration

    static: Covered later in this chapter. Used for class methods.
    abstract: Covered in Chapter 5. Used when not providing a method body.
    final: Covered in Chapter 5. Used when a method is not allowed to be overridden by a subclass.
    synchronized: On the OCP but not the OCA exam.
    native: Not on the OCA or OCP exam. Used when interacting with code written in another language such as C++.
    strictfp: Not on the OCA or OCP exam. Used for making floating-point calculations portable.
    */
    // Do you see why these compile or don’t compile?

    public void walk1() {}

    public final void walk2() {}

    public static final void walk3() {} // The order of these two keywords doesn’t matter.

    public final static void walk4() {} // The order of these two keywords doesn’t matter.

    //public modifier void walk5() {} // DOES NOT COMPILE -> modifier is not a valid optional specifier

    //public void final walk6() {} // DOES NOT COMPILE -> the optional specifier is after the return type

    final public void walk7() {} // Java allows the optional specifiers to appear before the access modifier.

}