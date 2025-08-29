package com.dash.abinash.array.easy;

/**
 *  Question -
 *     Given an arr[], the task is to print every alternate element of the array starting from the first element.
 *
 *     Example -
 *       input arr[] = {10, 20, 30, 40, 50, 60}
 *       output arr[] = {10,30,50}
 *
 *       input arr[] = {-5, 1, 4, 2, 12}
 *       output arr[] = {-5, 4, 12}
 */
public class AlternateArrayElementFinder {

    int[] alternateArray;
    public static void main(String[] args) {
        int[] arr = null;
        AlternateArrayElementFinder finder = new AlternateArrayElementFinder();
        finder.findAlternateElements(arr);
    }

    /**
     * Finds alternate elements in the array.
     * @param arr
     */
    public int[] findAlternateElements(int[] arr) {

        if (arr == null) return null;
        if (arr.length == 0) return null;

        for (int i=0;i<arr.length;i=i+2) {
            System.out.print(arr[i] + "\t");
        }

        return alternateArray;
    }
}
