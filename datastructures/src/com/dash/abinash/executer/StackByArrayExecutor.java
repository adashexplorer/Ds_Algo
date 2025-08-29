package com.dash.abinash.executer;

import com.dash.abinash.stack.StackByArrayBuilderWithUpwardGrow;

public class StackByArrayExecutor {

    public static void main(String[] args) throws Exception{
        StackByArrayBuilderWithUpwardGrow builder = new StackByArrayBuilderWithUpwardGrow(5);
        builder.push(10);
        builder.push(20);
        builder.push(30);
        builder.push(40);
        builder.push(50);

        System.out.println(builder.peek());

        System.out.println(builder.peek());

        System.out.println(builder.pop());

        System.out.println(builder.peek());

        builder.push(60);

        System.out.println(builder.peek());



    }
}
