package com.example.arrays;

/**
 * One-Dimensional Array:
 * Adding Elements using Array Literal
 * If the size and the values of an array are known in advance, we can use the array literal for adding elements in an array.
 */

public class OneDArrayV4 {

    public static void main(String[] args) {

        // Initialization, Declaration and Adding Elements in one step
        int array[] = {10, 20, 30, 40};

        // Accessing elements in an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Updating value of element at index 3
        array[3] = 900;
        System.out.println("Updated Array: ");

        // Accessing elements in the updated array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
