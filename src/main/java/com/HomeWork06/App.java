package com.HomeWork06;

import java.util.Arrays;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] allPeople;
        allPeople = new Person[2];
        for (int i = 0; i < allPeople.length; i++) {
            System.out.println("Введите свое имя");
            allPeople[i] = new Person();
            allPeople[i].setName(scanner.next());
            System.out.println("Введите колличество денег на счете (целое число).");
            if (scanner.hasNextInt()) {
                allPeople[i].setSummaMoney(scanner.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }
        }

        Product[] allProducts;
        allProducts = new Product[1];
        for (int j = 0; j < allProducts.length; j++) {
            System.out.println("Введите название продукта");
            allProducts[j] = new Product();
            allProducts[j].setNameOfProduct(scanner.next());
            System.out.println("Введите цену данного продукта");
            if (scanner.hasNextInt()) {
                allProducts[j].setPrice(scanner.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }
        }

        for (int k = 0; k < allPeople.length; k++) {
            for (int m = 0; m < allProducts.length; m++) {
                if (allProducts[m].getPrice() <= allPeople[k].getSummaMoney()) {
                    System.out.println(allPeople[k].getName() + " купил " + allProducts[m].getNameOfProduct());
                    allPeople[k].setSummaMoney(allPeople[k].getSummaMoney() - allProducts[m].getPrice());

                } else {
                    System.out.println(allPeople[k].getName() + " не может позволить себе " + allProducts[m].getNameOfProduct());
                }
            }
        }

    }
}

