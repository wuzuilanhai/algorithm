package com.biubiu.offer;

/**
 * 二进制中1的个数
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution11 {

    public int NumberOf1(int n) {
        int m = n;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >>> i & 1) == 1) {
                result++;
            }
            n = m;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution11().NumberOf1(4));
    }

}
