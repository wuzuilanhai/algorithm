package com.biubiu.offer;

/**
 * 合并两个排序的链表
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution16 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode head=result;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                result.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            result=result.next;
        }
        if (list1 != null) {
            result.next = list1;
        }
        if (list2 != null) {
            result.next = list2;
        }
        return head.next;
    }

}
