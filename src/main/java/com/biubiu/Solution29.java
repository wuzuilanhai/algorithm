package com.biubiu.offer;

import java.util.ArrayList;

/**
 * 最小的K个数
 * Created by zhanghaibiao on 2018/3/2.
 */
public class Solution29 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length) return result;
        for (int len = k / 2 - 1; len >= 0; len--) {
            adjustMaxHeapSort(input, len, k - 1);
        }
        int tmp;
        for (int i = k; i < input.length; i++) {
            if (input[i] < input[0]) {
                tmp = input[0];
                input[0] = input[i];
                input[i] = tmp;
                adjustMaxHeapSort(input, 0, k - 1);
            }
        }
        for (int j = 0; j < k; j++) {
            result.add(input[j]);
        }
        return result;
    }

    private void adjustMaxHeapSort(int[] input, int pos, int length) {
        int temp;
        int child;
        for (temp = input[pos]; 2 * pos + 1 <= length; pos = child) {
            child = 2 * pos + 1;
            if (child < length && input[child] < input[child + 1]) {
                child++;
            }
            if (input[child] > temp) {
                input[pos] = input[child];
            } else {
                break;
            }
        }
        input[pos] = temp;
    }

}
