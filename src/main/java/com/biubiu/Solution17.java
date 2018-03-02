package com.biubiu.offer;

/**
 * 二叉树的镜像
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution17 {

    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return isSubTree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean isSubTree(TreeNode a, TreeNode b) {
        if (a == null && b != null) return false;
        if (b == null) return true;
        if (a.val == b.val) {
            return isSubTree(a.left, b.left) && isSubTree(a.right, b.right);
        } else {
            return false;
        }
    }

}
