package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("thread One run");
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("thread Two run");
    }
}