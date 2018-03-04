package com.biubiu;

/**
 * 表示数值的字符串
 *
 * @author 张海彪
 * @create 2018-03-04 下午11:17
 */
public class Solution53 {

    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }

}
