package com.example.appstarter_mvvm_databinding_di_retrofit.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appstarter_mvvm_databinding_di_retrofit.data.network.DataRepository

abstract class BaseViewModel(dataRepository: DataRepository) : ViewModel() {
    private val dataRepository: DataRepository
    private val isLoading: MutableLiveData<Boolean>
    fun getIsLoading(): MutableLiveData<Boolean> {
        return isLoading
    }

    fun setIsLoading(isLoading: Boolean) {
        this.isLoading.setValue(isLoading)
    }

    fun getDataRepository(): DataRepository {
        return dataRepository
    }

    init {
        this.dataRepository = dataRepository
        isLoading = MutableLiveData<Boolean>(true)
    }
}