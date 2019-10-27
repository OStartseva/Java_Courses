package com.company;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку A : ");
        String a = scanner.nextLine();

        System.out.println("Введите строку B : ");
        String b = scanner.nextLine();

        if (a.length() > b.length()){
            System.out.println("Самая длинная строка: " + a);
        } else if (b.length() > a.length()){
            System.out.println("Самая длинная строка: " + b);
        } else System.out.println("Длина строк одинакова");


    }
}
