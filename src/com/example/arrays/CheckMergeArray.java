package com.example.arrays;

/***
 * Challenge: Merge Two Sorted Arrays
 * <p>
 * Problem Statement: In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2)
 *                    method, which returns an array consisting of all elements of both arrays in a sorted way.
 * <p>
 * Method Prototype: int[] mergeArrays(int[] arr1, int[] arr2);
 * <p>
 * Input: Here arr1 and arr2 are sorted already.
 *        arr1 = {1, 3, 4, 5}
 *        arr2 = {2, 6, 7, 8}
 * <p>
 * Output: arr = {1, 2, 3, 4, 5, 6, 7, 8}
 * <p>
 * Sample Input: arr1 = {1, 12, 14, 17, 23}
 *               arr2 = {11, 19, 27}
 * <p>
 * Sample Output: arr = {1, 11, 12, 14, 17, 19, 23, 27}
 * <p>
 * Time Complexity: The time complexity for this algorithm is O(n+m), where n and m are the sizes of arr1 and arr2, respectively.
 *                  This is because both arrays are iterated over once.
 * <p>
 */

public class CheckMergeArray {

    // Merge arr1 and arr2 into combinedSortedArray
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] combinedSortedArray = new int[arr1Length + arr2Length];
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < arr1Length && j < arr2Length) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise, do same with second array.
            if (arr1[i] < arr2[j])
                combinedSortedArray[k++] = arr1[i++];
            else
                combinedSortedArray[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < arr1Length)
            combinedSortedArray[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < arr2Length)
            combinedSortedArray[k++] = arr2[j++];

        return combinedSortedArray;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 12, 14, 17, 23}; // creating a sorted array called arr1
        int[] arr2 = {11, 19, 27};  // creating a sorted array called arr2

        int[] combinedSortedArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(combinedSortedArray[i] + " ");
        }
    }
}
