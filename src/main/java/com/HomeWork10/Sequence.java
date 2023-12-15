package com.HomeWork10;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        int[] evenNumbersArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (condition.isOk(array[i])) {
                evenNumbersArray[i] = array[i];
            }
        }
        return evenNumbersArray;
    }
}

