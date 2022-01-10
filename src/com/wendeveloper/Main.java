package com.wendeveloper;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // instances of Fruit class
        Fruit apple = new Fruit("apple", 1.99, true);
        Fruit strawberry = new Fruit("strawberry", 3.99, true);
        Fruit orange = new Fruit("orange", 1.79, false);
//        System.out.println(apple);
//        System.out.println(strawberry);
//        System.out.println(orange);

        ArrayList<Fruit> feliciasFruitList = new ArrayList<>();
        feliciasFruitList.add(apple);
        feliciasFruitList.add(strawberry);
        feliciasFruitList.add(orange);

        ArrayList<Integer> feliciasInventoryList = new ArrayList<>();
        feliciasInventoryList.add(50);
        feliciasInventoryList.add(100);
        feliciasInventoryList.add(80);

        FruitStand fruitStand = new FruitStand("Felicia's Fruit Stand", feliciasFruitList, feliciasInventoryList);

        System.out.println(fruitStand.getInventoryList());



    }
}
