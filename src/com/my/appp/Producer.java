package com.my.appp;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Marcin on 07.11.2016.
 */
public class Producer implements Runnable {
    private BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int number = 0;
            try {
                number = random.nextInt(50);
                System.out.println("Produced: " + number);
                blockingQueue.put(number);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
