package oabstractFactoryPattern.methodFactory.store.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 2:11 AM
 */

import oabstractFactoryPattern.methodFactory.store.product.Pizza7;
import oabstractFactoryPattern.abstractFactory.ingredients.PizzaIngredientFactory;

public class NYCheesePizza extends Pizza7 {

    private PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + super.getName());
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();

    }
    /*
    * Abstract Factory Pattern defined
We’re adding yet another factory pattern to our pattern family, one that lets us create families
of products. Let’s check out the official definition for this pattern:

The Abstract Factory Pattern provides an interface
for creating families of related or dependent objects
without specifying their concrete classes.


We’ve certainly seen that Abstract Factory allows a client to use an abstract interface to
create a set of related products without knowing (or caring) about the concrete products that
are actually produced. In this way, the client is decoupled from any of the specifics of the
concrete products. Let’s look at the class diagram to see how this all holds together:



     * */
}
