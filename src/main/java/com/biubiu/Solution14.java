package com.biubiu.offer;

/**
 * 链表中倒数第k个结点
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k) q = q.next;
            p = p.next;
        }
        return i < k ? null : q;
    }

}
