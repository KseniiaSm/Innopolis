package com.homework04;

/*
Задача 3*. Задана строка, состоящая из букв английского алфавита, разделенных одним пробелом.
Необходимо каждую последовательность символов упорядочить по возрастанию и вывести слова в
нижнем регистре.
 */
public class TwoWords {
    public static void main(String[] args) {
        String words = new String("Hello SUN");
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        char letter;
        char letterAlphabet;
        StringBuilder wordNew = new StringBuilder();
        StringBuilder wordNewWithSpaces = new StringBuilder();

        for (int j = 0; j < alphabet.length(); j++) {
            letterAlphabet = alphabet.charAt(j);
            for (int i = 0; i < words.length(); i++) {
                letter = words.charAt(i);
                if (alphabet.indexOf(letter, 0) < 0) {

                } else if (alphabet.indexOf(letter, 0) >= 0) {

                    if (letter == letterAlphabet) {
                        wordNew.append(letter);
                    }
                }
            }
        }
        // Буквы в словах упорядочены по алфавиту, но без пробелов
        System.out.println(wordNew);

        int increment = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                wordNewWithSpaces.append(' ');
            } else {
                wordNewWithSpaces.append(wordNew.toString().charAt(increment));
                increment++;
            }
        }
        // Буквы в словах упорядочены по алфавиту
        System.out.println(wordNewWithSpaces);

        String wordLowCase = new String(wordNewWithSpaces);
        wordLowCase = wordLowCase.toLowerCase();
        // Все буквы String стали строчными
        System.out.println(wordLowCase);

    }
}

















