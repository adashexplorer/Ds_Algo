package com.dash.abinash.linkedlist.nodes;

/**
 * A Singly Linked List node
 */
public class SinglyNode<T> {

    // SinglyNode data
    public T t;

    // Address of the next node
    public SinglyNode<T> next;

    /*
       SinglyNode constructor contains following
          - Node data (Primitive or Wrapper)
          - Address of the next node. For an individual isolated node, the address to the next node
            is always `Null` until the link is established to another node.
     */
    public SinglyNode(T t) {
        this.t = t;
        next = null;
    }
}
