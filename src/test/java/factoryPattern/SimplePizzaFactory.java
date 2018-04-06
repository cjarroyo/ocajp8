package factoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 12:03 AM
 */

import factoryPattern.impl.CheesePizza;
import factoryPattern.impl.ClamPizza;
import factoryPattern.impl.PepperoniPizza;
import factoryPattern.impl.VeggiePizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();

        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();

        } else if (type.equals("clam")) {
            pizza = new ClamPizza();

        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
