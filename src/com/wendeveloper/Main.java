package com.wendeveloper;

public class Main {

    public static void main(String[] args) {

        // instances of Fruit class
        Fruit apple = new Fruit("apple", 1.99, true);
        Fruit strawberry = new Fruit("strawberry", 3.99, true);
        Fruit orange = new Fruit("orange", 1.79, false);

        System.out.println(apple);
        System.out.println(strawberry);
        System.out.println(orange);
    }
}
