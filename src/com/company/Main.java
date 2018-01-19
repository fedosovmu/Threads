package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите пример:");
        System.out.println("1 Гонки потоков");
        System.out.println("2 DeadLock");
        System.out.println("3 Семафор");
        System.out.print("пример:\n");
        //int mode = in.nextInt();
        int mode = 3;

        switch (mode) {
            case 1:
                RaceThreads.Start();
                break;
            case 2:
                DeadLock.Start();
                break;
            case 3:
                new Counter().Start();
                break;
            default:
                System.out.println("Недопустимое значение");
                break;
        }

    }
}
