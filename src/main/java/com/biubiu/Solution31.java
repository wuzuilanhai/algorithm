package com.biubiu.offer;

/**
 * 整数中1出现的次数（从1到n整数中1出现的次数）
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution31 {

    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 0) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getNumber(i);
        }
        return sum;
    }

    private int getNumber(int number) {
        int count = 0;
        while (number != 0) {
            if (number % 10 == 1) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

}
