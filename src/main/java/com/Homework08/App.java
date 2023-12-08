package com.Homework08;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        boolean isEmpty = true;

        String inputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\data";
        File file = new File(inputFilePath);
        Scanner scanner = new Scanner(file);

        String outputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\dataResult";
        PrintWriter printWriter = new PrintWriter(outputFilePath);

        String line = scanner.nextLine();
        String moneySum = line.replaceAll("[^\\d\\s]", " ").replaceAll("\\s+", " ").strip();
        String [] moneySumArrayString = moneySum.split(" ");
        int [] moneySumOfAllPeople = new int[3];
        int counter = 0;
        for (String moneySumOfPerson : moneySumArrayString) {
            moneySumOfAllPeople[counter++] = Integer.parseInt(moneySumOfPerson);
        }

        String names = line.replaceAll("[^a-zA-Zа-яА-Я=]"," ").replaceAll("\\s+", " ").strip();
        String [] namesArray = names.split("\\s+=\\s?+");

        Person[] allPeople = new Person[3];
        for (int i = 0; i < allPeople.length; i++) {
            allPeople[i] = new Person();
            allPeople[i].setName(namesArray[i]);
            allPeople[i].setMoneySum(moneySumOfAllPeople[i]);
        }

        String lineSecond = scanner.nextLine();
        String priceAll = lineSecond.replaceAll("[^\\d\\s]", " ").replaceAll("\\s+", " ").strip();
        String [] priceAllArrayString = priceAll.split(" ");
        int [] priceArray = new int[5];
        int counter2 = 0;
        for (String priceEachString : priceAllArrayString) {
            priceArray[counter2++] = Integer.parseInt(priceEachString);
        }

        String nameOfProduct = lineSecond.replaceAll("[^a-zA-Zа-яА-Я=]"," ").replaceAll("\\s+", " ").strip();
        String [] nameOfProductArray = nameOfProduct.split("\\s+=\\s?+");

        Product[] allProducts = new Product[5];
        for (int i = 0; i < allProducts.length; i++) {
            allProducts[i] = new Product();
            allProducts[i].setNameOfProduct(nameOfProductArray[i]);
            allProducts[i].setPrice(priceArray[i]);
        }

        for (int k = 0; k < allPeople.length; k++) {
            for (int m = 0; m < allProducts.length; m++) {
                if (allProducts[m].getPrice() <= allPeople[k].getMoneySum()) {
                    printWriter.println(allPeople[k].getName() + " купил(а) " + allProducts[m].getNameOfProduct());
                    allPeople[k].setMoneySum(allPeople[k].getMoneySum() - allProducts[m].getPrice());
                    allPeople[k].packetWithProducts[m] = allProducts[m];
                } else {
                    printWriter.println(allPeople[k].getName() + " не может позволить себе " + allProducts[m].getNameOfProduct());
                }
            }
            printWriter.println(allPeople[k].getName() + " купил(а) " + Arrays.toString(allPeople[k].packetWithProducts));
            for (int i = 0; i < allPeople[k].packetWithProducts.length; i++) {
                if (allPeople[k].packetWithProducts[i] != null) {
                    isEmpty = false;
                    break;
                } else {
                    isEmpty = true;
                }
            }
            if (isEmpty) {
                printWriter.println(allPeople[k].getName() + " ничего не куплено.");
            }
        }
        scanner.close();
        printWriter.close();

    }
}


