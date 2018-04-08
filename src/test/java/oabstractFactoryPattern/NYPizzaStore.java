package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:23 AM
 */

import factoryPattern.PizzaStore;
import methodFactoryPattern3.creator.PizzaStore4;
import oabstractFactoryPattern.factory.PizzaIngredientFactory;
import oabstractFactoryPattern.factory.ny.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore4 {

    public Pizza7 createPizza(String item) {
        Pizza7 pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } /*else if (item.equals("veggie")) {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            } */ else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } /*else if (item.equals("pepperoni")) {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }*/
        return pizza;


    }
}