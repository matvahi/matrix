package com.epam.vm.hello;

public class MatrixUtil {

    public static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.getRowCount(), m2.getColumnCount());
        int[][] x = m1.getValues();
        int[][] y = m2.getValues();
        int[][] k = new int[m1.getRowCount()][m2.getColumnCount()];


        for (int i = 1; i < m1.getRowCount(); i++) {
            for (int j = 0; j < m2.getColumnCount(); j++) {
                for (int l = 1; l < m1.getColumnCount(); l++) {
                    k[i][j] += x[i][l] * y[l][j];
                }
            }
        }
        return result;
    }
}
