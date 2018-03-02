package com.biubiu.offer;

/**
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution12 {

    public double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        double result = 1D;
        for (int i = 0; i < (exponent < 0 ? -exponent : exponent); i++) {
            result = result * base;
        }
        return exponent < 0 ? 1 / result : result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution12().Power(2, -3));
    }

}
