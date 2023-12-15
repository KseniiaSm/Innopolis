package com.HomeWork10;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = {2345, 3452, 32, 444, 224, 7754, 8555, 935, 10, 112};
        isEven isEven = new isEven();
        isSumNumbersEven isSumNumbersEven = new isSumNumbersEven();
        System.out.println("Исходный массив цифр:" + Arrays.toString(numbers));
        System.out.println("Массив четных цифр: "+ Arrays.toString(Sequence.filter(numbers, isEven)));
        System.out.println("Массив цифр, сумма которых является четным числом: "+ Arrays.toString(Sequence.filter(numbers, isSumNumbersEven)));
    }

    static class isEven implements ByCondition {
        boolean isEven;

        @Override
        public boolean isOk(int number) {
            if (number % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }
            return isEven;
        }
    }

    static class isSumNumbersEven implements ByCondition {
        boolean isSumNumbersEven;
        @Override
        public boolean isOk(int number) {
            int sumOfNumbers;
            if (number / 1000 >= 1) {
                int firstNumberOfNumber = number / 1000;
                int secondNumberOfNumber = (number - firstNumberOfNumber * 1000) / 100;
                int thirdNumberOfNumber = (number - firstNumberOfNumber * 1000 - secondNumberOfNumber * 100) / 10;
                int forthNumberOfNumber = number - firstNumberOfNumber * 1000 - secondNumberOfNumber * 100 - thirdNumberOfNumber * 10;
                sumOfNumbers = firstNumberOfNumber + secondNumberOfNumber + thirdNumberOfNumber + forthNumberOfNumber;
            } else if (number / 100 >= 1) {
                int firstNumberOfNumber = number / 100;
                int secondNumberOfNumber = (number - firstNumberOfNumber * 100) / 10;
                int thirdNumberOfNumber = number - firstNumberOfNumber * 100 - secondNumberOfNumber * 10;
                sumOfNumbers = firstNumberOfNumber + secondNumberOfNumber + thirdNumberOfNumber;
            } else if (number / 10 >= 1) {
                int firstNumberOfNumber = number / 10;
                int secondNumberOfNumber = number;
                sumOfNumbers = firstNumberOfNumber + secondNumberOfNumber;
            } else {
                sumOfNumbers = number;
            }

            if (sumOfNumbers % 2 == 0) {
                isSumNumbersEven = true;
            } else {
                isSumNumbersEven = false;
            }
            return isSumNumbersEven;
        }
    }


}
