package factoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:16 PM
 */

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = new Pizza();

        factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

}