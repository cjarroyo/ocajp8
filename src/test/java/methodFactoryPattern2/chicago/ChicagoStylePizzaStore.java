package methodFactoryPattern2.chicago;

/*
 * Created by: Cristian Arroyo
 * on 06 April 2018 - 7:31 PM
 */

import methodFactoryPattern2.Pizza3;
import methodFactoryPattern2.PizzaStore3;
import methodFactoryPattern2.chicago.impl.ChicagoStyleCheesePizza;
import methodFactoryPattern2.chicago.impl.ChicagoStyleClamPizza;
import methodFactoryPattern2.chicago.impl.ChicagoStylePepperoniPizza;
import methodFactoryPattern2.chicago.impl.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore3 {

    @Override
    public Pizza3 createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }

}
