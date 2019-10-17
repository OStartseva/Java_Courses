package com.company;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a + b + c) /3;

        System.out.println(d);

        int e = d / 2 ;

        if (e > 3){
            System.out.println("Программа выполнена корректно");
        }
    }

}
