package com.epam.vm.hello;

import static com.epam.vm.hello.MatrixUtil.multiply;

public class Runner {
    public static void main(String[] args) {

        Matrix A = new Matrix(5, 2);
        Matrix B = new Matrix(3, 5);

        System.out.println("Matrix A = " + A + "\nMatrix B = " + B + "\nA*B = " + multiply(A, B));
    }
}