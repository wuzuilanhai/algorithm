package com.biubiu.offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * 包含min函数的栈
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution20 {

    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        Integer min = stack.peek();
        if (min == null) return 0;
        int temp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

}
