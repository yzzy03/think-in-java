package com.axatp.test.thead;

/**
 * Created by zhangzhongxia on 2017/12/24.
 */
public class BaseThead {

    public static void main(String[] args){

        for(int i=0;i<5;i++){
            Thread thread  = new Thread(new Counter(10));
            thread.start();

        }

        System.out.println("main thread !");

    }


}
