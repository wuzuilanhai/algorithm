package com.biubiu.offer;

/**
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution1 {

    /**
     * 二维数组中的查找,左下角开始查找
     *
     * @param target
     * @param array
     * @return
     */
    public boolean find(int target, int[][] array) {
        if (array == null) return false;
        int i = array.length - 1;
        int j = 0;
        int k = array[0].length - 1;
        while (true) {
            if (i < 0 || j > k) return false;
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                i--;
                continue;
            } else {
                j++;
                continue;
            }
        }
    }

}
