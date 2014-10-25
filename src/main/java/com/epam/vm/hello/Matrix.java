package com.epam.vm.hello;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.toString;

public class Matrix {
    private int[][] values;
    private int m, n;

    public Matrix(int m, int n) {
        this.values = new int[m][n];
        for (m = 1; m < values.length; m++) {
            for (n = 1; n < values[0].length; n++) {
                Random rnd = new Random();
                values[m][n] = rnd.nextInt(6) + 5;

            }
        }
    }

    public int getRowCount() {
        return values.length;
    }

    public int getColumnCount() {
        return values[0].length;
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "values=" + Arrays.deepToString(values) +
                '}';
    }
}
