package com.biubiu;

import java.util.stream.Stream;

/**
 * @author 张海彪
 * @create 2018-02-11 下午9:37
 */
public class Practice04 {

    private static char[] str = "1234".toCharArray();

    public static void main(String[] args) {
        permutation(0, str.length - 1);
    }

    /**
     * 字符串的全排列
     *
     * @param from 开始位置
     * @param to   结束位置
     */
    private static void permutation(int from, int to) {
        if (from == to) {
            Stream.of(str).forEach(s -> System.out.print(s));
            System.out.println();
            return;
        }
        for (int i = from; i <= to; i++) {
            swap(i, from);
            permutation(from + 1, to);
            swap(i, from);
        }
    }

    private static void swap(int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
