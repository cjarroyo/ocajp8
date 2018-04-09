package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:25 PM
 */

public abstract class PizzaStore7 {

    public Pizza7 orderPizza(String type) {
        Pizza7 pizza7;

        pizza7 = createPizza(type);

        pizza7.prepare();
        pizza7.bake();
        pizza7.cut();
        pizza7.box();
        return pizza7;
    }

    public abstract Pizza7 createPizza(String type);

}