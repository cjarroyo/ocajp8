package factoryPattern.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:41 PM
 */

import factoryPattern.product.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        System.out.println("instanciamos una pizza cheese unico");
    }
}
