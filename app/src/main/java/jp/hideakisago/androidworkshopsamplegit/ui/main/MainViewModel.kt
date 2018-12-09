package jp.hideakisago.androidworkshopsamplegit.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData()
}
