package com.example.bartek.firstapplication.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Bartek on 26.10.2017.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("Ibinder service "+intent.toString());
        return null;
    }
}
