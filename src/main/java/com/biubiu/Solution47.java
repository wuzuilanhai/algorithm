package com.biubiu;

/**
 * 求1+2+3+...+n
 *
 * @author 张海彪
 * @create 2018-03-04 下午4:33
 */
public class Solution47 {

    public int Sum_Solution(int n) {
        if (n <= 1) return n;
        return Sum_Solution(n - 1) + n;
    }

}
