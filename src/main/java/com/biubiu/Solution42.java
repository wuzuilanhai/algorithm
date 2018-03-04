package com.biubiu;

import java.util.ArrayList;

/**
 * 和为S的两个数字
 *
 * @author 张海彪
 * @create 2018-03-04 上午11:11
 */
public class Solution42 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        new Solution42().FindNumbersWithSum(array, 21);
    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array == null || array.length <= 1) return result;
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                result.add(array[i]);
                result.add(array[j]);
                return result;
            } else if (array[i] + array[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

}
