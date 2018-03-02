package com.biubiu.offer;

import java.util.Arrays;

/**
 * 重建二叉树
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution4 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) return null;
        TreeNode treeNode = new TreeNode(pre[0]);
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                index = i;
                break;
            }
        }
        TreeNode left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));
        TreeNode right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index + 1, in.length));
        treeNode.left = left;
        treeNode.right = right;
        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = new Solution4().reConstructBinaryTree(pre, in);
        System.out.println(treeNode);
    }

}
