package com.yqy.jetpack2.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.yqy.jetpack2.R
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        btn_to_page_4.setOnClickListener {
            Navigation.findNavController(this, R.id.my_nav_host_fragment).navigate(R.id.action_page4)
        }
    }
}
