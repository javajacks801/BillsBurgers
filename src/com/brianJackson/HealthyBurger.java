package com.brianJackson;

import java.text.DecimalFormat;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String bun, String meat) {
        super(bun, meat);

    }
    private double avocadoCost;
    private double quinoaCost;

    private void addAvocado() {
       avocadoCost = 2.99;
    }
    private void addQuinoa(){
        quinoaCost = .75;
    }

    @Override
    public double total () {
        double healthyBurgerTotal =  getBaseTotal() + basePrice() + avocadoCost + quinoaCost ;
        DecimalFormat dformat = new DecimalFormat("#.##");
        System.out.println("Your Healthy Burger will be " + dformat.format(healthyBurgerTotal));
        return healthyBurgerTotal;
    }

    public void getAddAvocado() {
        addAvocado();
    }

    public void getAddQuinoa(){
        addQuinoa();
    }

}
