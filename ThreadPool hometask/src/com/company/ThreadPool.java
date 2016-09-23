package com.company;

import java.util.LinkedList;

/**
 * Created by palen on 22.09.2016.
 */
public class ThreadPool {
    private final int threadPoolSize;
    private final PoolWorker[] threads;
    private static LinkedList threadsQueue;

    public ThreadPool(int poolSize) {
        if (poolSize >= 0) this.threadPoolSize = poolSize;
        else throw new IllegalArgumentException("Wrong thread pool's size");
        threadsQueue = new LinkedList();
        threads = new PoolWorker[threadPoolSize];
        for (int i = 0; i < threadPoolSize; i++) {
            threads[i]=new PoolWorker();
            threads[i].start();
        }
    }
    public void execute(Runnable r){
        synchronized (threadsQueue){
            threadsQueue.addLast(r);
            threadsQueue.notify();
        }
    }

    public ThreadPool(PoolWorker[] threads) {
        this.threads = threads;
        this.threadPoolSize = 0;
    }

    public class PoolWorker extends Thread {
        @Override
        public void run() {
            Runnable r;


            while(true){
                synchronized (threadsQueue){
                    while(threadsQueue.isEmpty()){
                        try {
                            threadsQueue.wait();
                        } catch (InterruptedException ignored) {}
                    }
                    r=(Runnable) threadsQueue.removeFirst();
                }
                try {
                    r.run();
                } catch (RuntimeException e) {
                }
            }
        }
    }

}
