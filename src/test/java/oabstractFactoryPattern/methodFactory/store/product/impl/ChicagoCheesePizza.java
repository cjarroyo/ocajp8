package oabstractFactoryPattern.methodFactory.store.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 09 April 2018 - 8:28 PM
 */

import oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import oabstractFactoryPattern.methodFactory.store.product.Pizza7;

public class ChicagoCheesePizza extends Pizza7 {

    private PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory) {
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
