package com.biubiu.offer;

/**
 * 删除链表中重复的结点
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution56 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;
        ListNode p = pHead;
        ListNode q = pHead;
        int i = 0;
        int count = 0;
        int common = 0;
        while (p != null) {
            count++;
            if (p.next != null && p.val == p.next.val) {
                common++;
                p = p.next;
                while (p != null && p.next != null) {
                    if (p.val == p.next.val) {
                        p = p.next;
                    } else {
                        break;
                    }
                }
                q.next = p.next;
                p = p.next;
            } else {
                if (i == 0) {
                    pHead = p;
                    i++;
                }
                q = p;
                p = p.next;
            }
        }
        if (common == count) return null;
        return pHead;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        a1.next = a2;
        ListNode a3 = new ListNode(1);
        a2.next = a3;
        ListNode a4 = new ListNode(1);
        a3.next = a4;
        ListNode a5 = new ListNode(1);
        a4.next = a5;
        ListNode a6 = new ListNode(1);
        a5.next = a6;
        ListNode a7 = new ListNode(1);
        a6.next = a7;
        new Solution56().deleteDuplication(a1);
    }

}
