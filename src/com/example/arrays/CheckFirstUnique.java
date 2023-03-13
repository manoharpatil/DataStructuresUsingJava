package com.example.arrays;

/***
 * Challenge: First Non-Repeating Integer in an Array.
 * <p>
 * Problem Statement: Given an array, find the first integer, which is unique in the array. Unique means the number does
 *                    not repeat and appears only once in the whole array. In this problem, you have to implement the
 *                    int findFirstUnique(int[] arr) method that will look for a first unique integer, which appears
 *                    only once in the whole array. The function returns -1 if no unique number is found.
 * <p>
 * Method Prototype: int findFirstUnique(int[] arr)
 * <p>
 * Input: An array of integers. This array can be of any (valid) size.
 * <p>
 * Output: The first unique element in the array.
 * Sample Input: arr = {9, 2, 3, 2, 6, 6}
 * <p>
 * Sample Output: 9
 * <p>
 * Time Complexity: The time complexity of this solution is O(n^2) since the entire list is iterated for each element → n×n.
 * <p>
 */

public class CheckFirstUnique {

    // Returns first unique integer from array
    public static int findFirstUnique(int[] arr) {
        boolean isRepated = false;

        // Inside Inner Loop Check Each index of outerLoop If it's repeated in array
        // If it's not repeated then return this as first unique Integer
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    isRepated = true;
                    break;
                }
            } // End of inner for

            if (isRepated == false) {
                return arr[i];
            } else {
                isRepated = false;
            }
        } // End of outer for
        return -1;
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

        int[] arr = {2, 54, 7, 2, 6, 54};

        System.out.println("Array: " + arrayToString(arr));

        int unique = findFirstUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }
}
