package oabstractFactoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:20 AM
 */

import oabstractFactoryPattern.Pizza7;
import oabstractFactoryPattern.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza7 {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {

        System.out.println("Preparing " + super.getName());
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
        ingredientFactory.createClam();


    }
}
