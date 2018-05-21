package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 20 May 2018 - 12:35 AM
 */

public class TestFiveteen {
    public void print(byte x){
        System.out.println("Byte");
    }
    public void print(int x){
        System.out.println("Int");
    }
    public void print(float x){
        System.out.println("Float");
    }
    public void print(Object x){
        System.out.println("Object");
    }
    public static void main(String[] args){
        TestFiveteen t = new TestFiveteen();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
    }
}
