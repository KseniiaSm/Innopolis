package com.homework04;

import java.util.Scanner;

public class Letters {

    //Задача 1.Для введенной с клавиатуры буквы английского алфавита нужно вывести
    // слева стоящую букву на стандартной клавиатуре. При этом клавиатура замкнута,
    // т.е. справа от буквы «p» стоит буква «a», а слева от "а" буква "р", так же соседними
    // считаются буквы «l» и буква «z»,а буква «m» с буквой «q».
    public static void main(String[] args) {
        String alphabet1 = "qwertyuiopasdfghjklzxcvbnmq";
        System.out.println("Введите одну любую строчную букву латинского алфавита и вы получите следующую, стоящую на клавиатуре");
        Scanner scannerLetter = new Scanner(System.in);
        String letter = scannerLetter.next();
        int numberLetter = alphabet1.indexOf(letter);
        String letterNext = alphabet1.substring(numberLetter + 1, numberLetter + 2);
        System.out.println(letterNext);
    }
}


