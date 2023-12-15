package com.HomeWork07;

import java.util.Arrays;

public class Person {
    private String name;
    private int moneySum;
    int maxAmountOfProducts = 5;
    Product[] packetWithProducts = new Product[maxAmountOfProducts];
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
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
    @Override
    public String toString() {
        return "Person " +
                name + " " + moneySum + "\n" +
                "Пакет с продуктами: " + Arrays.toString(packetWithProducts);
    }
}
