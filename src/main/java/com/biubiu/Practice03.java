package com.biubiu;

import java.util.stream.Stream;

/**
 * @author 张海彪
 * @create 2018-02-11 下午7:23
 */
public class Practice03 {

    public static void main(String[] args) {
        char[] s = new char[]{'a', 'b', 'c'};
        int len = s.length;
        leftRotateString(s, len, 2);
        Stream.of(s).forEach(item -> System.out.print(item));
    }

    /**
     * 左循环移位几位，公式=(xy)'=(x'y')'
     *
     * @param s 目标字符数组
     * @param n 字符数组长度
     * @param m 左移位数
     */
    private static void leftRotateString(char[] s, int n, int m) {
        m %= n;
        reverseString(s, 0, m - 1);
        reverseString(s, m, n - 1);
        reverseString(s, 0, n - 1);
    }

    private static void reverseString(char[] s, int from, int to) {
        while (from < to) {
            char t = s[from];
            s[from++] = s[to];
            s[to--] = t;
        }
    }

}
