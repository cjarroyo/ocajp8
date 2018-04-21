package PatterDesignFactory.factoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 09 April 2018 - 7:12 PM
 */

import PatterDesignFactory.factoryPattern.factory.SimplePizzaFactory;

public class PizzaTest {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        System.out.println(store.orderPizza("veggie"));
    }
}
