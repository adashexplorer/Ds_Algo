package com.dash.abinash.linkedlist;

import com.dash.abinash.linkedlist.boilerplate.GenericLinkedList;
import com.dash.abinash.linkedlist.boilerplate.SpecOpsLinkedList;
import com.dash.abinash.linkedlist.nodes.SinglyNode;

/**
 * A Singly Linked List implementation which contains various functionalities (basic, intermediate & advanced)
 * @author Abinash Dash (adashexplorer)
 * @param <T>
 */
public class SinglyLinkedList<T>
        extends SpecOpsLinkedList<T>
        implements GenericLinkedList<T> {

    SinglyNode<T> head;

    /**
     *
     * @param t
     * @return
     */
    @Override
    public boolean addToFront(T t) {
        return false;
    }

    @Override
    public boolean addToEnd(T t) {

        return false;
    }

    @Override
    public int addAtIndex(int n, T t) {


        SinglyNode<T> node = new SinglyNode<>(t);

        SinglyNode<T> pointer = head;
        int counter = 0;
        while (pointer.next != null) {
            counter ++;
            if (counter == n) {
                node.next = pointer.next;
                pointer.next = node;
            }
        }
        return 0;
    }

    @Override
    public boolean addToMiddle(T t) {
        return false;
    }

    @Override
    public boolean addAfter(T t) {
        return false;
    }

    @Override
    public boolean deleteFromFront() {
        return false;
    }

    @Override
    public boolean deleteFromEnd() {
        return false;
    }

    @Override
    public int deleteFromIndex(int n) {
        return 0;
    }

    @Override
    public boolean deleteFromMiddle() {
        return false;
    }

    @Override
    public boolean deleteAfter(T t) {
        return false;
    }

    @Override
    public boolean clean() {
        return false;
    }

    @Override
    public boolean updateAtFront(T t) {
        return false;
    }

    @Override
    public boolean updateAtEnd(T t) {
        return false;
    }

    @Override
    public int updateAtIndex(int n) {
        return 0;
    }

    @Override
    public boolean updateNodeData(T t) {
        return false;
    }

    @Override
    public void readFromFront() {

        while (head != null) {
            System.out.println(head.t);
            head = head.next;
        }
    }

    @Override
    public int find(T t) {
        return 0;
    }

    @Override
    public int findAt(int n) {
        return 0;
    }

    @Override
    public int findMiddle() {
        return 0;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void reverse() {

    }

    @Override
    public boolean isLoopDetected() {
        return false;
    }

    @Override
    public void removeDuplicates() {

    }

    @Override
    public void sort(boolean order) {

    }

    @Override
    public void compare() {

    }

    @Override
    public boolean addBefore(T t) {
        return false;
    }

    @Override
    public boolean deleteBefore(T t) {
        return false;
    }

    @Override
    public void readFromEnd() {

    }


    /**
     *    UTILITY OPERATIONS
     *        - Get length of the Singly LinkedList
     *        - Check if Singly LinkedList is empty or not
     *        - Reverse the Singly LinkedList
     *        - Detect a loop in Singly LinkedList
     *        - Remove duplicates from a Singly LinkedList
     *        - Sort the Singly LinkedList (Ascending & Descending)
     *        - Compare two Singly LinkedLists
     *        - Convert Singly LinkedList to array
     *        - Merge two Singly LinkedLists
     *        - Clone a Singly LinkedList to another List
     *        - Rotate a Singly LinkedList from left to right OR vice-versa
     */

}
