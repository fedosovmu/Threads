package com.company;

import java.util.concurrent.Semaphore;

public class Counter {
    static Semaphore semaphore = new Semaphore(2);

    public void Start() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            ThreadCounter thread = new ThreadCounter(i);
            thread.start();
        }
    }


    static class ThreadCounter extends Thread {
        int number;

        ThreadCounter (int number) {
            this.number = number;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Counter: " + number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }
    }
}


