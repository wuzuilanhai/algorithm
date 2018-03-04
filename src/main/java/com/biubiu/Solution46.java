package com.biubiu;

import java.util.LinkedList;

/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 *
 * @author 张海彪
 * @create 2018-03-04 下午3:24
 */
public class Solution46 {

//    public int LastRemaining_Solution(int n, int m) {
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(i);
//        }
//        int bt = 0;
//        while (list.size() > 1) {
//            bt = (bt + m - 1) % list.size();
//            list.remove(bt);
//        }
//        return list.size() == 1 ? list.get(0) : -1;
//    }

    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        if (n == 1) return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }

    public static void main(String[] args) {
        System.out.println(new Solution46().LastRemaining_Solution(6, 7));
    }

}
