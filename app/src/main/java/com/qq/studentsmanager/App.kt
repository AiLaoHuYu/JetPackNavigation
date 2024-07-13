package com.qq.studentsmanager

import android.app.Application

class App : Application() {

    companion object {
        private var instance: App? = null

        @Synchronized
        fun get(): App {
            if (null == instance) instance = App()
            return instance as App
        }
    }

    override fun onCreate() {
        super.onCreate()
    }

}