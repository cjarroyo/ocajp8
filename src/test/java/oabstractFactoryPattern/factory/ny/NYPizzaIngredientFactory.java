package oabstractFactoryPattern.factory.ny;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:41 AM
 */

import oabstractFactoryPattern.factory.PizzaIngredientFactory;
import oabstractFactoryPattern.ingredient.Cheese;
import oabstractFactoryPattern.ingredient.Clams;
import oabstractFactoryPattern.ingredient.Dough;
import oabstractFactoryPattern.factory.ny.impl.Garlic;
import oabstractFactoryPattern.factory.ny.impl.Mushroom;
import oabstractFactoryPattern.factory.ny.impl.Onion;
import oabstractFactoryPattern.ingredient.Pepperoni;
import oabstractFactoryPattern.factory.ny.impl.RedPepper;
import oabstractFactoryPattern.ingredient.Sauce;
import oabstractFactoryPattern.ingredient.Veggies;
import oabstractFactoryPattern.factory.ny.impl.FreshClams;
import oabstractFactoryPattern.factory.ny.impl.MarinaraSauce;
import oabstractFactoryPattern.factory.ny.impl.ReggianoCheese;
import oabstractFactoryPattern.factory.ny.impl.SlicedPepperoni;
import oabstractFactoryPattern.factory.ny.impl.ThinCrustDough;

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
