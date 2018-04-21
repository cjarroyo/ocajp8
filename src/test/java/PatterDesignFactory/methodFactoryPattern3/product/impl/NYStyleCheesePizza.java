package PatterDesignFactory.methodFactoryPattern3.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 8:23 PM
 */

import java.util.ArrayList;

import PatterDesignFactory.methodFactoryPattern3.product.Pizza4;

public class NYStyleCheesePizza extends Pizza4 {

    public NYStyleCheesePizza() {
        //toppings.add("Grated Reggiano Cheese");
        super("NY Style Sauce and Cheese Pizza", "Thin Crust Dough", "Marinara Sauce", new ArrayList());

    }
}

