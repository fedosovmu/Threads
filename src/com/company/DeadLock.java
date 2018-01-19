package com.company;

import java.util.concurrent.locks.Lock;

public class DeadLock {
    public static void Start() {
        Object lockA = new Object();
        Object lockB = new Object();


    }
}

class ThreadA extends Thread {
    Object lockA, lockB;

    ThreadA (Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        System.out.println("thread A run");
        synchronized (lockA) {
            System.out.println("thread A lock A");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { }
            synchronized (lockB) {
                System.out.println("thread A lock B");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) { }
            }
        }
    }
}

class ThreadB extends Thread {
    Object lockA, lockB;

    ThreadB (Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        System.out.println("thread B run");
        synchronized (lockB) {
            System.out.println("thread B lock B");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { }
            synchronized (lockA) {
                System.out.println("thread B lock A");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) { }
            }
        }
    }
}