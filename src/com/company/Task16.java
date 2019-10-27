package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("task17file.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
