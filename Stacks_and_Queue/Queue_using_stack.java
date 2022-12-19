package Stacks_and_Queue;

import java.util.Stack;

public class Queue_using_stack {
    Stack<Integer> stack1,stack2;
    public void MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if(stack2.empty())
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
