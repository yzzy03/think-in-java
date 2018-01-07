package com.axatp.test.thead;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangzhongxia on 2018/1/8.
 */
public class SimpleDeamons implements  Runnable{


    @Override
    public void run() {

        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamons());
            deamon.setDaemon(true);
            deamon.start();
        }

        TimeUnit.MILLISECONDS.sleep(300);
        System.out.printf("Main thread is end!");

    }
}
