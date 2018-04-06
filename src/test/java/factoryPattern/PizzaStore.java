package factoryPattern;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:16 PM
 */

public class PizzaStore {
    /*Aprenderá que la instanciación es una actividad que no siempre se debe hacer en público y que a menudo puede generar problemas de acoplamiento.
    *
    * Yes, when you use new you are certainly instantiating a concrete class, so that’s definitely an implementation, not an interface.
    * And it’s a good question; you’ve learned that tying your code to a concrete class can make it more fragile and less flexible
    *  identify the
aspects that vary and separate them from what stays the same.
*/

    /*efining a simple factory as a
static method is a common technique and
is often called a static factory. Why use a
static method? Because you don’t need
to instantiate an object to make use of the
create method. But remember it also has
the disadvanage that you can’t subclass and
change the behavior of the create method*/


    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = new Pizza();

        factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

}