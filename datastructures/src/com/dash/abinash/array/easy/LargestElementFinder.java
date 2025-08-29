package com.dash.abinash.array.easy;

/**
 *  Given an array arr. The task is to find the largest element in the array.
 *
 *  Examples -
 *     Input arr[] = {10, 20, 4}
 *     Output 20
 *
 *     Input arr[] = {20, 10, 20, 4, 100}
 *     Output 100
 */
public class LargestElementFinder {

    public static void main(String[] args) {
        Integer[] input = new Integer[] {10, -20, 4};

        LargestElementFinder finder = new LargestElementFinder();
        System.out.printf("Largest element in the array is: %d%n", finder.findLargestElement(input));
    }

    /**
     * Finds the largest element in the {@code input} array.
     * @param input
     * @return largestElement
     */
    public Integer findLargestElement(Integer[] input) {
        Integer largestElement = 0;

        for (Integer item : input) {
            if (item > largestElement) {
                largestElement = item;
            }
        }
        return largestElement;
    }
}
