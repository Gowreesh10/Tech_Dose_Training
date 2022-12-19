package Stacks_and_Queue;

import java.util.*;

public class Stack_using_queue {
    Queue<Integer> q;
    public void MyStack() {
        q=new LinkedList<Integer>();
    }

    public void push(int x) {
        int s=q.size();
        q.add(x);
        for(int i=0;i<s;i++)
            q.add(q.remove());
    }

    public int pop() {
        if(q.isEmpty()) return -1;
        return q.remove();
    }

    public int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();

    }
}
