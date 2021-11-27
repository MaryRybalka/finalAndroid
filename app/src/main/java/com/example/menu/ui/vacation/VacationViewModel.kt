package com.example.menu.ui.vacation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VacationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Vacation Zone"
    }
    val text: LiveData<String> = _text
}