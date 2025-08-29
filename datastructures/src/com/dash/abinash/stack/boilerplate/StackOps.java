package com.dash.abinash.stack.boilerplate;

/**
 *  Stack common operations
 */
public interface StackOps {

    /**
     *
     * @param data
     * @return
     */
    public Object push(Object data) throws Exception;

    /**
     *
     * @return
     */
    public Object pop();

    /**
     *
     * @return
     */
    public Object peek();

    /**
     *
     * @return
     */
    public boolean empty();

    /**
     *
     * @param data
     * @return
     */
    public int search(Object data);


}
