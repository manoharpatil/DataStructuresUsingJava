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
 * Time Complexity: The time complexity of this problem is O(n) as the array is iterated over once.
 * <p>
 */

// Solution #1: Creating a New Array
public class CheckMaxMinV1 {

    public static void maxMin(int[] arr) {
        // Create a result array to hold re-arranged version of given arr
        int[] result = new int[arr.length];

        int pointerSmall = 0;     // PointerSmall => Start of arr
        int pointerLarge = arr.length - 1;   // PointerLarge => End of arr

        // Flag which will help in switching between two pointers
        boolean switchPointer = true;

        for (int i = 0; i < arr.length; i++) {
            if (switchPointer)
                result[i] = arr[pointerLarge--]; // copy large values
            else
                result[i] = arr[pointerSmall++]; // copy small values

            switchPointer = !switchPointer;   // switching between small and large
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = result[j];    // copying to original array
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
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
