package com.axatp.test.thead;

/**
 * Created by zhangzhongxia on 2017/12/23.
 */
public class Counter implements  Runnable {

    private int count = 0;

    public Counter(int count){
        this.count = count;
    }

    @Override
    public void run() {

        while (count <= 20) {
            System.out.println(Thread.currentThread().getName()+":"+count);
            Thread.yield();
            count++;
        }

    }

    public static void main(String[] args){
        new Counter(5).run();
    }
}
