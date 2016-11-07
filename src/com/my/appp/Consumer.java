package com.my.appp;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Marcin on 07.11.2016.
 */
public class Consumer implements Runnable {
    private BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            System.out.println("Consumed: " + blockingQueue.take());
            System.out.println("Consumed: " + blockingQueue.take());
            System.out.println("Consumed: " + blockingQueue.take());
            System.out.println("Consumed: " + blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
