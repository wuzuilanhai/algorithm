package com.biubiu.offer;

/**
 * 二叉树的下一个结点
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution57 {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        } else if (pNode.next != null && pNode.next.right == pNode) {
            while (pNode.next != null && pNode.next.left != pNode) {
                pNode = pNode.next;
            }
            return pNode.next;
        } else {
            return pNode.next;
        }
    }

}
