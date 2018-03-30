package ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.A_lambda_example;

/*
 * Created by: Cristian Arroyo
 * on 29 March 2018 - 10:20 PM
 */

public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }

}
