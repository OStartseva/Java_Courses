package com.company;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс: ");

        double rate = scanner.nextDouble();

        System.out.println("Введите количество рублей: ");

        double count = scanner.nextDouble();

        double res = count / rate;
        System.out.println(Math.round(res*100)/100.0d);
    }
}
