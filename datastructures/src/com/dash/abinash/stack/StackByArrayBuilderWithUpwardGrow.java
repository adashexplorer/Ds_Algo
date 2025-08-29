package com.dash.abinash.stack;

import com.dash.abinash.stack.boilerplate.StackOps;

public class StackByArrayBuilderWithUpwardGrow implements StackOps {

    private static int pushIndex;
    private static int popIndex;

    private Object[] stack;

    public StackByArrayBuilderWithUpwardGrow(int size) {
        stack = new Object[size];
        pushIndex = size - 1;
        popIndex = 0;
    }

    /**
     *
     * @param data
     * @return
     */
    @Override
    public Object push(Object data) throws Exception {

        return data;
    }

    /**
     *
     * @return
     */
    @Override
    public Object pop() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Object peek() {
        return stack.length == 0 ? null : stack[popIndex];
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int search(Object data) {
        return 0;
    }
}
