package com.homework03;

import java.util.Scanner;

//4. Создан класс  App с методом main.
public class App {
    public static void main(String[] args) {
        //5.   В   методе  main  класса  App  создано   несколько   экземпляров   класса
        // Телевизор   и   проверено,   как   распечатываются   заполненные   данные
        // обэкземплярах класса.

        //Проверка задания объектов через констуктор
        TV myTV = new TV("samsung", "black", 30, 10000);
        System.out.println(myTV);
        TV yourTV = new TV("LG", "white", 50, 20000);
        System.out.println(yourTV);

        //Проверка задания объекта через setter
        TV ourTV = new TV();
        ourTV.setTVCompany("III");
        ourTV.setColor("red");
        ourTV.setDiagonal(100);
        ourTV.setPrice(50000.5);
        System.out.println(ourTV);

        //Проверка работы getterа
        System.out.println("Наш телевизор фирмы " + ourTV.getTVCompany() +
                '\n');
        //6. Дополнительно. Задавать параметры класса
        // Телевизор с клавиатуры или случайным числом.
        Scanner scannerTV = new Scanner(System.in);
        System.out.println("Пройдите, пожалуйста, небольшой опрос о своем телевизоре.");
        System.out.println("Какой фирмы ваш телевизор?");
        String thereTVCompany = scannerTV.nextLine();
        System.out.println("Какого он цвета?");
        String thereColor = scannerTV.nextLine();
        System.out.println("Введите его диагональ:");
        int thereDiagonal = scannerTV.nextInt();
        System.out.println("За сколько вы его купили?");
        double therePrice = scannerTV.nextDouble();
        System.out.println("Спасибо!");

        TV thereTV = new TV();
        thereTV.setTVCompany(thereTVCompany);
        thereTV.setColor(thereColor);
        thereTV.setDiagonal(thereDiagonal);
        thereTV.setPrice(therePrice);
        System.out.println(thereTV);


    }


}
