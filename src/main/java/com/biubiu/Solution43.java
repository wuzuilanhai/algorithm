package com.biubiu;

/**
 * 左旋转字符串
 *
 * @author 张海彪
 * @create 2018-03-04 上午11:39
 */
public class Solution43 {

    public String LeftRotateString(String str, int n) {
        if (str == null) return "";
        int len = str.length();
        if (len == 0) return "";
        n %= len;
        char[] chars = str.toCharArray();
        String head = new String(chars, n, len - n);
        String tail = new String(chars, 0, n);
        return head + tail;
    }

    public static void main(String[] args) {
        System.out.println(new Solution43().LeftRotateString("abcXYZdef", 12));
    }

}
