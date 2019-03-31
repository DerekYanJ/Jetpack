package com.yqy.jetpack2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yqy.jetpack2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var myLocationListener: MyLocationListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("Test", "User", 11)

        myLocationListener = MyLocationListener()

        lifecycle.addObserver(myLocationListener)

    }

    fun intentSecond(v: View){
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
