package jp.hideakisago.androidworkshopsamplegit.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import android.view.View

class MainViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData()

    fun onButtonClick(v: View) {
        Log.d("MainViewModel", "onButtonClick")
        text.value = "onButtonClick"
    }
}
