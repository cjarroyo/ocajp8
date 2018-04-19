package methodFactoryPattern3.creator;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:25 PM
 */

import methodFactoryPattern3.product.Pizza4;

public abstract class PizzaStore4 {

    public Pizza4 orderPizza(String type) {
        Pizza4 pizza = createPizza(type);

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
    public abstract Pizza4 createPizza(String type);

    /*
    Un método de fábrica maneja la creación de objetos y lo encapsula en una subclase. creación de objeto. Este desacopla el código en la subclase
     */

//    public static void main(String [ ] args){
//        PizzaStore4 nyPizzaStore = new NYStylePizzaStore();
//        nyPizzaStore.orderPizza("cheese");
//    }
}