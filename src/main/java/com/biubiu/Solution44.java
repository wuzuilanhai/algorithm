package com.biubiu;

/**
 * 翻转单词顺序列
 *
 * @author 张海彪
 * @create 2018-03-04 上午11:50
 */
public class Solution44 {

    public String ReverseSentence(String str) {
        if (str == null || str == " ") return str;
        int len = str.length();
        if (len == 0) return "";
        String[] strings = str.split(" ");
        if (strings.length == 0) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution44().ReverseSentence(" "));
    }

}
