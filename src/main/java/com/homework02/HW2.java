package com.homework02;
import java.util.Scanner;
public class HW2 {
    /*
    Задача 2.  Напишите программу на Java, которая принимает два целыхчисла от пользователя, а затем
    печатает сумму, разницу, произведение, среднеезначение, расстояние (разница между целыми числами),
    максимум (большее издвух целых чисел), минимум (меньшее из двух целых чисел).
     */
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner scannerOne = new Scanner(System.in);
        int numberOne = scannerOne.nextInt();
        System.out.println("Введите второе целое число");
        Scanner scannerSecond = new Scanner(System.in);
        int numberSecond = scannerSecond.nextInt();

        int sum = numberOne + numberSecond;
        int difference = numberOne - numberSecond;
        int product = numberOne * numberSecond;
        double averageValue = (double) sum / 2;
        int distens= Math.abs(difference);
        int max = Math.max(numberOne, numberSecond);
        int min = Math.min(numberOne,numberSecond);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разница чисел: " + difference);
        System.out.println("Произведение чисел: " + product);
        System.out.println("Среднее значение: " + averageValue);
        System.out.println("Расстояние (разница между целыми числами): " + distens);
        System.out.println("Максимум (большее издвух целых чисел): " + max);
        System.out.println("Минимум (меньшее из двух целых чисел): " + min);
    }
}




