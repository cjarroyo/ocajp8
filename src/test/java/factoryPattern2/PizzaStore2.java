package factoryPattern2;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:06 PM
 */

public class PizzaStore2 {

    NYPizzaFactory nyPizzaFactory;

    public PizzaStore2(NYPizzaFactory nyPizzaFactory) {
        this.nyPizzaFactory = nyPizzaFactory;
    }

    public Pizza2 order(String type) {

        /*ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.order(“Veggie”);*/


        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore2 nyStore = new PizzaStore2(nyFactory);
        Pizza2 pizza2 = nyStore.order("Veggie");

        pizza2.prepare();
        pizza2.bake();
        pizza2.cut();
        pizza2.box();

        return pizza2;

    }
}
