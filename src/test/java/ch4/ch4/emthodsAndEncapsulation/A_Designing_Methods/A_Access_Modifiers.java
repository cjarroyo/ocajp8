package ch4.ch4.emthodsAndEncapsulation.A_Designing_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:50 PM
 */

/*
method declaration
=================

access modifier   optional specifier  return type   method name     parentheses (required)  exception (optional)
                                                                    list of parameters

public            final               void          nap             (int minutes)           throws InterruptedException {
        // take a nap
        method body
}
*/

/*
TABLE 4.1        Parts of a method declaration

Element                     Value in nap() example          Required?
____________________________________________________________________________________
Access modifier             public                          No

Optional specifier          final                           No

Return type                 void                            Yes

Method name                 nap                             Yes

Parameter list              (int minutes)                   Yes, but can be empty parentheses

Optional exception list     throws InterruptedException     No

Method body                 {// take a nap}                 Yes, but can be empty braces
________________________________________________________________________________________

To call this method  --> nap(10);

 */

public class A_Access_Modifiers {
    //Java offers four choices of access modifier
    /*
        public: The method can be called from any class.
        private: The method can only be called from within the same class.
        protected: The method can only be called from classes in the same package or subclasses.
        Default (Package Private): Access The method can only be called from classes in the same package.
        This one is tricky because there is no keyword for default access. You simply omit the access modifier.
    */
    public void walk1() {}

    //default void walk2() {} // DOES NOT COMPILE ->  default is not a valid access modifier.

    //void public walk3() {} // DOES NOT COMPILE -> order

    void walk4() {}

}
