package com.example.lv5.ui.screen.addpoi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EditViewModel: ViewModel() {
    var name: String by mutableStateOf("")
    var address:String by mutableStateOf("")
    fun reset() {
        name = ""
        address = ""
    }
}
