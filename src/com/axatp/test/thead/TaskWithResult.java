package com.axatp.test.thead;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by zhangzhongxia on 2017/12/27.
 */
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id){
        this.id=id;
    }

    @Override
    public String call() throws Exception {
        if(id==3){
//            Thread.currentThread().wait(5000);
            Thread.sleep(10000);
        }
        if(id==4){
//            Thread.currentThread().wait(5000);
            Thread.sleep(5000);
        }
        return "The result is "+id;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<String>> result = new ArrayList<Future<String>>();

        for(int i=0;i<5;i++) {
            result.add(es.submit(new TaskWithResult(i))) ;
        }

        es.shutdown();

        System.out.println("main thread is runnning!");
        for(Future f:result){
            System.out.println(f.get());
        }
        System.out.println("main thread is runnning  end!");
    }
}
