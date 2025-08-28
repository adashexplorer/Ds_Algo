package com.dash.abinash.executer;

import com.dash.abinash.linkedlist.SinglyLinkedList;

/**
 *
 */
public class SinglyLinkedListExecutor {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        boolean isSuccess = singlyLinkedList.addToFront(20);
        System.out.printf("Is addition of first node successful ? %s ", isSuccess);

        singlyLinkedList.addToFront(30);
        singlyLinkedList.addToFront(40);
        singlyLinkedList.addToFront(50);
        singlyLinkedList.addToFront(60);

        singlyLinkedList.addToEnd(70);

        singlyLinkedList.readFromFront();
    }
}
