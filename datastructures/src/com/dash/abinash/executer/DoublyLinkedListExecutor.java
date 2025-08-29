package com.dash.abinash.executer;

import com.dash.abinash.linkedlist.DoublyLinkedList;

public class DoublyLinkedListExecutor {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        /**
         *   10 - 20 - 30 - 40 - 50
         */
        list.addToFront(50);
        list.addToFront(40);
        list.addToFront(30);
        list.addToFront(20);
        list.addToFront(10);

        /**
         *    0 -> 1 -> 2 -> 3 -> 4 -> 5
         *   10 - 20 - 30 - 40 - 50 - 60
         */
        list.addToEnd(60);

        /**
         *  0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
         *  10 - 20 - 15 - 30 - 40 - 50 - 60
         */
        list.addAtIndex(2, 15);

        list.readFromFront();
    }
}
