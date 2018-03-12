package com.biubiu;

/**
 * @author 张海彪
 * @create 2018-03-12 下午9:58
 */
public class KMP {

    public static int[] getNext(String str) {
        char[] chars = str.toCharArray();
        int[] next = new int[chars.length];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < chars.length - 1) {
            if (j == -1 || chars[i] == chars[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public static int kmp(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int len1 = c1.length;
        int len2 = c2.length;
        if (len1 < len2) return -1;
        int[] next = getNext(s2);
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (j == -1 || c1[i] == c2[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == len2) {
            return i - j;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(kmp("ededcadas", "ededa"));
    }

}
