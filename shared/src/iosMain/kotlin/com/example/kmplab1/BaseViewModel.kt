package com.example.kmplab1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

actual open class BaseViewModel {
    actual val scope = CoroutineScope(Dispatchers.Main)
}