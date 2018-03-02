package com.biubiu.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution7 {

    Map<Integer, Integer> map = new HashMap();

    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            map.put(n, n);
            return n;
        }
        Integer a = map.get(n - 1);
        Integer b = map.get(n - 2);
        if (a != null && b != null) {
            return a + b;
        }
        int result = Fibonacci(n - 1) + Fibonacci(n - 2);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution7().Fibonacci(5));
    }

}
