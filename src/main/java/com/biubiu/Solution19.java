package com.biubiu.offer;

import java.util.ArrayList;

/**
 * Created by zhanghaibiao on 2018/3/1.
 */
public class Solution19 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) return null;
        ArrayList<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0) return result;
        int left = 0, top = 0, right = col - 1, bottom = row - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) result.add(matrix[top][i]);
            for (int i = top + 1; i <= bottom; i++) result.add(matrix[i][right]);
            if (top != bottom)
                for (int i = right - 1; i >= left; i--) result.add(matrix[bottom][i]);
            if (left != right)
                for (int i = bottom - 1; i > top; i--) result.add(matrix[i][left]);
            left++;
            top++;
            right--;
            bottom--;
        }
        return result;
    }

}
