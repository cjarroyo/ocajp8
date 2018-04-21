package PatterDesignFactory.methodFactoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 09 April 2018 - 7:23 PM
 */

import PatterDesignFactory.methodFactoryPattern2.chicago.ChicagoStylePizzaStore;

public class PizzaStoreTest3 {

    public static void main(String[] args) {
        PizzaStore3 nyPizzaStore = new ChicagoStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}

/*
As with every factory, the Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. Looking at the class diagram below, you can see that  he abstract Creator gives you an interface with a method for creating objects, also known as the “factory method.” Any other methods implemented in the abstract Creator are written to operate on products produced the factory method. Only subclasses actually implement the factory method and create products

As in the official definition, you'll often hear developers say that the factory methos lets subclasses decide wich class to instance. The say "decides" not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is written without knowledge of the actual products that will be created, which is decided purely by the choice of the subclass that is used.
 */
