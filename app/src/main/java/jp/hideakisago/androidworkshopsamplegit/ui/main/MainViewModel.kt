package jp.hideakisago.androidworkshopsamplegit.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View
import timber.log.Timber

class MainViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData()

    fun onButtonClick(v: View) {
        Timber.d("onButtonClick")
        text.value = "onButtonClick"
    }
}
