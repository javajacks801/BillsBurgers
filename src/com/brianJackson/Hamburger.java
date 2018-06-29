package com.brianJackson;

import java.text.DecimalFormat;

public class Hamburger {
    private String bun;
    private String meat;
    private String name;
    private double cheeseCost;
    private double tomatoCost;
    private double lettuceCost;
    private double baconCost;
    private double hamburgerTotal;
    private double hamburgerPrice = 10.99;
    public Hamburger(String bun, String meat) {
        this.bun = bun;
        this.meat = meat;

    }

    public double basePrice () {
        return hamburgerPrice;
    }

    private void addLettuce(){
        lettuceCost = 1.00;

    }

    private void addTomato () {
      tomatoCost = 1.15;
    }

    private void addCheese(){
        cheeseCost = 1.50;
    }

    private void addBacon(){
        baconCost = 2.99;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }
    public double  total () {
        hamburgerTotal = cheeseCost + hamburgerPrice + lettuceCost + tomatoCost + baconCost ;
        DecimalFormat dformat = new DecimalFormat("#.##");
        System.out.println("Your Base Burger will be " + dformat.format(hamburgerTotal));
        return hamburgerTotal;
    }

    public void getCheeseCost() {
         addCheese();
    }

    public void  getTomatoCost() {
         addTomato();
    }

    public void getLettuceCost() {
        addLettuce();
    }

    public void getBaconCost() {
        addBacon();
    }

    public double getBaseTotal() {
        return hamburgerTotal;
    }
}
