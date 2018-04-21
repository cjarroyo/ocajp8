package PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:20 AM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product.Pizza7;

public class NYClamPizza extends Pizza7 {

    private PizzaIngredientFactory ingredientFactory;

    public NYClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

        System.out.println("Preparing " + super.getName());
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
        ingredientFactory.createClam();


    }
}
