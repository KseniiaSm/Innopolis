package com.homework02;
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку");
        Scanner scannerLine = new Scanner(System.in);
        String line = scannerLine.nextLine();
        System.out.println("Сколько раз вывести её на экран?");
        Scanner scannerAmount = new Scanner(System.in);
        int amount = scannerAmount.nextInt();
        int i = 1;
        while (i <= amount) {
            System.out.print(line);
            i++;
        }
    }
}
