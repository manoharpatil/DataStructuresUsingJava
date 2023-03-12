package com.example.arrays;

/**
 * Two Dimensional Array:
 * Adding Elements in 2-D Arrays
 */

public class TwoDArrayV1 {

    public static void main(String[] args) {
        int[][] myArray = new int[10][];

        for (int i = 0; i < 10; i++) {
            myArray[i] = new int[10];

            for (int j = 0; j < i; j++) {
                myArray[i][j] = i + j;
                System.out.println(myArray[i][j]);
            }
        }
    }
}
