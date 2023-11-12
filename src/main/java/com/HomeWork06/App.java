package com.HomeWork06;

import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEmpty = true;

        Person[] allPeople;
        allPeople = new Person[3];
        for (int i = 0; i < allPeople.length; i++) {
            System.out.println("Введите свое имя");
            allPeople[i] = new Person();
            allPeople[i].setName(scanner.next() + ' ' + scanner.next());
            System.out.println("Введите колличество денег на счете (целое число).");
            if (scanner.hasNextInt()) {
                allPeople[i].setMoneySum(scanner.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }
        }

        Product[] allProducts;
        allProducts = new Product[5];
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
                if (allProducts[m].getPrice() <= allPeople[k].getMoneySum()) {
                    System.out.println(allPeople[k].getName() + " купил(а) " + allProducts[m].getNameOfProduct());
                    allPeople[k].setMoneySum(allPeople[k].getMoneySum() - allProducts[m].getPrice());
                    allPeople[k].packetWithProducts[m] = allProducts[m];
                    System.out.println(allPeople[k].getName() + " купил(а) " + Arrays.toString(allPeople[k].packetWithProducts));
                } else {
                    System.out.println(allPeople[k].getName() + " не может позволить себе " + allProducts[m].getNameOfProduct());
                }
            }
            for (int i = 0; i < allPeople[k].packetWithProducts.length; i++) {
                if (allPeople[k].packetWithProducts[i] != null) {
                    isEmpty = false;
                    break;
                } else {
                    isEmpty = true;
                }
            }
            if (isEmpty) {
                System.out.println(allPeople[k].getName() + " ничего не может позволить себе");
            }
        }
    }
}


