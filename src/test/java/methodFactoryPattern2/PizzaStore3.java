package methodFactoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:25 PM
 */

import methodFactoryPattern2.ny.NYStylePizzaStore;

public abstract class PizzaStore3 {

    public Pizza3 orderPizza(String type) {
        Pizza3 pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /*
     * Hemos pasado de controlar nuestros propios objetos
     * a
     * que las subclases controlesn la creacion de objetos
     * */
    //este metodo actua como un factory, este es el method factory
    public abstract Pizza3 createPizza(String type);

    /*
    Un método de fábrica maneja la creación de objetos y lo encapsula en una subclase. creación de objeto. Este desacopla el código en la subclase
     */

    public static void main(String [ ] args){
        PizzaStore3 nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}