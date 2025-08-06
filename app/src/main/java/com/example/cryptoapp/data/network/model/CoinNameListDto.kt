package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinNameListDto (
    @SerializedName("Data")
    @Expose
    val data: List<CoinNameContainerDto>? = null
)
