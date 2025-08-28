package com.dash.abinash.linkedlist.boilerplate;

/**
 * Interface for LinkedList to hold all generic operations for LinkedList
 * @param <T>
 */
public interface GenericLinkedList<T> {

    /*
     *    CREATE OPERATIONS
     *       - Add node to the front of the Singly LinkedList
     *       - Add node to the end of the Singly LinkedList
     *       - Add node to the nth node (at a specific index) of the Singly LinkedList
     *       - Add node to the middle of the Singly LinkedList
     *       - Add a node after a specific node in a Singly LinkedList
     *       - Add a node before a specific node in a Singly LinkedList (DLL / CDLL only)
     */

    /**
     *
     * @param t
     * @return
     */
    public boolean addToFront(T t);

    /**
     *
     * @param t
     * @return
     */
    public boolean addToEnd(T t);

    /**
     *
     * @param n
     * @return
     */
    public int addAtIndex(int n, T t);

    /**
     *
     * @param t
     * @return
     */
    public boolean addToMiddle(T t);

    /**
     *
     * @param t
     * @return
     */
    public boolean addAfter(T t);



    /*
     *    DELETE OPERATIONS
     *        - Delete node from the start of the Singly LinkedList
     *        - Delete node from the end of the Singly LinkedList
     *        - Delete node from nth node (at a specific index) of the Singly LinkedList
     *        - Delete node from the middle of the Singly LinkedList
     *        - Delete node after a specific node in a Singly LinkedList
     *        - Delete node before a specific node in a Singly LinkedList (DLL / CDLL only)
     *        - Delete entire Singly LinkedList
     */

    /**
     *
     * @return
     */
    public boolean deleteFromFront();

    /**
     *
     * @return
     */
    public boolean deleteFromEnd();

    /**
     *
     * @param n
     * @return
     */
    public int deleteFromIndex(int n);

    /**
     *
     * @return
     */
    public boolean deleteFromMiddle();

    /**
     *
     * @param t
     * @return
     */
    public boolean deleteAfter(T t);


    /**
     *
     * @return
     */
    public boolean clean();

    /**
     *    UPDATE OPERATIONS
     *        - Update node at the front of the Singly LinkedList
     *        - Update node at the end of the Singly LinkedList
     *        - Update node at a specific index
     *        - Update a specific node with a new node
     *
     */

    /**
     *
     * @param t
     * @return
     */
    public boolean updateAtFront(T t);

    /**
     *
     * @param t
     * @return
     */
    public boolean updateAtEnd(T t);

    /**
     *
     * @param n
     * @return
     */
    public int updateAtIndex(int n);

    /**
     *
     * @param t
     * @return
     */
    public boolean updateNodeData(T t);


    /*
     *    READ OPERATIONS
     *        - Traverse all the nodes of the Singly LinkedList from forward direction
     *        - Traverse all the nodes of the Singly LinkedList from backward direction (DLL / CDLL)
     */

    public void readFromFront();


    /*
     *    SEARCH OPERATIONS
     *        - Search en element in a Singly LinkedList
     *        - Search an element in a Singly LinkedList at a specific index / Find nth node from end of a Singly LinkedList
     *        - Find middle node in a Singly LinkedList
     *        - Find index of a specific node in a Singly LinkedList
     */

    /**
     *
     * @param t
     * @return
     */
    public int find(T t);

    /**
     *
     * @param n
     * @return
     */
    public int findAt(int n);

    /**
     *
     * @return
     */
    public int findMiddle();

    /**
     *
     * @param t
     * @return
     */
    public int indexOf(T t);


    /*
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
     *        - Rotate a Singly LinkedList from left to right OR vice versa
     */


    public int size();

    public boolean isEmpty();

    public void reverse();

    public boolean isLoopDetected();

    public void removeDuplicates();

    /**
     *
     * @param order if `true` ascending
     *                  `false` descending
     */
    public void sort(boolean order);

    public void compare();

    /**
     *
     * @param t
     * @return
     */
    public default boolean isNull(T t) {
        return t == null;
    }

    /**
     *
     * @param t
     * @return
     */
    public default boolean isNegative(T t) {
        return (Integer)t < 0;
    }






}
