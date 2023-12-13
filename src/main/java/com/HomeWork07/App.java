package com.HomeWork07;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEmpty = true;

        Person[] allPeople;
        allPeople = new Person[3];
        for (int i = 0; i < allPeople.length; i++) {
            System.out.println("Введите свое имя и отчество");
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

        System.out.println("Вводите данные продуктов, которые не учавствуют в акции");
        Product[] allProducts = new Product[4];
        for (int j = 0; j < 2; j++) {
            System.out.println("Введите название продукта, который не имеет скидки");
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

        System.out.println("Вводите данные акционных продуктов");
        DiscountProduct dp1 = new DiscountProduct();
        System.out.println("Введите название продукта, который учавствует в акции");
        allProducts[2] = dp1;
        allProducts[2].setNameOfProduct(scanner.next());
        System.out.println("Введите цену данного продукта");
        if (scanner.hasNextInt()) {
            allProducts[2].setPrice(scanner.nextInt());
        } else {
            System.out.println("Неверный формат ввода");
        }
        System.out.println("Введите колличество дней до окончания акции");
        if (scanner.nextInt() > 0) {
            System.out.println("Введите размер скидки в процентах");
            if (scanner.hasNextInt()) {
                dp1.setDiscount(scanner.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
            }
        } else {
            System.out.println("Акция завершена");
            dp1.setDiscount(0);
        }

        DiscountProduct dp2 = new DiscountProduct();
        System.out.println("Введите название продукта, который учавствует в акции");
        allProducts[3] = dp2;
        allProducts[3].setNameOfProduct(scanner.next());
        System.out.println("Введите цену данного продукта");
        if (scanner.hasNextInt()) {
            allProducts[3].setPrice(scanner.nextInt());
        } else {
            System.out.println("Неверный формат ввода");
        }
        System.out.println("Введите колличество дней до окончания акции");
        if (scanner.nextInt() > 0) {
            System.out.println("Введите размер скидки в процентах");
            if (scanner.hasNextInt()) {
                dp2.setDiscount(scanner.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
            }
        } else {
            System.out.println("Акция завершена");
            dp2.setDiscount(0);
        }

        for (int k = 0; k < allPeople.length; k++) {
            for (int m = 0; m < allProducts.length; m++) {
                if (allProducts[m].getPrice() <= allPeople[k].getMoneySum()) {
                    System.out.println(allPeople[k].getName() + " купил(а) " + allProducts[m].getNameOfProduct());
                    allPeople[k].setMoneySum(allPeople[k].getMoneySum() - allProducts[m].getPrice());
                    allPeople[k].packetWithProducts[m] = allProducts[m];
                } else {
                    System.out.println(allPeople[k].getName() + " не может позволить себе " + allProducts[m].getNameOfProduct());
                }
            }
            System.out.println(allPeople[k].getName() + " купил(а) " + Arrays.toString(allPeople[k].packetWithProducts));
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





