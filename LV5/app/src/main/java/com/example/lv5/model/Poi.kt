package com.example.lv5.model

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class Poi(
    @DocumentId val id: String = "",
    @ServerTimestamp val createdAt: Date = Date(),
    val name:String = "",
    val address:String = "",
)
