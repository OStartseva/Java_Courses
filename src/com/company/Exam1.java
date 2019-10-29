package com.company;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число в бинарном формате: ");
        String input = scanner.nextLine();

        binaryToInt(input);

    }

    private static void binaryToInt(String str) {
        int sum = 0, a;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }
        System.out.println("Введенное число в десятичном формате: " + sum);
    }
}
