package com.biubiu;

import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 *
 * @author 张海彪
 * @create 2018-03-04 上午10:48
 */
public class Solution41 {

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if (sum <= 0) return result;
        for (int i = 1; i < (sum + 1) >> 1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            doFindContinuousSequence(list, i, sum);
        }
        return result;
    }

    private void doFindContinuousSequence(ArrayList<Integer> list, int i, int sum) {
        if (sum < 0) {
            return;
        } else if (sum == 0) {
            result.add(list);
        } else {
            list.add(i);
            doFindContinuousSequence(list, i + 1, sum - i);
        }
    }

    public static void main(String[] args) {
        new Solution41().FindContinuousSequence(100);
    }

}
