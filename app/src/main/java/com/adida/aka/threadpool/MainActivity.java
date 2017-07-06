package com.adida.aka.threadpool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayBlockingQueue<Runnable> queueThread = new ArrayBlockingQueue<Runnable>(10);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, queueThread);
        for (int i =0; i<10; i++){
            poolExecutor.execute(new RunPool(i));
        }

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i =0; i<20; i++){
//            executorService.execute(new RunPool(i));
//        }
//        try {
//            executorService.awaitTermination(1, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        executorService.shutdown();
    }
}
