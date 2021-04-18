package com.java.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. 这里是关键操作，入队元素先入队，再让除他以外的元素出队再入队*/
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size>1){
            queue.add(queue.poll());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue.element();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
