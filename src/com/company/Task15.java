package com.company;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");

        int[] arr = new int[scanner.nextInt()];

        System.out.println("Заполните массив :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);

        System.out.println("Сортированный массив во возрастанию: ");
        for (int a : arr) {
            System.out.println(a);
        }
    }

    static void swap(int[] a, int left, int right) {
        if (left != right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
    }
}
