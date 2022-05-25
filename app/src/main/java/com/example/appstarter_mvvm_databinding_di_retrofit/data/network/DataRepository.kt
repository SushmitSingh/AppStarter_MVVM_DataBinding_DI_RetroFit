package com.example.appstarter_mvvm_databinding_di_retrofit.data.network
import com.example.appstarter_mvvm_databinding_di_retrofit.data.network.remote.ApiRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataRepository @Inject constructor(apiRepository: ApiRepository) : DataRepoHelper {
    private val apiRepository: ApiRepository
    fun getApiRepository(): ApiRepository {
        return apiRepository
    }

    init {
        this.apiRepository = apiRepository
    }
}