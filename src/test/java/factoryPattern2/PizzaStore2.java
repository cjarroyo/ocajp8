package factoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:06 PM
 */

import factoryPattern2.nyFactory.NYPizzaFactory;
import factoryPattern2.product.Pizza2;

public class PizzaStore2 {

    private NYPizzaFactory nyPizzaFactory;

    public PizzaStore2(NYPizzaFactory nyPizzaFactory) {
        this.nyPizzaFactory = nyPizzaFactory;
    }

    public Pizza2 order(String type) {

        Pizza2 pizza2 = nyPizzaFactory.createPizza(type);

        pizza2.prepare();
        pizza2.bake();
        pizza2.cut();
        pizza2.box();

        return pizza2;

    }
}
