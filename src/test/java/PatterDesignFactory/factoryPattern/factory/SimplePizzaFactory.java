package PatterDesignFactory.factoryPattern.factory;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 12:03 AM
 */

import PatterDesignFactory.factoryPattern.product.Pizza;
import PatterDesignFactory.factoryPattern.product.impl.CheesePizza;
import PatterDesignFactory.factoryPattern.product.impl.ClamPizza;
import PatterDesignFactory.factoryPattern.product.impl.PepperoniPizza;
import PatterDesignFactory.factoryPattern.product.impl.VeggiePizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();

        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();

        } else if (type.equals("clam")) {
            return new ClamPizza();

        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else {
            return null;
        }
    }

}
