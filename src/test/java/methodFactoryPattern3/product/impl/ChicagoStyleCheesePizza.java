package methodFactoryPattern3.product.impl;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 8:30 PM
 */

import java.util.ArrayList;

import methodFactoryPattern3.product.Pizza4;

public class ChicagoStyleCheesePizza extends Pizza4 {

    public ChicagoStyleCheesePizza() {
        super("Chicago Style Deep Dish Cheese Pizza", "Extra Thick Crust Dough", "Plum Tomato Sauce", new ArrayList());
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
