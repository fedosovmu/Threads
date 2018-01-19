package com.company;

public class RaceThreads {
    public static void Start() {
        Resourse resourse = new Resourse();

        ThreadOne one = new ThreadOne(resourse);
        one.start();

        ThreadTwo two = new ThreadTwo(resourse);
        Thread thread2 = new Thread(two);
        thread2.start();

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) { }
        System.out.println(resourse.Counter + " / " + 2000000);
    }

}

class ThreadOne extends Thread {
    private Resourse _resourse;

    ThreadOne (Resourse ressourse) {
        _resourse = ressourse;
    }

    @Override
    public void run() {
        System.out.println("thread One run");
        for (int i = 0; i < 1000000; i++)
            // Решается с помощью synchronized (_resourse)
            _resourse.Counter++;
        }
    }
}

class ThreadTwo implements Runnable {
    private Resourse _resourse;

    ThreadTwo (Resourse resourse) {
        _resourse = resourse;
    }

    @Override
    public void run() {
        System.out.println("thread Two run");
        for (int i = 0; i < 1000000; i++) {
            _resourse.Counter++;
        }
    }
}

class Resourse {
    public int Counter = 0;
}