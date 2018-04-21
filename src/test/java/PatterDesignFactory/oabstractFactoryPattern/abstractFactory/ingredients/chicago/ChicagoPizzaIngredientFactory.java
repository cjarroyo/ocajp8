package PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:56 AM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.BlackOlives;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.EggPlant;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.FrozenClams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.Mozzarella;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.PlumTomatoSauce;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.Spinach;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.chicago.impl.ThickCrustDough;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.SlicedPepperoni;

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
