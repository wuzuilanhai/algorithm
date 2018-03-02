package com.biubiu.offer;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution5 {

    Stack<Integer> stack1 = new Stack<>();

    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

}
