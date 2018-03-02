package com.biubiu.offer;

/**
 * 数组中出现次数超过一半的数字
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution28 {

    /**
     * 采用阵地攻守的思想：
     * 第一个数字作为第一个士兵，守阵地；count = 1；
     * 遇到相同元素，count++;
     * 遇到不相同元素，即为敌人，同归于尽,count--；当遇到count为0的情况，又以新的i值作为守阵地的士兵，继续下去，到最后还留在阵地上的士兵，有可能是主元素。
     * 再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0;
        int count = 1;
        int exist = array[0];
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                exist = array[i];
            }
            if (exist == array[i]) {
                count++;
            } else {
                count--;
            }
        }
        if (count == 0) return 0;
        count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == exist) {
                count++;
            }
        }
        if (count > array.length >>> 1) {
            return exist;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new Solution28().MoreThanHalfNum_Solution(array));
    }

}
