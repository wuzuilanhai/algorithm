package com.biubiu.offer;

/**
 * 二叉搜索树的后序遍历序列
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution23 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int start, int end) {
        if (start >= end) return true;
        int i = end;
        while (i > start && sequence[i - 1] > sequence[end]) i--;
        for (int j = start; j < i; j++) {
            if (sequence[j] > sequence[end]) return false;
        }
        return judge(sequence, start, i - 1) && judge(sequence, i, end - 1);
    }

}
