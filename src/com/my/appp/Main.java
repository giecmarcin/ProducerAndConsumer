package com.my.appp;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws Exception {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(100);

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);


        new Thread(producer).start();
        new Thread(consumer).start(); //1 consumer
        new Thread(new Consumer(blockingQueue)).start(); //2 consumer
        new Thread(new Consumer(blockingQueue)).start(); //3 consumer
        new Thread(new Consumer(blockingQueue)).start(); //4 consumer
        new Thread(new Consumer(blockingQueue)).start(); //5 consumer
        Thread.sleep(4000);
    }
}
