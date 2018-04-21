package PatterDesignFactory.methodFactoryPattern3.creator;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:31 PM
 */

import PatterDesignFactory.methodFactoryPattern3.product.Pizza4;
import PatterDesignFactory.methodFactoryPattern3.product.impl.ChicagoStyleCheesePizza;

public class ChicagoStylePizzaStore4 extends PizzaStore4 {

    @Override
    public Pizza4 createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }

}
