package com.example.aliouswang.custom_view_kata

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ARouter.openLog()
        ARouter.openDebug()

        ARouter.init(this)
    }

}