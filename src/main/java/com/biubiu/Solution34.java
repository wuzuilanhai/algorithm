package com.biubiu;

import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 *
 * @author 张海彪
 * @create 2018-03-03 下午9:25
 */
public class Solution34 {

    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Integer count = characters.get(chars[i]);
            if (count == null) {
                characters.put(chars[i], 1);
            } else {
                characters.put(chars[i], ++count);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (characters.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution34().FirstNotRepeatingChar("google"));
    }

}
