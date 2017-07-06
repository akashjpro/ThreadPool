package com.adida.aka.threadpool;

import android.util.Log;

/**
 * Created by Aka on 7/6/2017.
 */

public class RunPool implements Runnable {
    int id;
    private static final String TAG = "TAG";
    public RunPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        Log.d(TAG, "Dang Xu ly tien trinh " + id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "Da xu ly xong!!!" + id);
    }

}
