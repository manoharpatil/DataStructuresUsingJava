package com.example.arrays;

/***
 * Challenge: Remove Even Integers from an Array
 * <p>
 * Problem Statement: In this problem, you have to implement the int [] removeEven(int[] arr) method, which removes
 *                    all the even elements from the array and returns updated array.
 * <p>
 * Method Prototype: int[] removeEven(int[] arr);
 * <p>
 * Input: An array with integers.
 * <p>
 * Output: An array with only odd integers.
 * <p>
 * Sample Input: arr = {1, 2, 4, 5, 10, 6, 3}
 * <p>
 * Sample Output: arr = {1, 5, 3}
 * <p>
 * Time Complexity: Since the entire array has to be iterated over, this solution is in O(n).
 *
 */

public class CheckRemoveEven {
    public static int[] removeEven(int[] arr) {
        int oddElements = 0;

        // Find number of odd elements in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                oddElements++;
        }

        // Create result array with the size equal to the number of odd elements in arr
        int[] oddArray = new int[oddElements];
        int oddArrayIndex = 0;

        // Put odd values from arr to the resulted array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[oddArrayIndex++] = arr[i];
            }
        } // End of for loop

        return oddArray;
    } // End of removeEven

    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size]; // Declaration and instantiation

        System.out.print("Before removing Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // Assigning values
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] newArr = removeEven(arr); // Calling removeEven

        System.out.print("After removing Even Numbers: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " "); // Printing array
        }
    }
}
