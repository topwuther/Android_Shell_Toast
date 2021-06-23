package com.shell.toast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.Toast

class ToastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val data : String? = intent?.getStringExtra("msg")
        val toast :Toast = Toast.makeText(context,data,Toast.LENGTH_SHORT)
        if (intent != null) {
            when (intent.getStringExtra("d")){
                "short"->{
                    toast.duration = Toast.LENGTH_SHORT
                }
                "long"->{
                    toast.duration = Toast.LENGTH_LONG
                }
            }
        }
        toast.show()
    }
}