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
 * Sample Input: arr = {1, 2, 3, 4, 5}
 *               value = 9
 * <p>
 * Sample Output: arr = {4, 5}
 * <p>
 * Time Complexity: Since the sorting function used in this code takes O(nlogn) and the algorithm to find two numbers
 * takes O(n) time, the overall time complexity of this code is O(nlogn).
 * <p>
 */

/***
 * This code solves the problem of finding a pair of numbers in an integer array whose sum equals a given integer n.
 * <p>
 * Let's go step by step:
 * <p>
 * 1. The program defines a class called CheckSum that contains three methods: partition, sort, and findSum.
 * 2. The partition method is a helper function that takes an array, a low index, and a high index, and returns an index
 *    that divides the array into two parts. The elements in the left part are smaller than the pivot element
 *    (the element at the high index), and the elements in the right part are greater than the pivot element. It uses the
 *    Quick Sort algorithm to perform the partitioning.
 * 3. The sort method takes an array, a low index, and a high index, and uses the partition method to sort the array in
 *    ascending order.
 * 4. The findSum method takes an array and a target sum, and returns an array containing two elements from the input
 *    array that add up to the target sum. It first sorts the input array using the sort method. Then, it initializes
 *    two pointers, Pointer1 and Pointer2, to the beginning and end of the array, respectively. It calculates the sum of
 *    the elements pointed to by Pointer1 and Pointer2. If the sum is less than the target sum, it increments Pointer1
 *    to move it to the right. If the sum is greater than the target sum, it decrements Pointer2 to move it to the left.
 *    If the sum is equal to the target sum, it stores the two elements in an array and returns it.
 * 5. The main method creates an array of integers called arr1 and a target sum called n. It calls the findSum method
 *    with arr1 and n, and stores the result in arr2. It then prints out the two numbers that add up to the target sum,
 *    along with the sum itself. If there are no two numbers that add up to the target sum, it prints "Not Found".
 * <p>
 * Example:
 * Suppose we have an array arr1 of integers, and we want to find a pair of numbers in arr1 whose sum is equal to 9.
 * Then, we can call the findSum method with arguments arr1 and 9. The findSum method will return an array result which
 * contains the pair of numbers whose sum is equal to 9. Finally, we can extract the values of the pair of numbers from result and print them.
 *
 */

public class CheckSumV2 {

    // Helper Function to sort given Array (Quick Sort)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is <= to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Return 2 elements of arr that sum to the given value
    public static int[] findSum(int[] arr, int n) {
        // Helper sort function that uses the Quicksort Algorithm
        sort(arr, 0, arr.length - 1);   // Sort the array in Ascending Order

        int Pointer1 = 0;    // Pointer 1 -> At Start
        int Pointer2 = arr.length - 1;   // Pointer 2 -> At End

        int[] result = new int[2];
        int sum = 0;

        while (Pointer1 != Pointer2) {

            sum = arr[Pointer1] + arr[Pointer2];  // Calculate Sum of Pointer 1 and 2

            if (sum < n)
                Pointer1++;  // if sum is less than given value => Move Pointer 1 to Right
            else if (sum > n)
                Pointer2--;
            else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result; // containing 2 number
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int n = 9;
        int[] arr1 = {1, 2, 3, 4, 5};
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
