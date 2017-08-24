package com.example.mlab.hackaton12;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mlab on 8/24/2017.
 */

public class Message {

    public static void   message(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
