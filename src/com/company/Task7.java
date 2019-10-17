package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int X = 3;
        final int Y = 4;
        final int Z = 5;
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (X == number || Y == number || Z == number) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет");
        }
    }
}
