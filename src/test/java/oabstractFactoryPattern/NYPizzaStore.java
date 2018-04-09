package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:23 AM
 */

import oabstractFactoryPattern.factory.PizzaIngredientFactory;
import oabstractFactoryPattern.factory.ny.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore7 {

    public Pizza7 createPizza(String item) {
        Pizza7 pizza7 = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza7 = new CheesePizza(ingredientFactory);
            pizza7.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza7 = new ClamPizza(ingredientFactory);
            pizza7.setName("New York Style Clam Pizza");
        }
        return pizza7;


    }
}