package com.company;

import java.io.*;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) throws IOException {

        File file = new File("task17file.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;


        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
            count++;
        }

        Scanner scanner1 = new Scanner(System.in);

        FileWriter fw = new FileWriter("task17file.txt", false);

        for (int i = 0; i <= count; i++) {
            System.out.println("Введите строку для записи в файл: ");
            fw.write(scanner1.nextLine() + "\n");
        }
        fw.close();

    }
}
