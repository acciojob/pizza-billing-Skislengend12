package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isExtraCheeseAdded){
            price += 80;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!this.isExtraToppingAdded){
            if(isVeg){
                price += 70;
            }
            else{
                price += 120;
            }
            this.isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!this.isTakeAway){
            this.isTakeAway = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings;
        if(this.isVeg){
            toppings = 70;
        }else{
            toppings = 120;
        }
        StringBuilder str = new StringBuilder("");
        str.append("Base Price Of The Pizza: " + (isVeg ? 300 : 400) + '\n');
        if(this.isExtraCheeseAdded){
            str.append("Extra Cheese Added: " + 80 + '\n');
        }
        if(this.isExtraToppingAdded){
            str.append("Extra Toppings Added: " + toppings + '\n');
        }
        if(this.isTakeAway){
            str.append("Paperbag Added: " + 20 + '\n');
        }

        str.append("Total Price: " + this.price + '\n');
        this.bill = str.toString();
        return this.bill;
    }
}
