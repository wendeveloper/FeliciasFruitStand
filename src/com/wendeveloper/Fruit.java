package com.wendeveloper;

// class
public class Fruit {

    // properties
    private String name;
    private double price;
    private boolean isOrganic;
    private String strOrganic;

    // constructor
    public Fruit( String name, double price, boolean isOrganic ) {
        this.name = name;
        this.price = price;
        this.isOrganic = isOrganic;
    }

    // methods
    @Override
    public String toString() {
        //System.out.println("Name: " + this.name + " Price: " + this.price ;
        if (!this.isOrganic) {
            strOrganic = "";
        }else{
            strOrganic = "Organic ";
        }
        return strOrganic + this.name + " $" + this.price + " per lb.";
    }


}
