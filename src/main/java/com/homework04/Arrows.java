package com.homework04;

import java.util.Random;

//Задача 2. Задана последовательность, состоящая только изс имволов ‘>’,‘<’ и ‘-‘. Требуется
// найти количество стрел, которые спрятаны в этой последовательности. Стрелы – это подстроки вида
// ‘>>-->’и‘<--<<’.
public class Arrows {
    public static void main(String[] args) {

        StringBuilder arrows = new StringBuilder("<>-");

        Random rn = new Random();

        while (arrows.length() < 106) {
            int randomNum = rn.nextInt((arrows.length() - 1) - 1 + 1) + 1;
            arrows.append(arrows.charAt(randomNum));
        }

        System.out.println("arrows.lenght = " + arrows.length() + "\narrows: " + arrows);

        String arrow = "<--<<";
        String arrow2 = ">>-->";

        int indexOfStartArrow = 0;
        int indexOfStartArrow2 = 0;
        int amount = 0;

        while (indexOfStartArrow >= 0 || indexOfStartArrow2 >= 0) {
            indexOfStartArrow = arrows.indexOf(arrow);
            indexOfStartArrow2 = arrows.indexOf(arrow2);

            if (indexOfStartArrow <= arrows.length() && indexOfStartArrow >= 0) {
                arrows.delete(indexOfStartArrow, indexOfStartArrow + 5);
                amount++;
            } else if (indexOfStartArrow2 <= arrows.length() && indexOfStartArrow2 >= 0) {
                arrows.delete(indexOfStartArrow2, indexOfStartArrow2 + 5);
                amount++;
            }
        }
        System.out.println(amount);
    }
}








