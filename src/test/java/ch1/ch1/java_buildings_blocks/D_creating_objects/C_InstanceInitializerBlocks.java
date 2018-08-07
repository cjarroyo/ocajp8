package ch1.ch1.java_buildings_blocks.D_creating_objects;

/*
 * Created by: Cristian Arroyo
 * on 07 May 2018 - 6:14 PM
 */

public class C_InstanceInitializerBlocks {
    /*
     The code between the braces is called a code block. Sometimes this code is called being inside the braces.
     Anywhere you see braces is a code block.
     Sometimes code blocks are inside a method. These are run when the method is called.
     Other times, code blocks appear outside a method. These are called "instance initializers". In Chapter 5, you’ll learn how to use a static initializer.
     */

    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }

    { System.out.println("Snowy"); } //is an instance initializer.
    //There are three code blocks and one instance initializer.
}
