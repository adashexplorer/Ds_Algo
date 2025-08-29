package com.dash.abinash.linkedlist;

import com.dash.abinash.linkedlist.boilerplate.GenericLinkedList;
import com.dash.abinash.linkedlist.boilerplate.SpecOpsLinkedList;
import com.dash.abinash.linkedlist.nodes.DoublyNode;

public class DoublyLinkedList<T>
 extends SpecOpsLinkedList<T> implements GenericLinkedList<T> {

    DoublyNode<T> head;


    /**
     * Adds an element to the front of DoublyLinkedList
     * @param  t The element that needs to be added
     * @return {true} if successfully added
     *         {false} otherwise
     */
    @Override
    public boolean addToFront(T t) {

        if (isNull(t)) return false;

        DoublyNode<T> node = new DoublyNode<>(t);

        if (head == null) {
            head = node;
            return true;
        }

        head.prev = node;
        node.next = head;
        head = node;

        return true;
    }

    /**
     * Adds an element to the end of DoublyLinkedList
     * @param  t The element that needs to be added
     * @return {true} if successfully added
     *         {false} otherwise
     * Time Complexity - O(n) as traversing till end
     */
    @Override
    public boolean addToEnd(T t) {

        if (isNull(t)) return false;

        DoublyNode<T> node = new DoublyNode<>(t);

        if (head == null) {
            head = node;
            return true;
        }

        DoublyNode<T> pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = node;
        node.prev = pointer;

        return true;
    }

    /**
     * Adds an element at a specific index of DoublyLinkedList
     * @param  n The index position where the element needs to be added
     * @param  t The element that needs to be added
     * @return 1 if successfully added
     *         -1 otherwise
     */
    @Override
    public int addAtIndex(int n, T t) {

        if (t == null || n < 0) return -1;

        DoublyNode<T> node = new DoublyNode<>(t);

        if (head == null) {
            head = node;
            return 1;
        }

        DoublyNode<T> pointer = head;
        int counter = 0;
        while (counter < n-1) {
            pointer = pointer.next;
            counter ++;
        }

        node.next = pointer.next;
        pointer.next = node;
        node.prev = pointer;

        return 1;
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
            System.out.println("Data :" + head.t);
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
}
