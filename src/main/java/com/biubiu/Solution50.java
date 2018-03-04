package com.biubiu;

import java.util.HashSet;

/**
 * 数组中重复的数字
 *
 * @author 张海彪
 * @create 2018-03-04 下午9:26
 */
public class Solution50 {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length == 0) return false;
        HashSet<Integer> sets = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (sets.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                sets.add(numbers[i]);
            }
        }
        return false;
    }

}
