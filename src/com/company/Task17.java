package com.company;

import java.io.*;

public class Task17 {
    public static void main(String[] args) throws IOException {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите данные для записи в файл. Для останови записи введите \"стоп\"");

        FileWriter fw = new FileWriter("task17file.txt");

        {
            do {
                str = br.readLine();

                if (str.compareTo("стоп") == 0){
                    fw.close();
                    break;
                }
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        }
    }
}