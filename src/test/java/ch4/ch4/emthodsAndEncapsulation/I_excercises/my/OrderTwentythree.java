package ch4.ch4.emthodsAndEncapsulation.I_excercises.my;

/*
 * Created by: Cristian Arroyo
 * on 26 May 2018 - 12:49 AM
 */

public class OrderTwentythree {
    String value = "t";
    {
        value += "a";
    }
    {
        value += "c";
    }
    public OrderTwentythree(){
        value += "b";
    }
    public OrderTwentythree(String s){
        value += "s";
    }
    public static void main(String[] args){
        OrderTwentythree order = new OrderTwentythree("f");
        order = new OrderTwentythree();
        System.out.println(order.value);
    }
}
