package PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 1:41 AM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Dough;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Garlic;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Mushroom;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.Onion;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.RedPepper;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Sauce;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.FreshClams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.MarinaraSauce;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.ReggianoCheese;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.SlicedPepperoni;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ny.impl.ThinCrustDough;

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
