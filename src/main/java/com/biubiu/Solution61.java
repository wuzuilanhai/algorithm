package com.biubiu.offer;

/**
 * 序列化二叉树
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution61 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        //前序遍历
        sb.append(root.val).append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    //0,1,3,#,#,#,2,4,5,#,#,#,#,
    int index = -1;

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
        String[] strings = str.split(",");
        index++;
        TreeNode node = null;
        if (!strings[index].equals("#")) {
            node = new TreeNode(Integer.parseInt(strings[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode3;
        TreeNode treeNode4 = new TreeNode(4);
        treeNode2.left = treeNode4;
        TreeNode treeNode5 = new TreeNode(5);
        treeNode4.left = treeNode5;
        System.out.println(new Solution61().Serialize(treeNode));
    }

}
