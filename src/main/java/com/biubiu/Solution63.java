package com.biubiu.offer;

import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution63 {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, (o1, o2) -> o2 - o1);
    private int count = 0;

    public void Insert(Integer num) {
        if ((count & 1) == 0) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if ((count & 1) == 0) {
            return new Double((minHeap.peek() + maxHeap.peek())) / 2;
        } else {
            return new Double(minHeap.peek());
        }
    }

}
