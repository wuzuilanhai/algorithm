package com.biubiu.offer;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return result;
        doFindPath(new ArrayList<>(), root, target);
        return result;
    }

    private void doFindPath(ArrayList<Integer> path, TreeNode node, int target) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            if (node.val == target) {
                ArrayList<Integer> list = new ArrayList<>();
                list.addAll(path);
                list.add(node.val);
                result.add(list);
            }
            return;
        }
        path.add(node.val);
        doFindPath(path, node.left, target - node.val);
        doFindPath(path, node.right, target - node.val);
        path.remove(path.size() - 1);
    }

}
