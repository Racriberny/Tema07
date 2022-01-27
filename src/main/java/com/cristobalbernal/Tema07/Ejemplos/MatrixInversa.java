package com.cristobalbernal.Tema07.Ejemplos;

import com.cristobalbernal.Tema07.Lib.Lib;

import java.util.Arrays;

public class MatrixInversa {
    public static final int NUM_ROW = 2;
    public static final int NUM_COL = 2;
    public static void main(String[] args) {
        int[][] matrix = new int[NUM_ROW][NUM_COL];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }
        Lib.visulizarMatrix(matrix);
    }
}
