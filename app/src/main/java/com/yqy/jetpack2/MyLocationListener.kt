package com.yqy.jetpack2

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @desc
 * @author derekyan
 * @date 2019/3/30
 */
class MyLocationListener: LifecycleObserver {
    val TAG = this.javaClass.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.e(TAG, "onStart()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.e(TAG, "onResume()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.e(TAG, "onStop()")
    }
}