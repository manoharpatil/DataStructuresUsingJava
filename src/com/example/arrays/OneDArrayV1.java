package com.example.arrays;

/**
 * One-Dimensional Array:
 * The basic syntax for declaring and initializing the one-dimensional array is given below.
 */

public class OneDArrayV1 {

    public static void main(String[] args) {
        // Array Declaration:
        // In the array declaration, reference of an array is created. To declare an array, you have to specify the data type and name of the array.
        int[] array;

        // Array Initialization:
        // Array initialization actually gives memory to the elements of an array. The basic syntax for initializing an array is given below.
        array = new int[4];

        // Accessing elements in an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
