package com.example.yggdrasil.recievebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

       //pull my leg
        Toast.makeText(context, "Broadcast Recived", Toast.LENGTH_SHORT).show();

    }
}
