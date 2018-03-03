package com.biubiu;

/**
 * 数组中的逆序对
 *
 * @author 张海彪
 * @create 2018-03-03 下午10:04
 */
public class Solution35 {

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        int count = parse(array, copy, 0, array.length - 1);
        return count;
    }

    private int parse(int[] array, int[] copy, int start, int end) {
        if (start == end) return 0;
        int mid = (start + end) >> 1;
        int leftCount = parse(array, copy, start, mid) % 1000000007;
        int rightCount = parse(array, copy, mid + 1, end) % 1000000007;
        int count = 0;
        int i = mid;
        int j = end;
        int loc = end;
        while (i >= start && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[loc--] = array[i--];
                if (count > 1000000007) {
                    count %= 1000000007;
                }
            } else {
                copy[loc--] = array[j--];
            }
        }
        for (; i >= start; i--) {
            copy[loc--] = array[i];
        }
        for (; j > mid; j--) {
            copy[loc--] = array[j];
        }
        for (int s = start; s <= end; s++) {
            array[s] = copy[s];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(new Solution35().InversePairs(array));
    }

}
