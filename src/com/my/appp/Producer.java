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
        Random random = new Random();
        int number = 0;
        try {
            for(int i=0; i<4; i++){
                number = random.nextInt(50);
                System.out.println("Produced: " + number);
                blockingQueue.put(number);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
