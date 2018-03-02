package com.biubiu.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 变态跳台阶
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution9 {

    Map<Integer, Integer> cache = new HashMap<>();

    public int JumpFloorII(int target) {
        return 1<<--target;
    }

    public static void main(String[] args) {
        System.out.println(new Solution9().JumpFloorII(3));
    }

}
