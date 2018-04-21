package PatterDesignFactory.methodFactoryPattern2.ny;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:30 PM
 */

import PatterDesignFactory.methodFactoryPattern2.Pizza3;
import PatterDesignFactory.methodFactoryPattern2.PizzaStore3;
import PatterDesignFactory.methodFactoryPattern2.ny.impl.NYStyleCheesePizza;
import PatterDesignFactory.methodFactoryPattern2.ny.impl.NYStyleClamPizza;
import PatterDesignFactory.methodFactoryPattern2.ny.impl.NYStylePepperoniPizza;
import PatterDesignFactory.methodFactoryPattern2.ny.impl.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore3 {

    @Override
    public Pizza3 createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
