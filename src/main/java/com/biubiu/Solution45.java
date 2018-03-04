package com.biubiu;

import java.util.HashSet;

/**
 * 扑克牌顺子
 *
 * @author 张海彪
 * @create 2018-03-04 下午3:02
 */
public class Solution45 {

    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length <= 4) return false;
        HashSet<Integer> sets = new HashSet<>();
        int min = 14;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                if (sets.contains(numbers[i])) {
                    return false;
                } else {
                    if (numbers[i] < min) min = numbers[i];
                    if (numbers[i] > max) max = numbers[i];
                    sets.add(numbers[i]);
                }
            }
        }
        if (max == min) return true;
        if (max - min > 4) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 1, 6};
        System.out.println(new Solution45().isContinuous(numbers));
    }

}
