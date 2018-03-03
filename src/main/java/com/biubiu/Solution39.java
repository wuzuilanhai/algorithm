package com.biubiu;

/**
 * 平衡二叉树
 *
 * @author 张海彪
 * @create 2018-03-04 上午12:52
 */
public class Solution39 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        getTreeDepth(root);
        return isBalanced;
    }

    private int getTreeDepth(TreeNode node) {
        if (node == null) return 0;
        int left = getTreeDepth(node.left);
        int right = getTreeDepth(node.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return left > right ? left + 1 : right + 1;
    }

}
