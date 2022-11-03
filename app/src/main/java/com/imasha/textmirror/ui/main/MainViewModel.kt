package com.imasha.textmirror.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _text = MutableLiveData<String>().apply {
        value = ""
    }

    val text: LiveData<String> get() = _text

    fun update(text: String) {
        _text.value = text
    }

}