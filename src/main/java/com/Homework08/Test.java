package com.Homework08;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\data";
        String outputFilePath = "C:\\Users\\Ксения\\IdeaProjects\\Innopolis\\src\\main\\java\\com\\Homework08\\dataResult";
        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
//        Scanner scanner = new Scanner(fileInputStream);
//        String line = scanner.nextLine();
//        String [] allData = line.split("=");

        int read = fileInputStream.read();
        while (read >=0 ) {
            char currentChar = (char) read;
            if (currentChar != ';' && currentChar != ',' && currentChar != '=') {
                fileOutputStream.write(read);
            }
            read = fileInputStream.read();
        }


//        PrintWriter pw = new PrintWriter(outputFilePath);
//        pw.println(Arrays.toString(allData));
//        scanner.close();

//        String[] firstLines = line.split(" = ");
//        String[] name = new String[6];
//        for (String firstLine : firstLines) {
//            name = firstLine.split(";");
//
//        }
//        System.out.println(Arrays.toString(name));
    }

}

