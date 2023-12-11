package com.Homework08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\data";
        File file = new File(inputFilePath);
        Scanner scanner = new Scanner(file);

        String outputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\dataResult";
        PrintWriter printWriter = new PrintWriter(outputFilePath);

        String line = scanner.nextLine();
        String moneySum = line.replaceAll("[^\\d\\s]", " ").replaceAll("\\s+", " ");
        String [] data = line.split(";", 15);



//
//        String onlyNumbersWithout = onlyNumbers.strip();
//        System.out.println(onlyNumbersWithout);


        scanner.close();
        printWriter.close();

    }
}
