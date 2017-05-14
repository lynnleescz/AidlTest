package com.example.lynnlee.remoteservice;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by lynnlee on 2017/5/14.
 */

public class RemoteService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBind();
    }

    @Override
    public void onCreate() {
        Log.i("lynnleescz", "远程服务创建！");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.i("lynnleescz", "远程服务销毁！");
        super.onDestroy();
    }

    class MyBind extends IService.Stub {
        @Override
        public void callRemote() {
            Log.i("lynnleescz", "调用了远程服务！");
        }
    }
}
