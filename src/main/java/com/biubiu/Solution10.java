package com.biubiu.offer;

/**
 * 矩形覆盖
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution10 {

    public int RectCover(int target) {
        if (target == 0 || target == 1) return target;
        return RectCover(target-1)+RectCover(target-2);
    }

}
