package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Заполните массив: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        //Сортировка вставками
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}