package factoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 11:15 AM
 */

import factoryPattern2.impl.NYCheesePizza2;
import factoryPattern2.impl.NYClamPizza2;
import factoryPattern2.impl.NYPepperoniPizza2;
import factoryPattern2.impl.NYVeggiePizza2;

public class NYPizzaFactory {

    public Pizza2 createPizza(String type) {
        Pizza2 pizza2 = null;

        if (type.equals("cheese")) {
            pizza2 = new NYCheesePizza2();

        } else if (type.equals("pepperoni")) {
            pizza2 = new NYPepperoniPizza2();

        } else if (type.equals("clam")) {
            pizza2 = new NYClamPizza2();

        } else if (type.equals("veggie")) {
            pizza2 = new NYVeggiePizza2();
        }
        return pizza2;
    }


}
