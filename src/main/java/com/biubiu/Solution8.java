package com.biubiu.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 跳台阶
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution8 {

    Map<Integer, Integer> map = new HashMap();

    public int JumpFloor(int n) {
        if (n == 0 || n == 1 || n == 2) {
            map.put(n, n);
            return n;
        }
        Integer a = map.get(n - 1);
        Integer b = map.get(n - 2);
        if (a != null && b != null) {
            return a + b;
        }
        int result = JumpFloor(n - 1) + JumpFloor(n - 2);
        map.put(n, result);
        return result;
    }

}
