package ch4.ch4.emthodsAndEncapsulation.A_Designing_Methods;

/*
 * Created by: Cristian Arroyo
 * on 27 February 2018 - 7:51 PM
 */

public class E_Parameter_List {
    // you can just have an empty pair of parentheses after the method name

    public void walk1() { }
    //public void walk2 { } // DOES NOT COMPILE -> missing the parentheses
    public void walk3(int a) { }
    //public void walk4(int a; int b) { } // DOES NOT COMPILE -> the parameters are separated by a semicolon rather than a comma
    public void walk5(int a, int b) { }

}