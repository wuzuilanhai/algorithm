package com.biubiu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 把数组排成最小的数
 *
 * @author 张海彪
 * @create 2018-03-03 下午12:39
 */
public class Solution32 {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        ArrayList<String> list = new ArrayList<>();
        doPrintMinNumber(numbers, 0, list);
        Collections.sort(list);
        return list.get(0);
    }

    private void doPrintMinNumber(int[] numbers, int i, ArrayList<String> result) {
        if (i == numbers.length - 1) {
            StringBuilder sb = new StringBuilder();
            for (int number : numbers) {
                sb.append(number);
            }
            if (!result.contains(sb.toString())) {
                result.add(sb.toString());
            }
        } else {
            for (int j = i; j < numbers.length; j++) {
                swap(numbers, i, j);
                doPrintMinNumber(numbers, i + 1, result);
                swap(numbers, i, j);
            }
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

}
