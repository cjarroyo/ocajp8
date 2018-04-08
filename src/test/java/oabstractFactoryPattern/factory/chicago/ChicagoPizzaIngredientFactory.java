package oabstractFactoryPattern.factory.chicago;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:56 AM
 */

import oabstractFactoryPattern.factory.PizzaIngredientFactory;
import oabstractFactoryPattern.factory.chicago.impl.BlackOlives;
import oabstractFactoryPattern.factory.chicago.impl.EggPlant;
import oabstractFactoryPattern.factory.chicago.impl.FrozenClams;
import oabstractFactoryPattern.factory.chicago.impl.Mozzarella;
import oabstractFactoryPattern.factory.chicago.impl.PlumTomatoSauce;
import oabstractFactoryPattern.factory.chicago.impl.Spinach;
import oabstractFactoryPattern.factory.chicago.impl.ThickCrustDough;
import oabstractFactoryPattern.ingredient.Cheese;
import oabstractFactoryPattern.ingredient.Clams;
import oabstractFactoryPattern.ingredient.Dough;
import oabstractFactoryPattern.ingredient.Pepperoni;
import oabstractFactoryPattern.ingredient.Sauce;
import oabstractFactoryPattern.ingredient.Veggies;
import oabstractFactoryPattern.factory.ny.impl.SlicedPepperoni;

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
