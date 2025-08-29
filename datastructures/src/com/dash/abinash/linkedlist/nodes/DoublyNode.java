package com.dash.abinash.linkedlist.nodes;

public class DoublyNode<T> {

    public T t;

    public DoublyNode<T> next, prev;

    public DoublyNode (T t) {
        this.t = t;
        next = null;
        prev = null;
    }

}
