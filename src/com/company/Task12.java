package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку : ");
        String string = scanner.nextLine();
        System.out.println("Введенная строка без пробелов: " + string.replaceAll(" ", ""));
    }
}
