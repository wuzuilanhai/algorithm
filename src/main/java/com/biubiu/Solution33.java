package com.biubiu;

/**
 * 丑数
 *
 * @author 张海彪
 * @create 2018-03-03 下午1:03
 */
public class Solution33 {

//    1 2 3 4 5 6 8 9 10

    public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int[] result = new int[index];
        result[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < index; i++) {
            result[i] = min(result[a] * 2, min(result[b] * 3, result[c] * 5));
            if (result[i] == result[a] * 2) a++;
            if (result[i] == result[b] * 3) b++;
            if (result[i] == result[c] * 5) c++;
        }
        return result[index - 1];
    }

    private int min(int s1, int s2) {
        if (s1 < s2) return s1;
        return s2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution33().GetUglyNumber_Solution(8));
    }

}
