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
 * Solution #1: Traversing the Array Only Once.
 * This solution is in O(n). Since the list is traversed once only.
 * <p>
 */

public class CheckSecondMaxV2 {

    public static int findSecondMaximum(int[] arr) {
        int firstMax = Integer.MIN_VALUE; // -2147483648
        int secondMax = Integer.MIN_VALUE; // -2147483648

        // Keep track of Maximum value, whenever the value at an array index is greater
        // than current Maximum value then make that max value 2nd max value and make that index value maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        } // End of for-loop

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
