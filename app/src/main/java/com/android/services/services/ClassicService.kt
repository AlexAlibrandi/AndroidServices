package com.android.services.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

open class ClassicService : Service() {

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("classic","Classic service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("classic","Classic service is started")
        Log.d("classic",Thread.currentThread().name)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("classic","Classic service is stopped")
    }
}