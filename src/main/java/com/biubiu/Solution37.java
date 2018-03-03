package com.biubiu;

/**
 * 数字在排序数组中出现的次数
 *
 * @author 张海彪
 * @create 2018-03-04 上午12:28
 */
public class Solution37 {

    public int GetNumberOfK(int[] array, int k) {
        if (array == null) return 0;
        int[] result = new int[10000];
        for (int i = 0; i < array.length; i++) {
            result[array[i]] += 1;
        }
        return result[k];
    }

}
