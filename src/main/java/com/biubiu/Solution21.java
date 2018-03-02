package com.biubiu.offer;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution21 {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && popA[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }

}
