package com.biubiu.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 替换空格
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution2 {

    public String replaceSpace(StringBuffer str) {
        if (str == null) return null;
        char[] chars = str.toString().toCharArray();
        List<Character> list = new LinkedList<>();
        for (char c : chars) {
            if (c == ' ') {
                list.add('%');
                list.add('2');
                list.add('0');
            } else {
                list.add(c);
            }
        }
        char[] chars1 = new char[list.size()];
        for (int i = 0, len = list.size(); i < len; i++) {
            chars1[i] = list.get(i);
        }
        return new String(chars1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().replaceSpace(new StringBuffer("We  Are Happy")));
    }

}
