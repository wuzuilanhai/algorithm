package com.biubiu.offer;

/**
 * 旋转数组的最小数字
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution6 {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        for (int i = 1, j = array.length - 2; i <= j; ) {
            if (array[i] >= array[i - 1]) {
                i++;
            } else if (array[i] < array[i - 1]) {
                return array[i];
            }
            if (array[j] <= array[j + 1]) {
                j--;
            } else if (array[j] > array[j + 1]) {
                return array[j + 1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {3, 3, 3, 1, 3};
        System.out.println(new Solution6().minNumberInRotateArray(array));
    }

}
