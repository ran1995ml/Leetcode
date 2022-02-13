package com.ran.stack;

import java.util.Stack;

/**
 * ClassName: MinStack_155
 * Description:
 * date: 2022/2/13 20:33
 *
 * @author ran
 */
public class MinStack_155 {
    Stack<Integer> stack;
    Stack<Integer> stackMin;

    public MinStack_155() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(stackMin.isEmpty()){
            stackMin.push(val);
        }else {
            stackMin.push(Math.min(val,stackMin.peek()));
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
