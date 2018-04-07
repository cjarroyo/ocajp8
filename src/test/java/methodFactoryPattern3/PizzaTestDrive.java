package methodFactoryPattern3;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 8:37 PM
 */

import methodFactoryPattern3.creator.ChicagoStylePizzaStore4;
import methodFactoryPattern3.creator.PizzaStore4;
import methodFactoryPattern3.creator.NYStylePizzaStore4;
import methodFactoryPattern3.product.Pizza4;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore4 nyStore = new NYStylePizzaStore4();
        PizzaStore4 chicagoStore = new ChicagoStylePizzaStore4();

        Pizza4 pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");


    }
}