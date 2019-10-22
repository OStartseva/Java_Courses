package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        System.out.println("Заполните массив целыми числами: ");
        for (int i = 0; i < arrayLength; i++){
            arr[i] = scanner.nextInt();
        }

        for (int num : arr) {
            System.out.println(num + " умножить на 2 = " + num * 2);
        }
    }
}
