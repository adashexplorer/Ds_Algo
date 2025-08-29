package com.dash.abinash.array.easy;

import com.dash.abinash.linkedlist.nodes.Iterator;

/**
 * Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
 *
 * Examples:
 *
 * Input: arr[] = {1, 4, 3, 2, 6, 5}
 * Output: {5, 6, 2, 3, 4, 1}
 * Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 *
 *
 * Input: arr[] = {4, 5, 1, 2}
 * Output: {2, 1, 5, 4}
 * Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
 */
public class ArrayReverser {

    public static void main(String[] args) {

        Integer[] input = new Integer[] {10, 20, 30, 40, 50, 60};
        ArrayReverser reverser = new ArrayReverser();
        Iterator.iterate(reverser.reverse(input));
    }

    /**
     * Reverses the {@code input} array.
     * @param input
     * @return
     */
    public Integer[] reverse(Integer[] input) {

        if (input == null) return null;
        if (input.length == 0) return null;

        Integer[] output = new Integer[input.length]; // The reversed array length should be same with the input array

        int index = input.length - 1;
        for (int item : input) {
            output[index] = item;
            index --;
        }
        return output;
    }
}


