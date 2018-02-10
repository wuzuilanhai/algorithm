package com.biubiu;

/**
 * @author 张海彪
 * @create 2018-02-10 下午2:15
 */
public class Practice01 {

    public static void main(String[] args) {
        System.out.println(maxSubLength(new int[]{1, 2, 3, -1, 0, 9}));
    }

    /**
     * 最大子数组
     *
     * @param arr
     * @return
     */
    private static int maxSubLength(int[] arr) {
        int result = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sum > 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }

}
