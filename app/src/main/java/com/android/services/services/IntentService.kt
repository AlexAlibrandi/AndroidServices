package com.android.services.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class IntentService : JobIntentService() {

    override fun onHandleWork(intent: Intent) {
        Log.d("intent","Job IntentService has started")
        Log.d("intent",Thread.currentThread().name)
    }

    companion object {

        fun myBackgroundService(context: Context, intent: Intent) {
            enqueueWork(context, IntentService::class.java, 1, intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("intent","Job intent service has stopped")
    }
}