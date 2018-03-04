package com.biubiu;

/**
 * 构建乘积数组
 *
 * @author 张海彪
 * @create 2018-03-04 下午9:37
 */
public class Solution51 {

    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) return null;
        int len = A.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = right[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * A[i - 1];
            right[i] = right[i - 1] * A[len - i];
        }
        int[] B = new int[A.length];
        for (int i = 0; i < len; i++) B[i] = left[i] * right[len - i - 1];
        return B;
    }

}
