package com.biubiu.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 滑动窗口的最大值
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution64 {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0) return result;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(0);
        if (size == 1) {
            result.add(num[deque.getFirst()]);
        }
        for (int i = 1; i < num.length; i++) {
            if (i - size >= deque.getFirst()) {
                deque.poll();
            }
            while (deque.size() > 0 && num[i] > num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.add(i);
            if (i >= size - 1) {
                result.add(num[deque.getFirst()]);
            }
        }
        return result;
    }

}
