package com.yqy.jetpack2.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.yqy.jetpack2.R
import kotlinx.android.synthetic.main.fragment_main_page1.view.*
import kotlinx.android.synthetic.main.fragment_main_page2.view.*
import kotlinx.android.synthetic.main.fragment_main_page3.view.*

/**
 * @desc
 * @author derekyan
 * @date 2019-09-24
 */
class MainPage1Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_intent2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page2)
        }
    }
}
class MainPage2Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_intent3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page3)
        }
        view.btn_back_page_1.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }
}
class MainPage3Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_back_page_2.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }
}