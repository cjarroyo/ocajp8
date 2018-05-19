package ch4.ch4.emthodsAndEncapsulation.C_Applying_Access_Modifiers;
/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:58 PM
 */
import java.util.List;
import static java.util.Arrays.asList; //static import

public class J_Static_Imports {

    public static void main(String[] args) {
        List<String> list = asList("one", "two"); //no Arrays
    }

/*
In this example, we are specifically importing the asList method.
This means that any time we refer to asList in the class, it will call Arrays.asList().

An interesting case is what would happen if we created an asList method in our StaticImports class.
Java would give it preference over the imported one and the method we coded would be used.

Regular imports are for importing classes.
Static imports are for importing static members of classes.

Just like regular imports, you can use a wildcard or import a specific member.
The idea is that you shouldn’t have to specify where each static method or variable comes from each time you use it.
An example of when static interfaces shine are when you are referring to a lot of constants in another class.

In a large program, static imports can be overused
*/
}