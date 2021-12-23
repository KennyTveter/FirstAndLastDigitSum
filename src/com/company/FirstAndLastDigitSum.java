package com.company;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int storage = number;
        int topDigit = 0;
        while (storage > 9) {
            storage /= 10;
            if (storage < 10) {
                topDigit += storage;
                break;
            }
        }
        if (number < 10) {
            return number + number;
        } else {
            return lastDigit + topDigit;
        }
    }
}
