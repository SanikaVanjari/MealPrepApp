package com.practice.mealprepapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LatestRecipeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Latest Recipe Fragment"
    }
    val text: LiveData<String> = _text
}