package PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:17 AM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
