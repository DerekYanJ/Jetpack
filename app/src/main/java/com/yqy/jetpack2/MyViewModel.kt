package com.yqy.jetpack2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @desc
 * @author derekyan
 * @date 2019/4/15
 */
class MyViewModel: ViewModel() {
    val strs = MutableLiveData<String>()

    fun strChange(str: String){
        strs.value = str
    }
}