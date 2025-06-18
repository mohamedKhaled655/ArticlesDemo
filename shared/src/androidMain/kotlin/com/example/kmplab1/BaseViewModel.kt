package com.example.kmplab1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

actual open class BaseViewModel : ViewModel(){
    actual val scope = viewModelScope
}