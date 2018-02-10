package com.biubiu;

import java.util.Arrays;

/**
 * @author 张海彪
 * @create 2018-02-10 下午3:13
 */
public class Practice02 {

    public static void main(String[] args) {
        System.out.println(minEditDistance(new char[]{'a', 'b'}, new char[]{'a', 'b', 'c'}));
    }

    /**
     * 两个字符串间大最小编辑距离，如ab->abc，则为1
     *
     * @param a
     * @param b
     * @return
     */
    private static int minEditDistance(char[] a, char[] b) {
        int aLen = a.length;
        int bLen = b.length;
        //dp[i][j]表示从a[0-i)到b[0,j)的编辑距离
        int[][] dp = new int[aLen + 1][bLen + 1];
        for (int i = 1; i <= aLen; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= bLen; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + min(new int[]{dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]});
                }
            }
        }
        return dp[aLen][bLen];
    }

    private static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

}
