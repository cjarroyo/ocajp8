package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 8:37 PM
 */

import oabstractFactoryPattern.methodFactory.store.creator.NYPizzaStore;
import oabstractFactoryPattern.methodFactory.store.PizzaStore7;
import oabstractFactoryPattern.methodFactory.store.product.Pizza7;

public class PizzaTestDrive7 {

    public static void main(String[] args) {
        PizzaStore7 nyStore = new NYPizzaStore();

        Pizza7 pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }
}