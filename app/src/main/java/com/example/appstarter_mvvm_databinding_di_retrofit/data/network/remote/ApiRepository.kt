package com.example.appstarter_mvvm_databinding_di_retrofit.data.network.remote
import com.example.appstarter_mvvm_databinding_di_retrofit.data.network.remote.client.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiRepository @Inject constructor(apiService: ApiService) : ApiDataSource {
    private val apiService: ApiService

    init {
        this.apiService = apiService
    }
}