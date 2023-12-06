package com.homework05;

import java.util.Scanner;

//4. Создан класс  App с методом main.
public class App {
    public static void main(String[] args) {
        //На вход программы в классе App, методе main подается информация отелевизорах
        // в количестве 10 телевизоров. Считать данные в массив объектов(можно выполнить
        // считывание данных в цикле). В каждом из 10 экземпляров класса должны быть заполнены
        // следующие поля:
        // a. Как минимум, 1 поле по выбору, добавленное студентом в задании 3;
        // b. Номер включенного канала - целое число,
        // c. Громкость звука - целое число;
        // d. Признак включен ли телевизор.

        TV[] allTV = new TV[10];

        Scanner scannerTV = new Scanner(System.in);
        System.out.println("Введите данные о телевизорах в комнате.");
        for (int i = 0; i < allTV.length; i++) {
            allTV[i] = new TV();
            System.out.println("Введите данные для телевизора номер " + (i + 1));
            System.out.println("Какой фирмы данный телевизор?");
            allTV[i].setTVCompany(scannerTV.next());

            System.out.println("Телевизор включен сейчас? (Если да, то введите true, если нет, то false)");
            if (scannerTV.hasNextBoolean()) {
                allTV[i].setIsTvOn(scannerTV.nextBoolean());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }

            System.out.println("Включите любой канал на телевизоре и введите его номер");
            if (scannerTV.hasNextInt()) {
                allTV[i].setChanelNumber(scannerTV.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }

            System.out.println("Какой уровень звука на данном телевизоре? (Введите целое число от 0 до 100");
            if (scannerTV.hasNextInt()) {
                allTV[i].setSoundLevel(scannerTV.nextInt());
            } else {
                System.out.println("Неверный формат ввода");
                break;
            }
        }

        System.out.println("Введите максимально допустимое значение звука для вас (рекомендуется ввести с клавиатуры целое число от 50 до 70)");
        int maxVolume = scannerTV.nextInt();
        for (int k = 0; k < allTV.length; k++) {
            if (allTV[k].getSoundLevel() <= maxVolume && allTV[k].getIsTvOn()) {
            System.out.println(allTV[k]);
            }
        }
    }
}