package com.biubiu;

/**
 * 不用加减乘除做加法
 *
 * @author 张海彪
 * @create 2018-03-04 下午8:41
 */
public class Solution48 {

    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }

}
