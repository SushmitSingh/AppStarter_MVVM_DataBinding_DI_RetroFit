package com.example.appstarter_mvvm_databinding_di_retrofit.base

import android.view.View

interface BaseItemListener<T> {
    fun onItemClick(view: View?, item: T)
}