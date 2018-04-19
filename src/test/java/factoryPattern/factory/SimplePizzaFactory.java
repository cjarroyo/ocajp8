package factoryPattern.factory;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 12:03 AM
 */

import factoryPattern.product.Pizza;
import factoryPattern.product.impl.CheesePizza;
import factoryPattern.product.impl.ClamPizza;
import factoryPattern.product.impl.PepperoniPizza;
import factoryPattern.product.impl.VeggiePizza;

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
