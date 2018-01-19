package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите пример:");
        System.out.println("1 Гонки потоков");
        System.out.println("2");
        System.out.println("3");
        System.out.print("пример:");
        int mode = in.nextInt();

        switch (mode) {
            case 1:
                RaceThreads.Start();
                break;
            case 2:
            case 3:
            default:
                System.out.println("Недопустимое значение");
                break;
        }

    }
}
