package com.example.arrays;

/***
 * Challenge: Find Two Numbers that Add up to "n".
 * <p>
 * Problem Statement: In this problem, you have to implement the int[] findSum(int[] arr, int n) method, which will take
 *                    a number n, and an array arr as input and returns an array of two integers that add up to n in an
 *                    array. You are required to return only one such pair. If no such pair is found then simply return the array.
 * <p>
 * Method Prototype: int[] findSum(int[] arr, int n)
 * <p>
 * Sample Input: arr = {1, 21, 3, 14, 5, 60, 7, 6}
 *               value = 27
 * <p>
 * Sample Output: arr = {21, 6} or {6, 21}
 * <p>
 * Time Complexity: Since we iterate over the entire array in a nested loop, the time complexity is O(n^2).
 * <p>
 */

/***
 * This code solves the problem of finding a pair of numbers in an integer array whose sum equals a given integer n.
 * <p>
 * Let's go step by step:
 * <p>
 * 1. Define a class named CheckSum.
 * 2. Inside the class, define a static method findSum that takes two arguments: an integer array arr and an integer n.
 *    This method will return an integer array of size 2 which will contain the pair of numbers whose sum is equal to n.
 * 3. Inside findSum, declare an integer array named result of size 2. This array will store the pair of numbers whose
 *    sum is equal to n.
 * 4. Use a nested loop to traverse the array arr. In the outer loop, iterate through the array from index 0 to
 *    arr.length-1. In the inner loop, iterate through the array from index i+1 to arr.length-1. This will ensure that we
 *    don't check the sum of an element with itself or repeat pairs that have already been checked.
 * 5. Check if the sum of arr[i] and arr[j] is equal to the given integer n. If yes, store the values of arr[i] and
 *    arr[j] in result and return result.
 * 6. If no pair of numbers are found whose sum is equal to n, return the original array arr.
 * 7. Outside the findSum method, define the main method.
 * 8. Inside main, declare an integer n and an integer array arr1.
 * 9. Check if the length of arr1 is greater than 0. If not, print "Input Array is Empty!" and exit the program.
 * 10. If arr1 is not empty, call the findSum method with arr1 and n as arguments, and store the returned array in a new array arr2.
 * 11. Extract the values of the pair of numbers from arr2 and store them in variables num1 and num2.
 * 12. Check if the sum of num1 and num2 is equal to n. If not, print "Not Found" and exit the program.
 * 13. If the sum of num1 and num2 is equal to n, print the values of num1 and num2, and the value of n itself.
 * <p>
 * Example:
 * Suppose we have an array arr1 of integers, and we want to find a pair of numbers in arr1 whose sum is equal to 9.
 * Then, we can call the findSum method with arguments arr1 and 9. The findSum method will return an array result which
 * contains the pair of numbers whose sum is equal to 9. Finally, we can extract the values of the pair of numbers from result and print them.
 *
 */

public class CheckSumV1 {
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2]; // to store the pair of values.

        for (int i = 0; i < arr.length; i++) { // traverse arr
            for (int j = i + 1; j < arr.length; j++) { // traverse arr again
                if (arr[i] + arr[j] == n) { // find where sum is equal to n
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        if (arr1.length > 0) {
            int[] arr2 = findSum(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];

            if ((num1 + num2) != n)
                System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " + (n));

            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}
