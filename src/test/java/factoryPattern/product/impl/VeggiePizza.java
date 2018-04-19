package factoryPattern.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:54 PM
 */

import factoryPattern.product.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        System.out.println("instanciamos una pizza veggie unico");
    }
}
