package com.company;

/**
 * Created by palen on 24.09.2016.
 */
public class FirstTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Falling asleeep "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException e) {
        }
        System.out.println("Awake "+Thread.currentThread().getName());
    }
}
