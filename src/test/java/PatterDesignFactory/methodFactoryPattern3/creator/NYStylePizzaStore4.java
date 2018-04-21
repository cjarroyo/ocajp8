package PatterDesignFactory.methodFactoryPattern3.creator;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 8:42 PM
 */

import PatterDesignFactory.methodFactoryPattern3.product.Pizza4;
import PatterDesignFactory.methodFactoryPattern3.product.impl.NYStyleCheesePizza;

public class NYStylePizzaStore4 extends PizzaStore4 {

    @Override
    public Pizza4 createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
