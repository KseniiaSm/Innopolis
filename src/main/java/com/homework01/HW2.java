package com.homework01;
public class HW2 {
    public static void main(String[] args) {
        int stone = 0;
        int scissors = 1;
        int paper = 2;
        int vasya = (int) (Math.random() * 3);
        int petya = (int) (Math.random() * 3);
        if (vasya == stone && petya == scissors || vasya == scissors && petya == paper || vasya == paper && petya == stone) {
            System.out.println("Вася победил!!!");
        } else {
            System.out.println("Петя победил!!!");
        }
    }
}



