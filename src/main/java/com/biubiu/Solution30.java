package com.biubiu.offer;

/**
 * 连续子数组的最大和
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution30 {

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) return 0;
        int max = array[0];
        int total = array[0];
        for (int i = 1; i < array.length; i++) {
            if (total > 0) {
                total += array[i];
            } else {
                total = array[i];
            }
            if (total > max) {
                max = total;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution30().FindGreatestSumOfSubArray(new int[]{6, -3, -2, 7, -15, 1, 2, 2}));
    }

}
