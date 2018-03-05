package com.biubiu.offer;

/**
 * 字符流中第一个不重复的字符
 * Created by zhanghaibiao on 2018/3/5.
 */
public class Solution54 {

    int[] hash = new int[256];
    StringBuilder sb = new StringBuilder();

    public void Insert(char ch) {
        sb.append(ch);
        if (hash[ch] == 0) hash[ch] = 1;
        else hash[ch] += 1;
    }

    public char FirstAppearingOnce() {
        char[] chars = sb.toString().toCharArray();
        for (char c : chars) {
            if (hash[c] == 1) return c;
        }
        return '#';
    }

}
