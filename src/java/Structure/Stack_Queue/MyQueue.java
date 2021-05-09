package java.Structure.Stack_Queue; /**
 * 用栈实现队列
 * 这个方法直接调用了栈，如果需要不使用栈，可以用LinkedList
 *
 **/

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        in2out();
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        in2out();
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
    /** 这里是关键方法，当出队栈为空时，要把入队栈的所有元素出栈后入栈*/
    private void in2out(){
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
}
