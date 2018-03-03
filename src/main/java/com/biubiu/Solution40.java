package com.biubiu;

/**
 * 数组中只出现一次的数字
 *
 * @author 张海彪
 * @create 2018-03-04 上午1:02
 */
public class Solution40 {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2) return;
        int xor = array[0];
        for (int i = 1; i < array.length; i++) {
            xor ^= array[i];
        }
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor >>> i & 1) == 1) {
                index = i;
                break;
            }
        }
        int[] tmp1 = new int[array.length];
        int[] tmp2 = new int[array.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (judge(array[i], index)) {
                tmp1[j++] = array[i];
            } else {
                tmp2[k++] = array[i];
            }
        }
        int a = tmp1[0];
        int b = tmp2[0];
        for (int i = 1; i < j; i++) a ^= tmp1[i];
        for (int i = 1; i < k; i++) b ^= tmp2[i];
        num1[0] = a;
        num2[0] = b;
    }

    private boolean judge(int num, int index) {
        if ((num >>> index & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] b = new int[1];
        int[] c = new int[1];
        new Solution40().FindNumsAppearOnce(a, b, c);
    }

}
