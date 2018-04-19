package oabstractFactoryPattern.abstractFactory.ingredients.chicago;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:56 AM
 */

import oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.BlackOlives;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.EggPlant;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.FrozenClams;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.Mozzarella;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.PlumTomatoSauce;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.Spinach;
import oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.ThickCrustDough;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.SlicedPepperoni;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinach(), new EggPlant(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
