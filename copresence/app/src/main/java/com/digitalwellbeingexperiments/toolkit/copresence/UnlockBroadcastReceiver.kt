package com.digitalwellbeingexperiments.toolkit.copresence

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

object UnlockBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        println(intent.action)
        if (intent.action == Intent.ACTION_SCREEN_ON)
        {
            println("enter")

            val intent1 = Intent(context.applicationContext, MainActivity::class.java)
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.applicationContext.startActivity(intent1)
        }
    }


}
