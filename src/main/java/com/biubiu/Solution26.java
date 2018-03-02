package com.biubiu.offer;

/**
 * 二叉搜索树与双向链表
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution26 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode leftHead = null;
    TreeNode rightHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Convert(pRootOfTree.left);
        if (rightHead == null) {
            rightHead = leftHead = pRootOfTree;
        } else {
            rightHead.right = pRootOfTree;
            pRootOfTree.left = rightHead;
            rightHead = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return leftHead;
    }

}
