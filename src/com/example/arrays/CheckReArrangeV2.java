package com.example.arrays;

/***
 * Challenge: Right Rotate the Array by One Index.
 * <p>
 * Problem Statement: In this problem, you have to implement the void reArrange(int[] arr) method, which will sort the
 *                    elements, such that all the negative elements appear at the left and positive elements appear at
 *                    the right.
 *                    Note: Consider 0 as a positive number.
 * <p>
 * Method Prototype: void reArrange(int[] arr)
 * <p>
 * Input: An array of integers.
 * <p>
 * Output: A sorted array with negative elements at the left and positive elements at the right.
 * Sample Input: arr = {10, -1, 20, 4, 5, -9, -6}
 * <p>
 * Sample Output: arr = {-1, -9, -6, 10, 20, 4, 5}
 * <p>
 * Note: Order of the numbers doesn’t matter.
 *       {-1, -9, -6, 10, 20, 4, 5} = {-9, -1, -6, 10, 4, 20, 5}
 * <p>
 * Time Complexity: The time complexity of this algorithm is O(n), with no extra space used as the entire array is
 *                  iterated over once.
 * <p>
 */

// Solution# 1: Re-arranging in Place
public class CheckReArrangeV2 {

    // Re-Arrange Positive and Negative Values of Given Array
    public static void reArrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {   // if negative number found
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j]; // swapping with leftmost positive
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2, -4, 6, 8, -5, 10};

        System.out.print("Array before re-arranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        reArrange(arr);

        System.out.print("Array after rearranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
