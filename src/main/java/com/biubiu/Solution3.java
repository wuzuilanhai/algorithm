package com.biubiu.offer;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution3 {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

}
