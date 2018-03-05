package com.biubiu.offer;

/**
 * 对称的二叉树
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution58 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        return judge(pRoot, pRoot);
    }

    private boolean judge(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        return judge(node1.left, node2.right) && judge(node1.right, node2.left);
    }

}
