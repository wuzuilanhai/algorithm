package com.biubiu;

/**
 * 正则表达式匹配
 *
 * @author 张海彪
 * @create 2018-03-04 下午10:31
 */
public class Solution52 {

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        int strIndex = 0;
        int patternIndex = 0;
        return match(str, strIndex, pattern, patternIndex);
    }

    private boolean match(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (str.length == strIndex && pattern.length == patternIndex) return true;
        if (str.length != strIndex && pattern.length == patternIndex) return false;
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
                return match(str, strIndex, pattern, patternIndex + 2) || match(str, strIndex + 1, pattern, patternIndex + 2) || match(str, strIndex + 1, pattern, patternIndex);
            } else {
                return match(str, strIndex, pattern, patternIndex + 2);
            }
        }
        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
            return match(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }

}
