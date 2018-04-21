package PatterDesignFactory.oabstractFactoryPattern.methodFactory.store.product;

/*
 * Created by: Cristian Arroyo
 * on 05 April 2018 - 11:35 PM
 */

import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Cheese;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Clams;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Pepperoni;
import PatterDesignFactory.oabstractFactoryPattern.abstractFactory.ingredients.ingredient.Veggies;



public abstract class Pizza7 {

    private String name;
    private String dough;
    private String sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;

    public abstract void prepare();


    public void bake() {
        System.out.println("“Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClam() {
        return clam;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }
}
