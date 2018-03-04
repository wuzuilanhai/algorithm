package com.biubiu;

/**
 * 把字符串转换成整数
 *
 * @author 张海彪
 * @create 2018-03-04 下午9:02
 */
public class Solution49 {

    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        int number = 0;
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (chars[i] == '-') {
                    flag = true;
                    continue;
                }
                if (chars[i] == '+') continue;
            }
            if (chars[i] < '0' || chars[i] > '9') {
                return 0;
            }
            number = number * 10 + (chars[i] - 48);
        }
        return flag ? -number : number;
    }

    public static void main(String[] args) {
        System.out.println(new Solution49().StrToInt("+1a33"));
    }

}
