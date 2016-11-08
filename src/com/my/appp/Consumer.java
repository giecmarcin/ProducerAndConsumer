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
        while (true) {
            try {
                if (blockingQueue.isEmpty()) {
                    System.out.println("I m waiting for produce");
                } else {
                    System.out.println("Consumed: " + blockingQueue.take());
                    Thread.sleep(4000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
