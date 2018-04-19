package oabstractFactoryPattern.abstractFactory.ingredients;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:17 AM
 */

import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
