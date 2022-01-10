package com.wendeveloper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FruitStand {

    private String nameOfStand;
    private ArrayList<Fruit> fruitList;
    private ArrayList<Integer> inventoryList;

    public FruitStand (String nameOfStand, ArrayList<Fruit> fruitList, ArrayList<Integer> inventoryList) {
        this.nameOfStand = nameOfStand;
        this.fruitList = fruitList;
        this.inventoryList = inventoryList;
    }


    public String getNameOfStand() {
        return nameOfStand;
    }

    public void setNameOfStand(String nameOfStand) {
        this.nameOfStand = nameOfStand;
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public ArrayList<Integer> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Integer> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
