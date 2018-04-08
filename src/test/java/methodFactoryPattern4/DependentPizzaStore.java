package methodFactoryPattern4;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 12:14 AM
 */

import methodFactoryPattern4.impl.ChicagoStyleCheesePizza5;
import methodFactoryPattern4.impl.ChicagoStyleClamPizza5;
import methodFactoryPattern4.impl.ChicagoStylePepperoniPizza5;
import methodFactoryPattern4.impl.ChicagoStyleVeggiePizza5;
import methodFactoryPattern4.impl.NYStyleCheesePizza5;
import methodFactoryPattern4.impl.NYStyleClamPizza5;
import methodFactoryPattern4.impl.NYStylePepperoniPizza5;
import methodFactoryPattern4.impl.NYStyleVeggiePizza5;

public class DependentPizzaStore {

    public Pizza5 createPizza(String style, String type) {
        Pizza5 pizza5 = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza5 = new NYStyleCheesePizza5();
            } else if (type.equals("veggie")) {
                pizza5 = new NYStyleVeggiePizza5();
            } else if (type.equals("clam")) {
                pizza5 = new NYStyleClamPizza5();
            } else if (type.equals("pepperoni")) {
                pizza5 = new NYStylePepperoniPizza5();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza5 = new ChicagoStyleCheesePizza5();
            } else if (type.equals("veggie")) {
                pizza5 = new ChicagoStyleVeggiePizza5();
            } else if (type.equals("clam")) {
                pizza5 = new ChicagoStyleClamPizza5();
            } else if (type.equals("pepperoni")) {
                pizza5 = new ChicagoStylePepperoniPizza5();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza5.prepare();
        pizza5.bake();
        pizza5.cut();
        pizza5.box();
        return pizza5;

    }
}