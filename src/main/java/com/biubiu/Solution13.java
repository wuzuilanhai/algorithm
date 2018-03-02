package com.biubiu.offer;

/**
 * 调整数组顺序使奇数位于偶数前面
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution13 {

    public void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                int temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] % 2 == 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }
        }
    }

}
