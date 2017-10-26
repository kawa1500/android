package com.example.bartek.firstapplication.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Bartek on 26.10.2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("OnRecive in reciver"+ context.toString() + "|" + intent.toString());
    }
}
