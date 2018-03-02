package com.biubiu.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的排列
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution27 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null && str.length() == 0) return list;
        char[] chars = str.toCharArray();
        doPermutation(list, 0, chars);
        Collections.sort(list);
        return list;
    }

    private void doPermutation(ArrayList<String> list, int i, char[] chars) {
        if (i == chars.length - 1) {
            String str = new String(chars);
            if (!list.contains(str)) {
                list.add(str);
            }
        } else {
            for (int j = i; j < chars.length; j++) {
                swap(chars, i, j);
                doPermutation(list, i + 1, chars);
                swap(chars, i, j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

}
