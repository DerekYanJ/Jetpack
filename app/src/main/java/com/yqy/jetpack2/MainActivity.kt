package com.yqy.jetpack2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.yqy.jetpack2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myLocationListener: MyLocationListener
    private lateinit var model: MyViewModel
    private var number = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("Test", "User", 11)

        myLocationListener = MyLocationListener()

        lifecycle.addObserver(myLocationListener)

        model = this.run {
            ViewModelProviders.of(this).get(MyViewModel::class.java)
        }
        model.strs.observe(this, Observer<String> {
            Log.e("ss",it)
            tv.text = it
        })

    }

    fun intentSecond(v: View){
        number++
        model.strChange(number.toString())
//        startActivity(Intent(this, SecondActivity::class.java))

    }
}
