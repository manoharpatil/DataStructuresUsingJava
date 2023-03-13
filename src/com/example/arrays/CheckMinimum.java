package com.example.arrays;

/***
 * Challenge: Find Minimum Value in Array.
 * <p>
 * Problem Statement: In this problem, you have to implement the int findMinimum(int[] arr) method, which will traverse
 *                    the whole array and find the smallest number in the array.
 * <p>
 * Method Prototype: int findMinimum(int[] arr)
 * <p>
 * Input: An array of integers. This array can be of any (valid) size.
 * <p>
 * Output: The smallest number in the array.
 * Sample Input: arr = {9, 2, 3, 6}
 * <p>
 * Sample Output: 2
 * <p>
 * Time Complexity: Since the entire list is iterated over once, this algorithm is in linear time, O(n).
 * <p>
 */

public class CheckMinimum {

    // Returns minimum value from given Array
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];

        // At every Index compare its value with minimum and if it's less than make that index value new minimum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[1];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};

        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int min = findMinimum(arr);
        System.out.println("Minimum in the Array: " + min);
    }
}
