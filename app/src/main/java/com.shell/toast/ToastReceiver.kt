package com.shell.toast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ToastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val data : String? = intent?.getStringExtra("msg")
        Toast.makeText(context,data,Toast.LENGTH_SHORT).show()
    }
}