package com.example.arrays;

import java.util.Arrays;

/***
 * Challenge: Find the Sum of Maximum Sum Subarray.
 * <p>
 * Problem Statement: Given an array, find the sum of contiguous subarray with the largest sum. Given an integer array,
 *                    return the maximum subarray sum. The array may contain both positive and negative integers and is
 *                    unsorted.
 * Maximum Sum Subarray: Given an unsorted array A, the maximum sum sub-array is the sub-array (contiguous elements) from
 *                       A for which the sum of the elements is maximum. In this challenge, we want to find the sum of
 *                       the maximum sum sub-array. This problem is a tricky one because the array might have negative
 *                       integers in any position, so we have to cater to those negative integers while choosing the
 *                       contiguous subarray with the largest positive values.
 * <p>
 * Method Prototype: int findMaxSumSubArray(int[] arr)
 * <p>
 * Input: An array of integers contains both positive and negative integers and is unsorted.
 * <p>
 * Output: An integer value equal to the maximum sum of subarray found in arr.
 * Sample Input: arr = {1, 7, -2, -5, 10, -1}
 * <p>
 * Sample Output: 11
 * <p>
 * Time Complexity: The runtime complexity of this solution is linear, O(n).
 * <p>
 * Space complexity: The space complexity of this solution is constant, O(1).
 */

// Solution: Kadane’s Algorithm
public class FindMax {
    public static int findMaxSumSubArray(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];
        int lengtharray = arr.length;
        for (int i = 1; i < lengtharray; i++) {
            if (currMax < 0) {
                currMax = arr[i];
            } else {
                currMax += arr[i];
            }

            if (globalMax < currMax) {
                globalMax = currMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, -2, -5, 10, -1};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Sum: " + findMaxSumSubArray(arr1));
    }
}