package ndependencyInversionPrinciple;

/*
 * Created by: Cristian Arroyo
 * on 08 April 2018 - 12:14 AM
 */

import ndependencyInversionPrinciple.impl.ChicagoStyleCheesePizza6;
import ndependencyInversionPrinciple.impl.ChicagoStyleClamPizza6;
import ndependencyInversionPrinciple.impl.ChicagoStylePepperoniPizza6;
import ndependencyInversionPrinciple.impl.ChicagoStyleVeggiePizza6;
import ndependencyInversionPrinciple.impl.NYStyleCheesePizza6;
import ndependencyInversionPrinciple.impl.NYStyleClamPizza6;
import ndependencyInversionPrinciple.impl.NYStylePepperoniPizza6;
import ndependencyInversionPrinciple.impl.NYStyleVeggiePizza6;

public class DependentPizzaStore6 {

    public Pizza6 createPizza(String style, String type) {
        Pizza6 pizza6 = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza6 = new NYStyleCheesePizza6();
            } else if (type.equals("veggie")) {
                pizza6 = new NYStyleVeggiePizza6();
            } else if (type.equals("clam")) {
                pizza6 = new NYStyleClamPizza6();
            } else if (type.equals("pepperoni")) {
                pizza6 = new NYStylePepperoniPizza6();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza6 = new ChicagoStyleCheesePizza6();
            } else if (type.equals("veggie")) {
                pizza6 = new ChicagoStyleVeggiePizza6();
            } else if (type.equals("clam")) {
                pizza6 = new ChicagoStyleClamPizza6();
            } else if (type.equals("pepperoni")) {
                pizza6 = new ChicagoStylePepperoniPizza6();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza6.prepare();
        pizza6.bake();
        pizza6.cut();
        pizza6.box();
        return pizza6;

    }


}