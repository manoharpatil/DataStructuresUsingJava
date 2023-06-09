package com.example.arrays;

/***
 * Challenge: Right Rotate the Array by One Index.
 * <p>
 * Problem Statement: In this problem, you have to implement the void rotateArray(int[] arr) method, which takes an arr
 *                    and rotate it right by 1. This means that the right-most elements will appear at the left-most
 *                    position in the array.
 * <p>
 * Method Prototype: void rotateArray(int[] arr)
 * <p>
 * Input: An array of integers.
 * <p>
 * Output: Array rotated by one element from right to left.
 * Sample Input: arr = {1, 2, 3, 4, 5}
 * <p>
 * Sample Output: arr = {5, 1, 2, 3, 4}
 * <p>
 * Time Complexity: Since the entire array is iterated over once, the time complexity of this solution is O(n).
 * <p>
 */

public class CheckRotateArray {

    //Rotates given Array by 1 position
    public static void rotateArray(int[] arr) {

        // Store last element of Array.
        // Start from the Second last and Right Shift the Array by one.
        // Store the last element saved on the first index of the Array.
        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 8, 4, 2};

        System.out.print("Array before rotation: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        rotateArray(arr);

        System.out.print("Array after rotation: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
