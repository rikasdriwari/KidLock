package com.kidlock.app

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LockService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null
    
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Timer logic goes here
        return START_STICKY
    }
}
