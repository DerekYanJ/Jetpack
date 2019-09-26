package com.yqy.jetpack2.navigation

import android.content.Context
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
        println("onCreateView page 1")
        return inflater.inflate(R.layout.fragment_main_page1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_intent2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page2)
        }
        println("onViewCreated page 1")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("onAttach page 1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate page 1")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("onActivityCreated page 1")
    }

    override fun onStart() {
        super.onStart()
        println("onStart page 1")
        activity?.let {
            println(Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.navigatorName)
            println( (Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.id == R.id.page1Fragment) )
            println( (Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.id == R.id.page2Fragment) )
        }
    }

    override fun onResume() {
        super.onResume()
        println("onResume page 1")
    }

    override fun onPause() {
        super.onPause()
        println("onPause page 1")
    }

    override fun onStop() {
        super.onStop()
        println("onStop page 1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("onDestroyView page 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy page 1")
    }

    override fun onDetach() {
        super.onDetach()
        println("onDetach page 1")
    }

}
class MainPage2Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        println("onCreateView page 2")
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
        println("onViewCreated page 2")
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("onAttach page 2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate page 2")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("onActivityCreated page 2")
    }

    override fun onStart() {
        super.onStart()
        println("onStart page 2")
        activity?.let {
            println("fragment page 2")
            println(Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.navigatorName)
            println( (Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.id == R.id.page2Fragment) )
        }

    }

    override fun onResume() {
        super.onResume()
        println("onResume page 2")
    }

    override fun onPause() {
        super.onPause()
        println("onPause page 2")
    }

    override fun onStop() {
        super.onStop()
        println("onStop page 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("onDestroyView page 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy page 2")
    }

    override fun onDetach() {
        super.onDetach()
        println("onDetach page 2")
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

    override fun onStart() {
        super.onStart()
        activity?.let {
            println("fragment page 3")
            println(Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.navigatorName)
            println( (Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.id == R.id.page3Fragment) )
        }
    }
}
class MainPage4Fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btn_back_page_2.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }

    override fun onStart() {
        super.onStart()
        activity?.let {
            println("fragment page 4")
            println(Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.navigatorName)

            println( (Navigation.findNavController(it, R.id.my_nav_host_fragment).currentDestination?.id == R.id.page4Fragment) )
        }
    }
}