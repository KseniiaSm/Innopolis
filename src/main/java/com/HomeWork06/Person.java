package com.HomeWork06;

import java.util.Arrays;

public class Person {
    private String name;
    private int moneySum;
    Product [] packetWithProducts = new Product[5];

    @Override
    public String toString() {
        return name + " - " + Arrays.toString(packetWithProducts);
    }
    Person () {
    }
//    Person(String name, int moneySum, Product [] packetWithProducts) {
//        this.name = name;
//        this.moneySum = moneySum;
//        this.packetWithProducts = packetWithProducts;
//    }

    Person[] allPeople;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;
        } else {
            System.out.println("Имя не задано");
        }
    }

    public int getMoneySum() {
        return moneySum;
    }

    public void setMoneySum(int moneySum) {
        if (moneySum >= 0) {
        this.moneySum = moneySum;
        } else {
            System.out.println("Деньги не могут быть отрицательными");
        }
    }


}
