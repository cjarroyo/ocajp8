package oabstractFactoryPattern.methodFactory.store.creator;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:23 AM
 */

import oabstractFactoryPattern.methodFactory.store.PizzaStore7;
import oabstractFactoryPattern.methodFactory.store.product.impl.NYCheesePizza;
import oabstractFactoryPattern.methodFactory.store.product.impl.NYClamPizza;
import oabstractFactoryPattern.methodFactory.store.product.Pizza7;
import oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore7 {

    public Pizza7 createPizza(String item) {
        Pizza7 pizza7 = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza7 = new NYCheesePizza(ingredientFactory);
            pizza7.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza7 = new NYClamPizza(ingredientFactory);
            pizza7.setName("New York Style Clam Pizza");
        }
        return pizza7;
    }
}