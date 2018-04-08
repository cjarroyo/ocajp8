package oabstractFactoryPattern.factory;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:17 AM
 */

import oabstractFactoryPattern.ingredient.Cheese;
import oabstractFactoryPattern.ingredient.Clams;
import oabstractFactoryPattern.ingredient.Dough;
import oabstractFactoryPattern.ingredient.Pepperoni;
import oabstractFactoryPattern.ingredient.Sauce;
import oabstractFactoryPattern.ingredient.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
