package com.example.ifood

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel(){
    private val _price = MutableLiveData<Double>()
    val price: LiveData<Double> = _price

    fun setprice(price: Double){
        _price.value = price
    }
}