package PatterDesignFactory.factoryPattern.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:42 PM
 */

import PatterDesignFactory.factoryPattern.product.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        System.out.println("instanciamos una pizza peperoni unico");
    }
}
