package PatterDesignFactory.factoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:16 PM
 */

import PatterDesignFactory.factoryPattern.factory.SimplePizzaFactory;
import PatterDesignFactory.factoryPattern.product.Pizza;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}