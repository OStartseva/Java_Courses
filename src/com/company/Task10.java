package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Заполните матрицу: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        System.out.println("Значения из первой строки матрицы: ");
        for (int i = 0; i < col; i ++){
            int result = matrix[0][i];
            System.out.println(result * 3);
        }
    }
}
