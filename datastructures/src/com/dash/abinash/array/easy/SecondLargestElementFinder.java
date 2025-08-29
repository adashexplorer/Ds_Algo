package com.dash.abinash.array.easy;

/**
 *  Given an array of positive and negative integers, the task is to find the second-largest element in the array.
 *  Note - If the second-largest element does not exist, then return -1
 *
 *  Input arr = {12, 35, 1, 10, 34, 1}
 *  Output 34
 *
 *  Input arr = {10, 5, 10}
 *  Output 5
 *
 *  Input arr = {10, 10, 10}
 *  Output -1
 */
public class SecondLargestElementFinder {

    public static void main(String[] args) {
        SecondLargestElementFinder finder = new SecondLargestElementFinder();
        int[] input = new int[] {10, 5, 10};
        int secondLargest = finder.findSecondLargest(input);
        System.out.println(secondLargest);
    }

    public int findSecondLargest(int[] input) {
        if (input == null) return -1;
        if (input.length == 0) return -1;


        int largest = 0;
        int secondLargest = 0;

        // TODO Implement the logic to find the second largest element in the array

        return secondLargest;
    }
}
