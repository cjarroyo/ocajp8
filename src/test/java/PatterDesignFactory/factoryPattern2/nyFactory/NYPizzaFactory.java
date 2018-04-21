package PatterDesignFactory.factoryPattern2.nyFactory;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 11:15 AM
 */

import PatterDesignFactory.factoryPattern2.product.Pizza2;
import PatterDesignFactory.factoryPattern2.product.impl.NYCheesePizza2;
import PatterDesignFactory.factoryPattern2.product.impl.NYClamPizza2;
import PatterDesignFactory.factoryPattern2.product.impl.NYPepperoniPizza2;
import PatterDesignFactory.factoryPattern2.product.impl.NYVeggiePizza2;

public class NYPizzaFactory {

    public static Pizza2 createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYCheesePizza2();

        } else if (type.equals("pepperoni")) {
            return new NYPepperoniPizza2();

        } else if (type.equals("clam")) {
            return new NYClamPizza2();

        } else if (type.equals("veggie")) {
            return new NYVeggiePizza2();
        }
        return null;
    }


}
