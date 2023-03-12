package com.example.arrays;

/**
 * One-Dimensional Array:
 * Adding or Updating Elements in an Array:
 * To add or update the element in an array, we specify the particular index and assign the new value.
 */

public class OneDArrayV3 {

    public static void main(String[] args) {

        // Initialization and Declaration in one step
        int[] array = new int[4];

        // Adding elements in an array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        // Accessing elements in an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Updating value of element at index 3
        array[3] = 900;

        // Accessing elements in the updated array
        System.out.println("Updated Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
