package oabstractFactoryPattern.abstractFactory.ingredients.ny;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:41 AM
 */

import oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Garlic;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Mushroom;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Onion;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.RedPepper;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.FreshClams;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.MarinaraSauce;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.ReggianoCheese;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.SlicedPepperoni;
import oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();

    }
}
