package com.brianJackson;

import java.text.DecimalFormat;

public class DeluxeHamburger {
    private boolean chips;
    private boolean drink;
    private double chipsCost;
    private double drinkCost;

    public  DeluxeHamburger(String bun, String meat, boolean chips , boolean drink) {
        if (chips == true && drink == true) {
            this.chipsCost = 5;
            this.drinkCost = 4;
        } else {
            System.out.println("Not a Deluxe Hamburger. Please order another Hamburger, or add Both chips and a drink");
        }
    }

    public double totals() {
        if (chips==false || drink == false){
            System.out.printf("You must get both chips and a drink with the Deluxe " +
                    "Hamburger " + "chips = " + chips +", drink =  "
                    + drink);
        } else {
            Hamburger basePrices = new Hamburger("no", "no");
            double deluxeBasePrice = basePrices.basePrice();
            double deluxeTotal = chipsCost + drinkCost + deluxeBasePrice;
            DecimalFormat dformat = new DecimalFormat("#.##");
            System.out.println("Your Deluxe Burger will be " + dformat.format(deluxeTotal));
            return deluxeTotal;
        }
        return -1;
    }


}
