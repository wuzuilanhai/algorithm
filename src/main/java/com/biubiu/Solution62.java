package com.biubiu.offer;

/**
 * 二叉搜索树的第k个结点
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution62 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int count = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return null;
        //在左子树
        TreeNode left = KthNode(pRoot.left, k);
        if (left != null) return left;
        count++;
        //在根节点
        if (count == k) return pRoot;
        //在右子树
        return KthNode(pRoot.right, k);
    }

}
