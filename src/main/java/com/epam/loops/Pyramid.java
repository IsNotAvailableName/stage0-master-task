package com.epam.loops;

public class Pyramid {

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + 2);
            }
            System.out.println();
        }
    }

}
