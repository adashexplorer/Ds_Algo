package com.dash.abinash.linkedlist.boilerplate;

/**
 *
 */
public abstract class SpecOpsLinkedList<T> {

    /**
     *
     * @param t
     * @return
     */
    public abstract boolean addBefore(T t);

    /**
     *
     * @param t
     * @return
     */
    public abstract boolean deleteBefore(T t);

    /**
     *
     */
    public abstract void readFromEnd();
}
