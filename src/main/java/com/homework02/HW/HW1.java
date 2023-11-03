package com.homework02.HW;
import java.util.Scanner;
public class HW1 {
     public static void main(String[] args) {
        System.out.println("Введите температуру в грудусах Фаренгейта");
        Scanner scanner = new Scanner(System.in);
        double temperatureFahrenheit = scanner.nextDouble();
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        char o = 176;
        System.out.println("Данная температура соответствует " + temperatureCelsius + o + "C");
    }

}
