package com.biubiu.offer;

/**
 * 链表中环的入口结点
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution55 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) return null;
        ListNode p = pHead;
        ListNode q = pHead;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                q = pHead;
                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                if (p == q) return p;
            }
        }
        return null;
    }

}
