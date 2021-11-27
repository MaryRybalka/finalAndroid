package com.example.menu.ui.chill

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChillViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Chill Zone"
    }
    val text: LiveData<String> = _text
}