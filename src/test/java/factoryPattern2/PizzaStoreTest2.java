package factoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 09 April 2018 - 7:23 PM
 */

import factoryPattern.PizzaStore;
import factoryPattern.factory.SimplePizzaFactory;
import factoryPattern2.chicagoFactory.ChicagoPizzaFactory;
import factoryPattern2.nyFactory.NYPizzaFactory;

public class PizzaStoreTest2 {

    public static void main(String[] args) {

//        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
//        PizzaStore2 chicagoStore = new PizzaStore2(chicagoFactory);
//        chicagoStore.order("Veggie");

        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore2 nyStore = new PizzaStore2(nyFactory);
        System.out.println(nyStore.order("clam"));
    }
}
