package com.example.arrays;

/***
 * Challenge: Find Second Maximum Value in an Array.
 * <p>
 * Problem Statement: In this problem, you have to implement the int findSecondMaximum(int[] arr) method, which will
 *                    traverse the whole array and return the second-largest element present in the array.
 *                    Assumption: Array should contain at least two unique elements.
 * <p>
 * Method Prototype: int findSecondMaximum(int[] arr)
 * <p>
 * Input: An array of integers with at least two unique elements.
 * <p>
 * Output: Second-largest element present in the array.
 * Sample Input: arr = {9,2,3,6}
 * <p>
 * Sample Output: 6
 * <p>
 * Time Complexity:
 * Solution #1: Traversing the Array Twice.
 * The time complexity of the solution is in O(n) since the array is traversed twice but in separate loops.
 * Which means O(n+n) ⇒ O(n).
 * <p>
 */

public class CheckSecondMaxV1 {

    public static int findSecondMaximum(int[] arr) {
        int firstMax = Integer.MIN_VALUE; // -2147483648
        int secondMax = Integer.MIN_VALUE; // -2147483648

        // Find the maximum value in the array by comparing each index with max
        // If an element is greater than max then update max to be equal to it
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax)
                firstMax = arr[i];
        }

        // Find the second maximum value by comparing each index with secondMax
        // If an element is greater than secondMax and not equal to previously
        // calculated firstMax, then update secondMax to be equal to that element.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < firstMax)
                secondMax = arr[i];
        }

        return secondMax;
    }

    public static String arrayToString(int[] arr) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2, -33, -10, -456};

        System.out.println("Array: " + arrayToString(arr));

        int secondMax = findSecondMaximum(arr);

        System.out.println("Second maximum: " + secondMax);
    }
}
