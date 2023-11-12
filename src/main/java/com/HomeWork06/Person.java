package com.HomeWork06;

import java.util.Arrays;

public class Person {
    private String name;
    private int summaMoney;
    Person () {
    }

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

    public int getSummaMoney() {
        return summaMoney;
    }

    public void setSummaMoney(int summaMoney) {
        if (summaMoney >= 0) {
        this.summaMoney = summaMoney;
        } else {
            System.out.println("Деньги не могут быть отрицательными");
        }
    }

    @Override
    public String toString() {
        return name;

    }
}
