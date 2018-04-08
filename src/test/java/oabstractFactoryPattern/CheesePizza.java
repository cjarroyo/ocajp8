package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:11 AM
 */

import oabstractFactoryPattern.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza7 {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + super.getName());
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();


    }
}
