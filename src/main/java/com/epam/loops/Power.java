package com.epam.loops;

public class Power {

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        for (int i = 0; i < power - 1; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

}
