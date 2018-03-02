package com.biubiu.offer;

/**
 * 反转链表
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution15 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p, q, temp;
        p = head;
        q = head.next;
        p.next = null;
        while (q != null) {
            temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        return p;
    }

}
