package PatterDesignFactory.ndependencyInversionPrinciple;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:35 PM
 */

public abstract class Pizza6 {

    public void prepare(){
        System.out.println("prepare");
    }

    public void bake(){
        System.out.println("bake");
    }

    public void cut(){
        System.out.println("cut");
    }
    public void box(){
        System.out.println("box");
    }


}