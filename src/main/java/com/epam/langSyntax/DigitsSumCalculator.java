package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int four = number % 10;
        int third = number / 10 % 10;
        int secound = number / 100 % 10;
        int first = number / 1000;
        System.out.println(first + secound + third + four);
    }

}
