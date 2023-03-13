package com.example.arrays;

/***
 * Challenge: Rearrange Sorted Array in Max/Min Form.
 * <p>
 * Problem Statement: In this problem, you have to implement the void maxMin(int[] arr) method. This will re-arrange the
 *                    elements of a sorted array in such a way that the first position will have the largest number, the
 *                    second will have the smallest, the third will have the second-largest, and so on.
 *                    Note: The given array is sorted in ascending order.
 *                    Note: The range of integers in the array can be from 0 to 10000.
 * <p>
 * Method Prototype: void reArrange(int[] arr)
 * <p>
 * Input: An array of integers sorted in ascending order.
 * <p>
 * Output: An array in which elements are stored in a max/min form.
 * Sample Input: arr = {1, 2, 3, 4, 5}
 * <p>
 * Sample Output: arr = {5, 1, 4, 2, 3}
 * <p>
 * Time Complexity: The time complexity of this solution is in O(n). The space complexity is constant.
 * <p>
 */

// Solution #2: Using O(1) Extra Space
public class CheckMaxMinV2 {

    public static void maxMin(int[] arr) {
        int maxIdx = arr.length - 1;
        int minIdx = 0;
        int maxElem = arr[maxIdx] + 1; // store any element that is greater than the maximum element in the array
        for (int i = 0; i < arr.length; i++) {
            // at even indices we will store maximum elements
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx -= 1;
            } else { // at odd indices we will store minimum elements
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx += 1;
            }
        }
        // dividing with maxElem to get original values.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        maxMin(arr);

        System.out.print("Array after min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}