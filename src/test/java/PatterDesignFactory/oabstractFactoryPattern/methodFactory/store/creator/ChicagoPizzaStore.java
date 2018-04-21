package PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.creator;

/*
 * Created by: Cristian Arroyo
 * on 09 April 2018 - 8:25 PM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.ChicagoPizzaIngredientFactory;
import PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.PizzaStore7;
import PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product.Pizza7;
import PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product.impl.NYCheesePizza;
import PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product.impl.NYClamPizza;

public class ChicagoPizzaStore extends PizzaStore7 {

    @Override
    public Pizza7 createPizza(String item) {
        Pizza7 pizza7 = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza7 = new NYCheesePizza(ingredientFactory);
            pizza7.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza7 = new NYClamPizza(ingredientFactory);
            pizza7.setName("Chicago Style Clam Pizza");
        }
        return pizza7;
    }
}
