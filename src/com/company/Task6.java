package com.company;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = (a + b + c) /3.0;
        System.out.println("Среднее арифметическое: " + d);


        int e = (int) d / 2 ;

        System.out.println("Среднее арифметическое деленное на 2 без остатка: " + e);
        if (e > 3){
            System.out.println("Программа выполнена корректно");
        }
    }

}
